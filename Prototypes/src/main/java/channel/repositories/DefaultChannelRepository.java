package channel.repositories;

import channel.entities.ChannelEntity;
import channel.repositories.contracts.ChannelRepository;
import core.dataAccess.AppDbContext;

public class DefaultChannelRepository extends ChannelRepository {

    public DefaultChannelRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public ChannelEntity[] findAll() {
        return new ChannelEntity[0];
    }

    @Override
    public ChannelEntity findByName(String name) {
        return null;
    }

    @Override
    public ChannelEntity findByJoinLink(String link) {
        return null;
    }

    @Override
    public ChannelEntity findById(int id) {
        return null;
    }
}
