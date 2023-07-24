package financial.repositories.contracts;

import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;
import financial.entities.TransactionEntity;

public abstract class TransactionRepository extends BaseRepository<TransactionEntity> {
    protected TransactionRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract TransactionEntity findByBankToken(String token);
}
