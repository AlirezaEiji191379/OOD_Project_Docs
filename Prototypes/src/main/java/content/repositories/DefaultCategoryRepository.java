package content.repositories;

import content.entities.CategoryEntity;
import content.entities.ContentMetaDataEntity;
import content.repositories.contracts.CategoryRepository;
import content.repositories.contracts.ContentMetaDataRepository;
import core.dataAccess.AppDbContext;

public class DefaultCategoryRepository extends CategoryRepository {

    public DefaultCategoryRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public CategoryEntity findById(int id) {
        return null;
    }
}
