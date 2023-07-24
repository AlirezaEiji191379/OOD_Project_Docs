package core.contracts;

public class ContentDetailsContract {
    private int contentId;
    private int channelId;
    private String title;
    private String description;
    private String type;

    public ContentDetailsContract() {
    }

    public int getContentId() {
        return contentId;
    }

    public int getChannelId() {
        return channelId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}
