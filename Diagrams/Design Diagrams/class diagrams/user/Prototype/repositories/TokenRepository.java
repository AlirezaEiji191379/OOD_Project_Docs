package org.example.user.repositories;

import org.example.user.entities.TokenEntity;

public interface TokenRepository {
    TokenEntity findById(int userId);
    TokenEntity findByToken(String token);

    void save(TokenEntity entity);
    void delete(TokenEntity entity);
}
