package user.repositories;

import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;
import user.entities.TokenEntity;
import user.repositories.contracts.TokenRepository;

public class DefaultTokenRepository extends TokenRepository {
    protected DefaultTokenRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public TokenEntity findById(int tokenId) {
        return null;
    }
}
