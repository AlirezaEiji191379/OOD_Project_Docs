package content.repositories.contracts;

import content.entities.SubtitleEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class SubtitleRepository extends BaseRepository<SubtitleEntity> {
    protected SubtitleRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract SubtitleEntity findById(int id);
}
