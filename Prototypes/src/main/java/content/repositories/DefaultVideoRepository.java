package content.repositories;

import content.entities.VideoEntity;
import content.repositories.contracts.VideoRepository;
import core.dataAccess.AppDbContext;

public class DefaultVideoRepository extends VideoRepository {

    public DefaultVideoRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public VideoEntity findById(int contentId) {
        return null;
    }
}
