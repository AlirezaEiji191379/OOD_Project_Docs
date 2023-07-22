package org.example.content.repositories;

import org.example.content.entities.ContentMetaDataEntity;

public interface ContentMetaDataRepository {

    ContentMetaDataEntity findByContentId(int contentId);
    ContentMetaDataEntity[] findByCategoryId(int categoryId);
    ContentMetaDataEntity[] findByChannelId(int channelId);
    void save(ContentMetaDataEntity entity);
}
