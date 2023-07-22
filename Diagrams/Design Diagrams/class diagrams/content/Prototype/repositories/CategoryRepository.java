package org.example.content.repositories;

import org.example.content.entities.CategoryEntity;

public interface CategoryRepository {
    void save(CategoryEntity entity);
    void delete(CategoryEntity entity);
    CategoryEntity findById(int id);
}
