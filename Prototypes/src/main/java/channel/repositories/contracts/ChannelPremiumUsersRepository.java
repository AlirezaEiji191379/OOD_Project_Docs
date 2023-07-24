package channel.repositories.contracts;

import channel.entities.ChannelPremiumUsersEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

import java.time.LocalDateTime;
import java.util.List;

public abstract class ChannelPremiumUsersRepository extends BaseRepository<ChannelPremiumUsersEntity> {

    protected ChannelPremiumUsersRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract ChannelPremiumUsersEntity find(int userId, int channelId);
    public abstract ChannelPremiumUsersEntity[] findAfterEndDate(LocalDateTime endDate);
}
