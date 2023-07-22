package org.example.user.repositories;

import org.example.user.entities.UserEntity;

public interface UserRepository {
    UserEntity findById(int userId);

    void save(UserEntity userEntity);
    void delete(UserEntity entity);
}
