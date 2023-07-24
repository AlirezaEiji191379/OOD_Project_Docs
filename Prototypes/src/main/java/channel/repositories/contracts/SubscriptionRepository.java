package channel.repositories.contracts;

import channel.entities.SubscriptionEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class SubscriptionRepository extends BaseRepository<SubscriptionEntity> {

    protected SubscriptionRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract SubscriptionEntity findById(int id);

    public abstract SubscriptionEntity[] findByChannelId(int channelId);
}
