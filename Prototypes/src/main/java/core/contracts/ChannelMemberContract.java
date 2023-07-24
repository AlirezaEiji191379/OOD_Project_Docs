package core.contracts;

public class ChannelMemberContract {
    private int channelId;
    private int memberId;
    private String role;

    public int getChannelId() {
        return channelId;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getRole() {
        return role;
    }
}
