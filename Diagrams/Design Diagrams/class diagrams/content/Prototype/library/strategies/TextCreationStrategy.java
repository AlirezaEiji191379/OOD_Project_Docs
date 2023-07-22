package org.example.content.library.strategies;

import org.example.content.entities.TextEntity;
import org.example.content.repositories.TextRepository;

public class TextCreationStrategy implements ContentCreationStrategy {

    private final TextRepository textRepository;

    public TextCreationStrategy(TextRepository textRepository) {
        this.textRepository = textRepository;
    }

    @Override
    public void generate() {
        new TextEntity();
    }
}
