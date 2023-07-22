package org.example.content.library.strategies;

import org.example.content.entities.MusicEntity;
import org.example.content.repositories.MusicRepository;

public class MusicCreationStrategy implements ContentCreationStrategy {

    private final MusicRepository repository;

    public MusicCreationStrategy(MusicRepository repository) {
        this.repository = repository;
    }

    @Override
    public void generate() {
        new MusicEntity();
    }
}
