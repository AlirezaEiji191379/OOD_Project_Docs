package financial.jobs;

import financial.repositories.contracts.RefundRepository;
import financial.repositories.contracts.WalletRepository;
import financial.services.contracts.BankCoordinatorService;
import user.UserFacade;

public class BalanceRefundJob {
    private RefundRepository refundRepository;
    private BankCoordinatorService coordinatorService;
    private UserFacade userFacade;

    public BalanceRefundJob() {}

    public void refund() {
        coordinatorService.callBank(
                userFacade.getCurrentUser().getCardNumber(),
                10
        );
    }
}
