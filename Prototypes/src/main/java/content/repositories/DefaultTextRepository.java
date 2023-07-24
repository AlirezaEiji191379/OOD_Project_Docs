package content.repositories;

import content.entities.TextEntity;
import content.repositories.contracts.TextRepository;
import core.dataAccess.AppDbContext;

public class DefaultTextRepository extends TextRepository {

    public DefaultTextRepository(AppDbContext dbContext) {
        super(dbContext);
    }

    @Override
    public TextEntity findById(int id) {
        return null;
    }
}
