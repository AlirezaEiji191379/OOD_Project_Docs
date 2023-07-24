package channel.entities;

import channel.entities.enums.Role;

public class ChannelMemberEntity {
    private int userId;
    private int channelId;
    private Role role;
    private double incomeShare;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public double getIncomeShare() {
        return incomeShare;
    }

    public void setIncomeShare(double incomeShare) {
        this.incomeShare = incomeShare;
    }
}
