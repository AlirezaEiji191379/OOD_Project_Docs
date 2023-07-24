package financial.services;

import core.library.context.Response;
import financial.entities.enums.TransactionStatus;
import financial.services.contracts.BankCoordinatorService;
import financial.services.contracts.TransactionService;
import user.UserFacade;

public class DefaultBankCoordinatorService implements BankCoordinatorService {

    private TransactionService transactionService;
    private UserFacade userFacade;

    public DefaultBankCoordinatorService() {}

    @Override
    public Response ack(String bankToken) {
        transactionService.updateTransactionStatus(bankToken, TransactionStatus.COMPLETED);
        return new Response();
    }

    @Override
    public Response nack(String bankToken) {
        transactionService.updateTransactionStatus(bankToken, TransactionStatus.FAILED);
        return new Response();
    }

    @Override
    public void callBank(String cardNumber, int amount) {

    }
}
