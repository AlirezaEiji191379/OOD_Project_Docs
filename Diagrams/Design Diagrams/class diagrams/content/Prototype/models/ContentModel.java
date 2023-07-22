package org.example.content.models;

import org.example.channel.ChannelFacade;
import org.example.content.entities.ContentEntity;
import org.example.content.entities.ContentMetaDataEntity;
import org.example.content.repositories.ContentMetaDataRepository;
import org.example.content.repositories.ContentRepository;

import java.util.List;

public abstract class ContentModel {

    protected final ContentRepository contentRepository;
    protected final ContentMetaDataRepository metaDataRepository;

    protected ContentEntity content;
    protected ContentMetaDataEntity contentMetaData;

    public ContentModel(ContentRepository contentRepository, ContentMetaDataRepository metaDataRepository, ContentMetaDataEntity contentMetaData) {
        this.contentRepository = contentRepository;
        this.metaDataRepository = metaDataRepository;
        this.contentMetaData = contentMetaData;
        this.init();
    }

    public abstract String showNormal();

    public String showPremium(int userId) {
        if (new ChannelFacade(subscriptionService, membershipService).checkAccessToContent(
                userId, this.contentMetaData.getChannelId(), this.contentMetaData.getContentId()
        )) {
            return this.showNormal();
        } else {
            return this.showPreview();
        }
    }

    public abstract String showEditableData();

    protected abstract String showPreview();

    public boolean store(List<String> data) {
        return false;
    }

    protected void init() {
        this.content = new ContentRepository().findById(this.contentMetaData.getContentId());
    }

    public abstract void delete();
}
