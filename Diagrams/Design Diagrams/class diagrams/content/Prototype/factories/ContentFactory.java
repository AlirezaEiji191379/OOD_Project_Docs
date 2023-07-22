package org.example.content.factories;

import org.example.content.entities.ContentMetaDataEntity;
import org.example.content.entities.enums.ContentType;
import org.example.content.models.ContentModel;
import org.example.content.models.MusicModel;
import org.example.content.models.TextModel;
import org.example.content.models.VideoModel;

public class ContentFactory {

    private final ContentMetaDataEntity contentMetaData;

    public ContentFactory(ContentMetaDataEntity contentMetaData) {
        this.contentMetaData = contentMetaData;
    }

    public ContentModel create() {
        if (ContentType.TEXT.equals(this.contentMetaData.getType())) {
            return new TextModel(this.contentMetaData, repository);
        } else if (ContentType.MUSIC.equals(this.contentMetaData.getType())) {
            return new MusicModel(this.contentMetaData, musicRepository);
        } else {
            return new VideoModel(this.contentMetaData, videoRepository);
        }
    }
}
