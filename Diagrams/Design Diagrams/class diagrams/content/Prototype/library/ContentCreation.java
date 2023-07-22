package org.example.content.library;

import org.example.content.context.ContentCreationRequest;
import org.example.content.entities.ContentEntity;
import org.example.content.entities.ContentMetaDataEntity;
import org.example.content.library.strategies.ContentCreationStrategy;
import org.example.content.repositories.ContentMetaDataRepository;
import org.example.content.repositories.ContentRepository;

public class ContentCreation {

    private ContentCreationStrategy strategy;
    private final ContentRepository contentRepository;
    private final ContentMetaDataRepository metaDataRepository;

    public ContentCreation(ContentRepository contentRepository, ContentMetaDataRepository metaDataRepository) {
        this.contentRepository = contentRepository;
        this.metaDataRepository = metaDataRepository;
    }

    public void generate(ContentCreationRequest request) {
        new ContentEntity();
        new ContentMetaDataEntity();
        strategy.generate();
    }

    public void setStrategy(ContentCreationStrategy strategy) {
        this.strategy = strategy;
    }
}
