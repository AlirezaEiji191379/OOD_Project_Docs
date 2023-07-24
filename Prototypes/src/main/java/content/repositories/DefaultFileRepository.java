package content.repositories;

import content.entities.CategoryEntity;
import content.entities.FileEntity;
import content.repositories.contracts.CategoryRepository;
import content.repositories.contracts.FileRepository;
import core.dataAccess.AppDbContext;

public class DefaultFileRepository extends FileRepository {

    public DefaultFileRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public FileEntity findById(int id) {
        return null;
    }
}
