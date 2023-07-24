package financial.repositories.contracts;

import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;
import financial.entities.RefundEntity;

public abstract class RefundRepository extends BaseRepository<RefundEntity> {

    protected RefundRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract RefundEntity findByTransactionId(int transactionId);
}
