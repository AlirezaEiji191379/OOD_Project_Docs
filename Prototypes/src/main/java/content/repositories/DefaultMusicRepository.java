package content.repositories;

import content.entities.CategoryEntity;
import content.entities.MusicEntity;
import content.repositories.contracts.CategoryRepository;
import content.repositories.contracts.MusicRepository;
import core.dataAccess.AppDbContext;

public class DefaultMusicRepository extends MusicRepository {

    public DefaultMusicRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public MusicEntity find(int contentId) {
        return null;
    }
}
