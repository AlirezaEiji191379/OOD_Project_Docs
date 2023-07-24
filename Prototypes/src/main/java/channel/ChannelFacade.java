package channel;

import channel.services.contracts.ChannelMembershipService;
import channel.services.contracts.SubscriptionService;

public class ChannelFacade {

    private SubscriptionService subscriptionService;
    private ChannelMembershipService membershipService;

    public ChannelFacade() {
    }

    public boolean checkAccessToContent(int userId, int channelId, int contentId) {
        return subscriptionService.checkContentToShowUser(userId, channelId, contentId);
    }

    public boolean isChannelAdminOrOwner(int userId, int channelId) {
        return membershipService.isAdmin(userId, channelId) || membershipService.isOwner(userId, channelId);
    }
}
