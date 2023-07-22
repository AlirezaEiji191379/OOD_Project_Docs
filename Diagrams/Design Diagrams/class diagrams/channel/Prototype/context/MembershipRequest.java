package org.example.channel.context;

import java.util.Map;

public class MembershipRequest {
    private int[] adminIds;
    private int[] memberIds;

    private int channelId;
    private Map<Integer, Double> incomeShares;

    public int[] getAdminIds() {
        return adminIds;
    }

    public void setAdminIds(int[] adminIds) {
        this.adminIds = adminIds;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int[] getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(int[] memberIds) {
        this.memberIds = memberIds;
    }

    public Map<Integer, Double> getIncomeShares() {
        return incomeShares;
    }

    public void setIncomeShares(Map<Integer, Double> incomeShares) {
        this.incomeShares = incomeShares;
    }
}
