package content.models;

import channel.ChannelFacade;
import content.entities.ContentMetaDataEntity;
import content.entities.VideoEntity;
import content.models.contracts.ContentModel;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;
import content.repositories.contracts.VideoRepository;

public class VideoModel extends ContentModel {

    private VideoRepository videoRepository;
    private VideoEntity video;

    public VideoModel() {}

    public String showNormal() {
        return videoRepository.findById(this.contentMetaData.getContentId()).getFile().getFilePath();
    }

    @Override
    protected String showPreview() {
        return null;
    }

    @Override
    public String showEditableData() {
        return null;
    }

    @Override
    protected void init() {
        super.init();
        this.video = videoRepository.findById(this.content.getId());
    }

    @Override
    public void delete() {

    }
}
