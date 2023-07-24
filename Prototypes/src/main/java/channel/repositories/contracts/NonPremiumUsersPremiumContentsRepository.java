package channel.repositories.contracts;

import channel.entities.NonPremiumUsersPremiumContentsEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class NonPremiumUsersPremiumContentsRepository extends BaseRepository<NonPremiumUsersPremiumContentsEntity> {

    protected NonPremiumUsersPremiumContentsRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract NonPremiumUsersPremiumContentsEntity find(int userId, int contentId);
}
