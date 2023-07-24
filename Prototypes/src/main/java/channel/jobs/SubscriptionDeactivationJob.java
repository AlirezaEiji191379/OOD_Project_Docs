package channel.jobs;

import channel.entities.ChannelPremiumUsersEntity;
import channel.repositories.contracts.ChannelPremiumUsersRepository;

import java.time.LocalDateTime;

public class SubscriptionDeactivationJob {
    private ChannelPremiumUsersRepository premiumUsersRepository;

    public SubscriptionDeactivationJob() {
    }

    public void deactivate() {
        for (ChannelPremiumUsersEntity channelPremiumUsersEntity : premiumUsersRepository.findAfterEndDate(LocalDateTime.now())) {
            premiumUsersRepository.save(channelPremiumUsersEntity);
        }
    }
}
