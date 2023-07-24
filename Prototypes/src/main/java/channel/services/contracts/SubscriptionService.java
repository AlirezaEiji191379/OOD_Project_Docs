package channel.services.contracts;

import channel.context.SubscriptionRequest;
import core.library.context.Response;

public interface SubscriptionService {
    boolean checkContentToShowUser(int userId, int channelId, int contentId);

    Response addSubscription(SubscriptionRequest request);
    Response editSubscription(SubscriptionRequest request);
    Response showSubscription(int channelId);
    Response buySubscription(int subscriptionId);
    Response buyContent(int contentId);
}
