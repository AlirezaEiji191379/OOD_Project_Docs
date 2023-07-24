package content.repositories.contracts;

import content.entities.InteractionEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class InteractionRepository extends BaseRepository<InteractionEntity> {

    protected InteractionRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract InteractionEntity findById(int id);
    public abstract InteractionEntity[] findByContentId(int contentId);
}
