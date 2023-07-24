package user.repositories;

import core.dataAccess.AppDbContext;
import user.entities.UserEntity;
import user.repositories.contracts.UserRepository;

public class DefaultUserRepository extends UserRepository {

    public DefaultUserRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public UserEntity findById(int userId) {
        return null;
    }
}
