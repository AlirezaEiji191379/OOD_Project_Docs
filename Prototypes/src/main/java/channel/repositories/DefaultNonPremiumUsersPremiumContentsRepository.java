package channel.repositories;

import channel.entities.NonPremiumUsersPremiumContentsEntity;
import channel.repositories.contracts.NonPremiumUsersPremiumContentsRepository;
import core.dataAccess.AppDbContext;

public class DefaultNonPremiumUsersPremiumContentsRepository extends NonPremiumUsersPremiumContentsRepository {
    public DefaultNonPremiumUsersPremiumContentsRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public NonPremiumUsersPremiumContentsEntity find(int userId, int contentId) {
        return null;
    }
}
