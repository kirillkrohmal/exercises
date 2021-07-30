package ru.exercise.service;

import org.springframework.stereotype.Service;
import ru.exercise.model.User;

import java.util.List;


@Service
public interface UserService {
    User save(User user);

    User get(int id);

    List<User> getAll();

    void delete(int id);

    void update(User user);

}
