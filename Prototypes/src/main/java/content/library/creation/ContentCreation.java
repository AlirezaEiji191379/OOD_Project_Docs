package content.library.creation;

import content.context.ContentCreationRequest;
import content.entities.ContentEntity;
import content.entities.ContentMetaDataEntity;
import content.library.creation.strategies.ContentCreationStrategy;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;

public class ContentCreation {

    private ContentCreationStrategy strategy;
    private ContentRepository contentRepository;
    private ContentMetaDataRepository metaDataRepository;

    public ContentCreation() {
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
