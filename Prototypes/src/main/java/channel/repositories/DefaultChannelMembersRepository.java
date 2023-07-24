package channel.repositories;

import channel.entities.ChannelMemberEntity;
import channel.entities.enums.Role;
import channel.repositories.contracts.ChannelMembersRepository;
import core.dataAccess.AppDbContext;

public class DefaultChannelMembersRepository extends ChannelMembersRepository {

    public DefaultChannelMembersRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public ChannelMemberEntity find(int userId, int channelId, Role... roles) {
        return null;
    }

    @Override
    public ChannelMemberEntity findByUserIdAndChannelId(int userId, int channelId) {
        return null;
    }

    @Override
    public ChannelMemberEntity[] findByChannelId(int channelId) {
        return new ChannelMemberEntity[0];
    }

    @Override
    public ChannelMemberEntity[] findByMemberId(int memberId) {
        return new ChannelMemberEntity[0];
    }

    @Override
    public ChannelMemberEntity[] findByChannelIdAndRole(int channelId, Role... roles) {
        return new ChannelMemberEntity[0];
    }
}
