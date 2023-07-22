package org.example.content.models;

import org.example.content.entities.ContentMetaDataEntity;
import org.example.content.entities.MusicEntity;
import org.example.content.repositories.MusicRepository;

public class MusicModel extends ContentModel {

    private final MusicRepository musicRepository;
    private MusicEntity music;

    public MusicModel(ContentMetaDataEntity contentMetaData, MusicRepository musicRepository) {
        super(contentRepository, metaDataRepository, contentMetaData);
        this.musicRepository = musicRepository;
    }

    @Override
    public String showNormal() {
        return new MusicRepository().find(this.contentMetaData.getContentId()).getFile().getFilePath();
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
        this.music = new MusicRepository().find(this.content.getId());
    }

    @Override
    public void delete() {

    }
}
