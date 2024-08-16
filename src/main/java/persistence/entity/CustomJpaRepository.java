package persistence.entity;

public class CustomJpaRepository<T, ID> {
    private final EntityManager entityManager;

    public CustomJpaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T save(T entity) {
        if (entityManager.isNew(entity)) {
            entityManager.persist(entity);
        } else if (entityManager.isDirty(entity)) {
            entityManager.merge(entity);
        }
        return entity;
    }
}
