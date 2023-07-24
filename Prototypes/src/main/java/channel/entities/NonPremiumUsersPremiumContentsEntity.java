package channel.entities;

public class NonPremiumUsersPremiumContentsEntity {
    private int userId;
    private int contentId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }
}
