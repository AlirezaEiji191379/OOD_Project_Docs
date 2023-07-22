package org.example.channel.services;

import org.example.channel.context.SubscriptionRequest;
import org.example.channel.repositories.ChannelPremiumUsersRepository;
import org.example.channel.repositories.NonPremiumUsersPremiumContentsRepository;
import org.example.channel.repositories.SubscriptionRepository;
import org.example.channel.services.contracts.SubscriptionService;
import org.example.financial.FinancialFacade;
import org.example.user.context.Response;

import java.util.Objects;

public class DefaultSubscriptionService implements SubscriptionService {

    private final NonPremiumUsersPremiumContentsRepository contentsRepository;
    private final ChannelPremiumUsersRepository premiumUsersRepository;
    private final SubscriptionRepository subscriptionRepository;

    public DefaultSubscriptionService(NonPremiumUsersPremiumContentsRepository contentsRepository, ChannelPremiumUsersRepository premiumUsersRepository, SubscriptionRepository subscriptionRepository) {
        this.contentsRepository = contentsRepository;
        this.premiumUsersRepository = premiumUsersRepository;
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public boolean checkContentToShowUser(int userId, int channelId, int contentId) {
        return Objects.nonNull(premiumUsersRepository.find(userId, channelId))
                || Objects.nonNull(contentsRepository.find(userId, contentId));
    }
    @Override
    public Response addSubscription(SubscriptionRequest request) {
        subscriptionRepository.save();
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
        new FinancialFacade().buy(10, 100);
        return null;
    }

    @Override
    public Response buyContent(int contentId) {
        new FinancialFacade().buy(10, 100);
    }
}
