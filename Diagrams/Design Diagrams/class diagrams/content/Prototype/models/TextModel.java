package org.example.content.models;

import org.example.content.entities.ContentMetaDataEntity;
import org.example.content.entities.TextEntity;
import org.example.content.repositories.TextRepository;

public class TextModel extends ContentModel {

    private final TextRepository repository;
    private TextEntity text;

    public TextModel(ContentMetaDataEntity contentMetaData, TextRepository repository) {
        super(contentRepository, metaDataRepository, contentMetaData);
        this.repository = repository;
    }

    @Override
    public String showNormal() {
        return new TextRepository().find(this.contentMetaData.getContentId()).getValue();
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
        this.text = new TextRepository().find(this.content.getId());
    }

    @Override
    public void delete() {

    }
}
