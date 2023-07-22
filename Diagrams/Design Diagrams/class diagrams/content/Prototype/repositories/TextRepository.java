package org.example.content.repositories;

import org.example.content.entities.TextEntity;

public interface TextRepository {
    TextEntity find(int id);
}
