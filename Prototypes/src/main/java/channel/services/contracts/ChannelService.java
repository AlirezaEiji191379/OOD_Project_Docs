package channel.services.contracts;

import channel.context.ChannelRequest;
import core.library.context.Response;

public interface ChannelService {
    Response showChannelsList();
    Response createChannel(String name);

    Response editChannelDetails(ChannelRequest request);
    Response deleteChannel(int channelId);
}
