package content.factories;

import content.entities.ContentMetaDataEntity;
import content.entities.enums.ContentType;
import content.models.contracts.ContentModel;
import content.models.MusicModel;
import content.models.TextModel;
import content.models.VideoModel;

public class ContentFactory {

    private TextModel textModel;
    private MusicModel musicModel;
    private VideoModel videoModel;

    private ContentMetaDataEntity contentMetaData;

    public ContentFactory(ContentMetaDataEntity contentMetaData) {
        this.contentMetaData = contentMetaData;
    }

    public ContentModel create() {
        if (ContentType.TEXT.equals(this.contentMetaData.getType())) {
            return textModel;
        } else if (ContentType.MUSIC.equals(this.contentMetaData.getType())) {
            return musicModel;
        } else {
            return videoModel;
        }
    }
}
