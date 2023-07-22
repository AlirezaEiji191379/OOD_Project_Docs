package org.example.content.library.strategies;

import org.example.content.entities.VideoEntity;
import org.example.content.repositories.VideoRepository;

public class VideoCreationStrategy implements ContentCreationStrategy {

    private final VideoRepository repository;

    public VideoCreationStrategy(VideoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void generate() {
        new VideoEntity();
    }
}
