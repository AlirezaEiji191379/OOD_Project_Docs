package org.example.channel.context;

import org.example.channel.entities.enums.SubscriptionPeriod;

public class SubscriptionRequest {
    private int id;
    private int channelId;
    private SubscriptionPeriod period;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public SubscriptionPeriod getPeriod() {
        return period;
    }

    public void setPeriod(SubscriptionPeriod period) {
        this.period = period;
    }
}
