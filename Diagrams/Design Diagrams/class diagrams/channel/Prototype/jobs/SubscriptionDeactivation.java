package org.example.channel.jobs;

import org.example.channel.repositories.ChannelPremiumUsersRepository;

/**
 * @implSpec this is a job and runs at a period of time
 */
public class SubscriptionDeactivation {
    private final ChannelPremiumUsersRepository premiumUsersRepository;

    public SubscriptionDeactivation(ChannelPremiumUsersRepository premiumUsersRepository) {
        this.premiumUsersRepository = premiumUsersRepository;
    }

    public void deactivate() {
        premiumUsersRepository.
    }
}
