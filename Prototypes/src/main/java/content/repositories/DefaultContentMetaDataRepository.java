package content.repositories;

import content.entities.ContentEntity;
import content.entities.ContentMetaDataEntity;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;
import core.dataAccess.AppDbContext;

public class DefaultContentMetaDataRepository extends ContentMetaDataRepository {

    public DefaultContentMetaDataRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public ContentMetaDataEntity findByContentId(int contentId) {
        return null;
    }

    @Override
    public ContentMetaDataEntity[] findByCategoryId(int categoryId) {
        return new ContentMetaDataEntity[0];
    }

    @Override
    public ContentMetaDataEntity[] findByChannelId(int channelId) {
        return new ContentMetaDataEntity[0];
    }

}
