package app.todo.service;

import app.todo.repository.User;

import java.util.List;

public class UserService {
    public List<User> helloWorld() {
        return List.of(
                new User("Dmitry", 1, "dmit@mail.ru"),
                new User("Oleg", 2, "oleg@mail.ru"),
                new User("Ivan", 3, "ivan@mail.ru")
        );
    }

}
