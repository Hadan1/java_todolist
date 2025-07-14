package app.todo.controller;

import app.todo.repository.User;
import app.todo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    @GetMapping
    public List<User> helloWorld() {
        userService.helloWorld();
    }

}
