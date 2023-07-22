package org.example.channel.repositories;

import org.example.channel.entities.SubscriptionEntity;

public interface SubscriptionRepository {
    void save(SubscriptionEntity entity);
    SubscriptionEntity findById(int id);
    SubscriptionEntity findByChannelId(int channelId);
}
