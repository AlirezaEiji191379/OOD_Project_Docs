package org.example.channel.repositories;

import org.example.channel.entities.ChannelEntity;

public interface ChannelRepository {

    ChannelEntity[] findAll();
    ChannelEntity findByName(String name);
    ChannelEntity findByJoinLink(String link);
    ChannelEntity findById(int id);

    void save(ChannelEntity entity);
}
