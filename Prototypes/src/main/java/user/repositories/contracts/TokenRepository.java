package user.repositories.contracts;

import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;
import user.entities.TokenEntity;

public abstract class TokenRepository extends BaseRepository<TokenEntity> {
    protected TokenRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract TokenEntity findById(int tokenId);
}
