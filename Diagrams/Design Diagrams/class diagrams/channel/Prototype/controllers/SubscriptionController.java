package org.example.channel.controllers;

import org.example.channel.context.SubscriptionRequest;
import org.example.channel.services.contracts.SubscriptionService;
import org.example.user.context.Response;

public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    public Response addSubscription(SubscriptionRequest request) {
        return subscriptionService.addSubscription(request);
    }

    public Response editSubscription(SubscriptionRequest request) {
        return subscriptionService.editSubscription(request);
    }

    public Response showSubscription(int channelId) {
        return subscriptionService.showSubscription(channelId);
    }

    public Response buySubscription(int subscriptionId) {
        return subscriptionService.buySubscription(subscriptionId);
    }
}
