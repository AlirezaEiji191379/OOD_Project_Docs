package org.example.content.repositories;

import org.example.content.entities.ContentEntity;

public interface ContentRepository {
    ContentEntity findById(int id);
    ContentEntity[] findByIds(int ...ids);
    ContentEntity findByName(String name);
    ContentEntity findByCategoryId(int id);
}
