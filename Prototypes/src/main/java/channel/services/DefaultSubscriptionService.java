package channel.services;

import channel.context.SubscriptionRequest;
import channel.entities.SubscriptionEntity;
import channel.repositories.contracts.ChannelPremiumUsersRepository;
import channel.repositories.contracts.NonPremiumUsersPremiumContentsRepository;
import channel.repositories.contracts.SubscriptionRepository;
import channel.services.contracts.ChannelMembershipService;
import channel.services.contracts.SubscriptionService;
import content.repositories.contracts.ContentMetaDataRepository;
import financial.FinancialFacade;
import core.library.context.Response;
import user.UserFacade;

import java.util.Objects;

public class DefaultSubscriptionService implements SubscriptionService {

    private NonPremiumUsersPremiumContentsRepository contentsRepository;
    private ChannelPremiumUsersRepository premiumUsersRepository;
    private SubscriptionRepository subscriptionRepository;
    private ChannelMembershipService membershipService;
    private FinancialFacade financialFacade;
    private UserFacade userFacade;

    public DefaultSubscriptionService() {}

    @Override
    public boolean checkContentToShowUser(int userId, int channelId, int contentId) {
        return Objects.nonNull(premiumUsersRepository.find(userId, channelId))
                || Objects.nonNull(contentsRepository.find(userId, contentId));
    }

    @Override
    public Response addSubscription(SubscriptionRequest request) {
        subscriptionRepository.save(new SubscriptionEntity());
        return new Response();
    }

    @Override
    public Response editSubscription(SubscriptionRequest request) {
        return null;
    }

    @Override
    public Response showSubscription(int channelId) {
        return null;
    }

    @Override
    public Response buySubscription(int subscriptionId) {
        financialFacade.buy(userFacade.getCurrentUser().getUserId(), 100);
        return null;
    }

    @Override
    public Response buyContent(int contentId) {
        financialFacade.buy(userFacade.getCurrentUser().getUserId(), 100);
        return new Response();
    }
}
