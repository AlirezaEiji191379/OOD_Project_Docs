package channel.repositories.contracts;

import channel.entities.ChannelEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class ChannelRepository extends BaseRepository<ChannelEntity> {

    protected ChannelRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract ChannelEntity[] findAll();

    public abstract ChannelEntity findByName(String name);

    public abstract ChannelEntity findByJoinLink(String link);

    public abstract ChannelEntity findById(int id);
}
