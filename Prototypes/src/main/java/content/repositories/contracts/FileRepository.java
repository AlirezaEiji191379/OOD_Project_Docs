package content.repositories.contracts;

import content.entities.FileEntity;
import core.dataAccess.AppDbContext;
import core.dataAccess.BaseRepository;

public abstract class FileRepository extends BaseRepository<FileEntity> {
    protected FileRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    public abstract FileEntity findById(int id);
}
