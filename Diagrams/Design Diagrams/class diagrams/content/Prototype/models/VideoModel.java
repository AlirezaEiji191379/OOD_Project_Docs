package org.example.content.models;

import org.example.content.entities.ContentMetaDataEntity;
import org.example.content.entities.VideoEntity;
import org.example.content.repositories.VideoRepository;

public class VideoModel extends ContentModel {

    private final VideoRepository videoRepository;
    private VideoEntity video;

    public VideoModel(ContentMetaDataEntity contentMetaData, VideoRepository videoRepository) {
        super(contentRepository, metaDataRepository, contentMetaData);
        this.videoRepository = videoRepository;
    }

    public String showNormal() {
        return new VideoRepository().find(this.contentMetaData.getContentId()).getFile().getFilePath();
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
        this.video = new VideoRepository().find(this.content.getId());
    }

    @Override
    public void delete() {

    }
}
