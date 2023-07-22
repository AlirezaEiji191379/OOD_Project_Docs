package org.example.content.repositories;

import org.example.content.entities.InteractionEntity;

public interface InteractionRepository {

    InteractionEntity find(int id);
    InteractionEntity[] findByContentId(int contentId);
    void save(InteractionEntity entity);
    void delete(InteractionEntity entity);
}
