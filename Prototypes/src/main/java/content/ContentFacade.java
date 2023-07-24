package content;

import content.services.contracts.ContentService;
import core.contracts.ContentDetailsContract;
import core.contracts.MusicContract;
import core.contracts.TextContract;
import core.contracts.VideoContract;

public class ContentFacade {

    private ContentService contentService;

    public ContentDetailsContract[] findLatest(int userId) {
        return new ContentDetailsContract[0];
    }
}
