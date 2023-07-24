package content.repositories.contracts;

import content.entities.MusicEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class MusicRepository extends BaseRepository<MusicEntity> {

    protected MusicRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract MusicEntity find(int contentId);
}
