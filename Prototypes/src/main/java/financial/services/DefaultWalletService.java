package financial.services;

import core.library.context.Response;
import financial.entities.RefundEntity;
import financial.entities.enums.TransactionType;
import financial.repositories.contracts.RefundRepository;
import financial.repositories.contracts.WalletRepository;
import financial.services.contracts.BankCoordinatorService;
import financial.services.contracts.TransactionService;
import financial.services.contracts.WalletService;
import user.UserFacade;

public class DefaultWalletService implements WalletService {
    private WalletRepository walletRepository;
    private RefundRepository refundRepository;
    private TransactionService transactionService;
    private BankCoordinatorService coordinatorService;
    private UserFacade userFacade;

    public DefaultWalletService() {}

    @Override
    public Response chargeWallet(int amount) {
        coordinatorService.callBank(userFacade.getCurrentUser().getCardNumber(), amount);
        return null;
    }

    @Override
    public Response withdraw(int amount) {
        int userId = userFacade.getCurrentUser().getUserId();
        var wallet = walletRepository.findByUserId(userId);
        if (wallet.getBalance() >= amount) {
            wallet.decreaseBalance(amount);
            walletRepository.save(wallet);
            refundRepository.save(new RefundEntity());
            transactionService.createTransaction(amount, userId, TransactionType.REFUND, "", "");
        }
        return new Response();
    }

    @Override
    public Response increaseBalance(int userId, int amount) {
        var wallet = walletRepository.findByUserId(userId);
        wallet.increaseBalance(amount);
        walletRepository.save(wallet);
        return new Response();
    }

}
