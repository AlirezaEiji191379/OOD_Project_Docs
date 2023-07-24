package channel.repositories.contracts;

import channel.entities.ChannelMemberEntity;
import channel.entities.enums.Role;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class ChannelMembersRepository extends BaseRepository<ChannelMemberEntity> {

    protected ChannelMembersRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract ChannelMemberEntity find(int userId, int channelId, Role ...roles);
    public abstract ChannelMemberEntity findByUserIdAndChannelId(int userId, int channelId);
    public abstract ChannelMemberEntity[] findByChannelId(int channelId);
    public abstract ChannelMemberEntity[] findByMemberId(int memberId);
    public abstract ChannelMemberEntity[] findByChannelIdAndRole(int channelId, Role ...roles);
}
