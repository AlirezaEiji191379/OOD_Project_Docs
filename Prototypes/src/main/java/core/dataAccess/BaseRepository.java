package core.dataAccess;

import core.dataAccess.contracts.Repository;

public abstract class BaseRepository<T> implements Repository<T> {

    private AppDbContext dbContext;

    protected BaseRepository(AppDbContext dbContext) {
        this.dbContext = dbContext;
    }

    @Override
    public void save(T entity) {
        dbContext.commit();
    }

    @Override
    public void delete(T entity) {
        dbContext.commit();
    }
}
