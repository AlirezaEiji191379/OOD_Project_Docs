package channel.controllers;

import channel.context.SubscriptionRequest;
import channel.services.contracts.SubscriptionService;
import core.library.context.Response;

public class SubscriptionController {

    private SubscriptionService subscriptionService;

    public SubscriptionController() {
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
