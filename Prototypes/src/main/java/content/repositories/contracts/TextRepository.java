package content.repositories.contracts;

import content.entities.TextEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class TextRepository extends BaseRepository<TextEntity> {

    protected TextRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract TextEntity findById(int id);
}
