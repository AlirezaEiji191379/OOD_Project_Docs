package content.entities;

public class MusicEntity {
    private int contentId;
    private String artistName;
    private int length;
    private FileEntity file;
    private String musicText;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public FileEntity getFile() {
        return file;
    }

    public void setFile(FileEntity file) {
        this.file = file;
    }

    public String getMusicText() {
        return musicText;
    }

    public void setMusicText(String musicText) {
        this.musicText = musicText;
    }
}
