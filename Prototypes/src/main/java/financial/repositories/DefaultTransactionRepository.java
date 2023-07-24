package financial.repositories;

import core.dataAccess.AppDbContext;
import financial.entities.TransactionEntity;
import financial.repositories.contracts.TransactionRepository;

public class DefaultTransactionRepository extends TransactionRepository {
    public DefaultTransactionRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public TransactionEntity findByBankToken(String token) {
        return null;
    }
}
