package content.models;

import channel.ChannelFacade;
import content.entities.ContentMetaDataEntity;
import content.entities.MusicEntity;
import content.models.contracts.ContentModel;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;
import content.repositories.contracts.MusicRepository;

public class MusicModel extends ContentModel {

    private MusicRepository musicRepository;
    private MusicEntity music;

    public MusicModel() {}


    @Override
    public String showNormal() {
        return musicRepository.find(this.contentMetaData.getContentId()).getFile().getFilePath();
    }

    @Override
    public String showPreview() {
        return null;
    }

    @Override
    public String showEditableData() {
        return null;
    }

    @Override
    protected void init() {
        super.init();
        this.music = musicRepository.find(this.content.getId());
    }

    @Override
    public void delete() {

    }
}
