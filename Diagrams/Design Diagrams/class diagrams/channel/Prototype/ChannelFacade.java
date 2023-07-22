package org.example.channel;

import org.example.channel.services.contracts.ChannelMembershipService;
import org.example.channel.services.contracts.SubscriptionService;

public class ChannelFacade {

    private final SubscriptionService subscriptionService;
    private final ChannelMembershipService membershipService;

    public ChannelFacade(SubscriptionService subscriptionService, ChannelMembershipService membershipService) {
        this.subscriptionService = subscriptionService;
        this.membershipService = membershipService;
    }

    public boolean checkAccessToContent(int userId, int channelId, int contentId) {
        return subscriptionService.checkContentToShowUser(userId, channelId, contentId);
    }

    public boolean isChannelAdminOrOwner(int userId, int channelId) {
        return membershipService.isAdmin(userId, channelId) || membershipService.isOwner(userId, channelId);
    }
}
