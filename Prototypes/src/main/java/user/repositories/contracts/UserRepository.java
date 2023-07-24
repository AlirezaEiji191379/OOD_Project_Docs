package user.repositories.contracts;

import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;
import user.entities.UserEntity;

public abstract class UserRepository extends BaseRepository<UserEntity> {
    public UserRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract UserEntity findById(int userId);
}
