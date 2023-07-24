package channel.repositories;

import channel.entities.ChannelPremiumUsersEntity;
import channel.repositories.contracts.ChannelPremiumUsersRepository;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

import java.time.LocalDateTime;

public class DefaultChannelPremiumUsersRepository extends ChannelPremiumUsersRepository {

    public DefaultChannelPremiumUsersRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public ChannelPremiumUsersEntity find(int userId, int channelId) {
        return null;
    }

    @Override
    public ChannelPremiumUsersEntity[] findAfterEndDate(LocalDateTime endDate) {
        return null;
    }
}
