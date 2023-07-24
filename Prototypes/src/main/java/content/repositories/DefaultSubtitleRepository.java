package content.repositories;

import content.entities.SubtitleEntity;
import content.entities.VideoEntity;
import content.repositories.contracts.SubtitleRepository;
import content.repositories.contracts.VideoRepository;
import core.dataAccess.AppDbContext;

public class DefaultSubtitleRepository extends SubtitleRepository {

    public DefaultSubtitleRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public SubtitleEntity findById(int id) {
        return null;
    }

}
