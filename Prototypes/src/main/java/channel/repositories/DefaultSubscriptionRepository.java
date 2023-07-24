package channel.repositories;

import channel.entities.SubscriptionEntity;
import channel.repositories.contracts.SubscriptionRepository;
import core.dataAccess.AppDbContext;

public class DefaultSubscriptionRepository extends SubscriptionRepository {
    public DefaultSubscriptionRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public SubscriptionEntity findById(int id) {
        return null;
    }

    @Override
    public SubscriptionEntity[] findByChannelId(int channelId) {
        return new SubscriptionEntity[0];
    }
}
