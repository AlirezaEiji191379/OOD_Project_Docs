package org.example.channel.repositories;

import org.example.channel.entities.ChannelMemberEntity;
import org.example.channel.entities.enums.Role;

import java.util.List;

public interface ChannelMembersRepository {
    ChannelMemberEntity find(int userId, int channelId, List<Role> roles);
    ChannelMemberEntity findByUserIdAndChannelId(int userId, int channelId);
    ChannelMemberEntity findByChannelId(int channelId);
    void delete(int userId, int channelID);
    List<ChannelMemberEntity> findByChannelIdAndRole(int channelId, List<Role> roles);
    boolean save(ChannelMemberEntity entity);
}
