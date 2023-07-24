package financial.repositories;

import core.dataAccess.AppDbContext;
import financial.entities.RefundEntity;
import financial.repositories.contracts.RefundRepository;

public class DefaultRefundRepository extends RefundRepository {
    public DefaultRefundRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public RefundEntity findByTransactionId(int transactionId) {
        return null;
    }
}
