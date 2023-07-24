package financial.services;

import financial.entities.TransactionEntity;
import financial.entities.enums.RefundStatus;
import financial.entities.enums.TransactionStatus;
import financial.entities.enums.TransactionType;
import financial.repositories.contracts.RefundRepository;
import financial.repositories.contracts.TransactionRepository;
import financial.services.contracts.TransactionService;
import financial.services.contracts.WalletService;

import java.time.LocalDateTime;
import java.util.UUID;

public class DefaultTransactionService implements TransactionService {

    private TransactionRepository transactionRepository;
    private WalletService walletService;
    private RefundRepository refundRepository;

    public DefaultTransactionService() {}


    @Override
    public void createTransaction(int amount, int userId, TransactionType type, String source, String dest) {
        var transaction = new TransactionEntity(
                amount,
                userId,
                type,
                LocalDateTime.now(),
                source,
                dest
        );
        transaction.setStatus(TransactionStatus.WAITING);
        transaction.setBankToken(UUID.randomUUID().toString());
        transactionRepository.save(transaction);
    }

    @Override
    public void updateTransactionStatus(String bankToken, TransactionStatus status) {
        var transaction = transactionRepository.findByBankToken(bankToken);
        transaction.setStatus(status);
        if (transaction.getType().equals(TransactionType.REFUND)) {
            if (status.equals(TransactionStatus.FAILED)) {
                transaction.setStatus(TransactionStatus.WAITING);
            } else {
                var refund = refundRepository.findByTransactionId(transaction.getId());
                refund.setStatus(RefundStatus.COMPLETED);
                refundRepository.save(refund);
            }
        }
        if (transaction.getType().equals(TransactionType.CHARGE)) {
            walletService.increaseBalance(transaction.getUserId(), transaction.getAmount());
        }
        transactionRepository.save(transaction);
    }
}
