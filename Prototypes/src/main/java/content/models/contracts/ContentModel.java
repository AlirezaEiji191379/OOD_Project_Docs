package content.models.contracts;

import channel.ChannelFacade;
import content.entities.ContentEntity;
import content.entities.ContentMetaDataEntity;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;

import java.util.List;

public abstract class ContentModel {

    protected ContentRepository contentRepository;
    protected ContentMetaDataRepository metaDataRepository;
    protected ChannelFacade channelFacade;

    protected ContentEntity content;
    protected ContentMetaDataEntity contentMetaData;

    public ContentModel() {}

    public abstract String showNormal();

    public String showPremium(int userId) {
        if (channelFacade.checkAccessToContent(
                userId, this.contentMetaData.getChannelId(), this.contentMetaData.getContentId()
        )) {
            return this.showNormal();
        } else {
            return this.showPreview();
        }
    }

    public abstract String showEditableData();

    public abstract String showPreview();

    public boolean store(List<String> data) {
        return false;
    }

    protected void init() {
        this.content = contentRepository.findById(this.contentMetaData.getContentId());
    }

    public abstract void delete();
}
