package financial.controllers;

import core.library.context.Response;
import financial.services.contracts.BankCoordinatorService;
import financial.services.contracts.WalletService;

public class FinancialController {

    private WalletService walletService;
    private BankCoordinatorService coordinatorService;

    public FinancialController() {}

    public Response chargeWallet(int amount) {
        return walletService.chargeWallet(amount);
    }
    public Response withdraw(int amount) {
        return walletService.withdraw(amount);
    }

    public Response bankAck(String bankToken) {
        return coordinatorService.ack(bankToken);
    }

    public Response bankNack(String bankToken) {
        return coordinatorService.nack(bankToken);
    }
}
