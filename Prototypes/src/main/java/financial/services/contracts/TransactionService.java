package financial.services.contracts;

import financial.entities.enums.TransactionStatus;
import financial.entities.enums.TransactionType;

public interface TransactionService {
    void createTransaction(int amount, int userId, TransactionType type, String source, String dest);

    void updateTransactionStatus(String bankToken, TransactionStatus status);
}
