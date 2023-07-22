package org.example.channel.services.contracts;

import org.example.channel.context.ChannelRequest;
import org.example.user.context.Response;

public interface ChannelService {
    Response showChannelsList();
    Response createChannel(String name);

    Response editChannelDetails(ChannelRequest request);
    Response deleteChannel(int channelId);
}
