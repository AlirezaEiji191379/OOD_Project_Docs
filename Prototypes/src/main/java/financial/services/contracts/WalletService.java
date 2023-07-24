package financial.services.contracts;

import core.library.context.Response;

public interface WalletService {

    Response chargeWallet(int amount);
    Response withdraw(int amount);

    Response increaseBalance(int userId, int amount);
}
