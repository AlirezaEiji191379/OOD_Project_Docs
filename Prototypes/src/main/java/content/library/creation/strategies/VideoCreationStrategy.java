package content.library.creation.strategies;

import content.entities.VideoEntity;
import content.repositories.contracts.VideoRepository;

public class VideoCreationStrategy implements ContentCreationStrategy {

    private VideoRepository repository;

    public VideoCreationStrategy() {
    }

    @Override
    public void generate() {
        new VideoEntity();
    }
}
