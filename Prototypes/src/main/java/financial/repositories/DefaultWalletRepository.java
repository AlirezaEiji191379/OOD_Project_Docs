package financial.repositories;

import core.dataAccess.AppDbContext;
import financial.entities.WalletEntity;
import financial.repositories.contracts.WalletRepository;

public class DefaultWalletRepository extends WalletRepository {
    public DefaultWalletRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public WalletEntity findByUserId(int userId) {
        return null;
    }
}
