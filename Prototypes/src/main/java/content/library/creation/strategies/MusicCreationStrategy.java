package content.library.creation.strategies;

import content.entities.MusicEntity;
import content.repositories.contracts.MusicRepository;

public class MusicCreationStrategy implements ContentCreationStrategy {

    private MusicRepository repository;

    public MusicCreationStrategy() {
    }

    @Override
    public void generate() {
        new MusicEntity();
    }
}
