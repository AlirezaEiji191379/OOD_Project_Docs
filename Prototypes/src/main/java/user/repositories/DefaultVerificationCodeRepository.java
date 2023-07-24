package user.repositories;

import core.dataAccess.AppDbContext;
import user.entities.TokenEntity;
import user.entities.VerificationCodeEntity;
import user.repositories.contracts.TokenRepository;
import user.repositories.contracts.VerificationCodeRepository;

public class DefaultVerificationCodeRepository extends VerificationCodeRepository {
    protected DefaultVerificationCodeRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public VerificationCodeEntity findByUserId(int userId) {
        return null;
    }
}
