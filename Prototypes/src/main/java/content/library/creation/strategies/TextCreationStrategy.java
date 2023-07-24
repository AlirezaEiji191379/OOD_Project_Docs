package content.library.creation.strategies;

import content.entities.TextEntity;
import content.repositories.contracts.TextRepository;

public class TextCreationStrategy implements ContentCreationStrategy {

    private TextRepository textRepository;

    public TextCreationStrategy() {
    }

    @Override
    public void generate() {
        new TextEntity();
    }
}
