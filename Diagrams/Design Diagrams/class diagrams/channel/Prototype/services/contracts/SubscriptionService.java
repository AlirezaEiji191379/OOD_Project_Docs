package org.example.channel.services.contracts;

import org.example.channel.context.SubscriptionRequest;
import org.example.user.context.Response;

public interface SubscriptionService {
    boolean checkContentToShowUser(int userId, int channelId, int contentId);

    Response addSubscription(SubscriptionRequest request);
    Response editSubscription(SubscriptionRequest request);
    Response showSubscription(int channelId);
    Response buySubscription(int subscriptionId);
    Response buyContent(int contentId);
}
