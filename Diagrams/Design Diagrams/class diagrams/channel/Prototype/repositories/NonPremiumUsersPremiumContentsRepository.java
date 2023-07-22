package org.example.channel.repositories;

import org.example.channel.entities.NonPremiumUsersPremiumContentsEntity;

public interface NonPremiumUsersPremiumContentsRepository {
    NonPremiumUsersPremiumContentsEntity find(int userId, int contentId);
}
