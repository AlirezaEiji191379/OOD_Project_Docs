package content.repositories.contracts;

import content.entities.CategoryEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class CategoryRepository extends BaseRepository<CategoryEntity> {
    protected CategoryRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract CategoryEntity findById(int id);
}
