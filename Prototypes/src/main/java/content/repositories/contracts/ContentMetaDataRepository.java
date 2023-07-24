package content.repositories.contracts;

import content.entities.ContentMetaDataEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class ContentMetaDataRepository extends BaseRepository<ContentMetaDataEntity> {

    protected ContentMetaDataRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract ContentMetaDataEntity findByContentId(int contentId);
    public abstract ContentMetaDataEntity[] findByCategoryId(int categoryId);
    public abstract ContentMetaDataEntity[] findByChannelId(int channelId);
}
