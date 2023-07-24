package user.repositories.contracts;

import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;
import user.entities.TokenEntity;
import user.entities.VerificationCodeEntity;

public abstract class VerificationCodeRepository extends BaseRepository<VerificationCodeEntity> {
    protected VerificationCodeRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract VerificationCodeEntity findByUserId(int userId);
}
