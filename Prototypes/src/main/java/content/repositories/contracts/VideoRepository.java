package content.repositories.contracts;

import content.entities.VideoEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class VideoRepository extends BaseRepository<VideoEntity> {

    protected VideoRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract VideoEntity findById(int contentId);
}
