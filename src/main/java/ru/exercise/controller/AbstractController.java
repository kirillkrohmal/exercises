package ru.exercise.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.exercise.model.User;
import ru.exercise.service.UserService;

@Controller
public abstract class AbstractController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    public User add(User user) {
        LOG.info("return add method");
        return userService.save(user);
    }

    public void delete(int id) {
        LOG.info("return delete method");
        userService.delete(id);
    }

    public void update(User user) {
        LOG.info("return update method");
        userService.update(user);
    }
}
