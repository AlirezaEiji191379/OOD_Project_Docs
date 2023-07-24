package content.repositories.contracts;

import content.entities.ContentEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class ContentRepository extends BaseRepository<ContentEntity> {
    protected ContentRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract ContentEntity findById(int id);
    public abstract ContentEntity[] findByIds(int ...ids);
    public abstract ContentEntity findByName(String name);
    public abstract ContentEntity findByCategoryId(int id);
}
