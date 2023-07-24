package content.models;

import channel.ChannelFacade;
import content.entities.ContentMetaDataEntity;
import content.entities.TextEntity;
import content.models.contracts.ContentModel;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;
import content.repositories.contracts.TextRepository;

public class TextModel extends ContentModel {

    private TextRepository textRepository;
    private TextEntity text;

    public TextModel() {}

    @Override
    public String showNormal() {
        return textRepository.findById(this.contentMetaData.getContentId()).getValue();
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
        this.text = textRepository.findById(this.content.getId());
    }

    @Override
    public void delete() {

    }
}
