package content.entities;

public class VideoEntity {
    private int contentId;
    private int length;
    private SubtitleEntity subtitle;
    private FileEntity file;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public SubtitleEntity getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(SubtitleEntity subtitle) {
        this.subtitle = subtitle;
    }

    public FileEntity getFile() {
        return file;
    }

    public void setFile(FileEntity file) {
        this.file = file;
    }
}
