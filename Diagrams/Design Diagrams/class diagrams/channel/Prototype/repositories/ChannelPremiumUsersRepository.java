package org.example.channel.repositories;

import org.example.channel.entities.ChannelPremiumUsersEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface ChannelPremiumUsersRepository {
    ChannelPremiumUsersEntity find(int userId, int channelId);
    List<ChannelPremiumUsersEntity> findAfterEndDate(LocalDateTime endDate);
}
