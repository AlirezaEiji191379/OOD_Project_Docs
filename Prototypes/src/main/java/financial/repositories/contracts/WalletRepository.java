package financial.repositories.contracts;

import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;
import financial.entities.WalletEntity;

public abstract class WalletRepository extends BaseRepository<WalletEntity> {

    protected WalletRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract WalletEntity findByUserId(int userId);
}
