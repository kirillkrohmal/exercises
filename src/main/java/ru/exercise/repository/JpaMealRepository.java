package ru.exercise.repository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.exercise.model.User;
import ru.exercise.repository.UserRepository;
import ru.exercise.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class JpaMealRepository implements UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User save(User user) {
        return entityManager.merge(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User get(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createNamedQuery(User.ALL_SORTED, User.class).getResultList();
    }

    @Override
    public void delete(int id) {
        User meal = entityManager.getReference(User.class, id);

        entityManager.remove(meal);
    }
}
