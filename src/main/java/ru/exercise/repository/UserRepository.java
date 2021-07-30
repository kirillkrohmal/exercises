package ru.exercise.repository;

import org.springframework.stereotype.Repository;
import ru.exercise.model.User;

import java.util.List;


@Repository
public interface UserRepository {
    User save(User user);

    User update(User user);

    User get(int id);

    List<User> getAll();

    void delete(int id);
}
