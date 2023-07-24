package financial.services.contracts;

import core.library.context.Response;

public interface BankCoordinatorService {
    Response ack(String bankToken);

    Response nack(String bankToken);

    void callBank(String cardNumber, int amount);
}
