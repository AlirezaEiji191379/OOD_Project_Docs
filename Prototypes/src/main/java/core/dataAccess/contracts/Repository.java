package core.dataAccess.contracts;

public interface Repository<T> {
    void save(T entity);
    void delete(T entity);
}
