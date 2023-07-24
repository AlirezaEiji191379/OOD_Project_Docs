package content.repositories;

import content.entities.FileEntity;
import content.entities.InteractionEntity;
import content.repositories.contracts.FileRepository;
import content.repositories.contracts.InteractionRepository;
import core.dataAccess.AppDbContext;

public class DefaultInteractionRepository extends InteractionRepository {

    public DefaultInteractionRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public InteractionEntity findById(int id) {
        return null;
    }

    @Override
    public InteractionEntity[] findByContentId(int contentId) {
        return new InteractionEntity[0];
    }
}
