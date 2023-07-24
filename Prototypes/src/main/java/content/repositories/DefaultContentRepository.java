package content.repositories;

import content.entities.ContentEntity;
import content.repositories.contracts.ContentRepository;
import core.dataAccess.AppDbContext;

public class DefaultContentRepository extends ContentRepository {

    public DefaultContentRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public ContentEntity findById(int id) {
        return null;
    }

    @Override
    public ContentEntity[] findByIds(int... ids) {
        return new ContentEntity[0];
    }

    @Override
    public ContentEntity findByName(String name) {
        return null;
    }

    @Override
    public ContentEntity findByCategoryId(int id) {
        return null;
    }
}
