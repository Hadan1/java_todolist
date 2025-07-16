package app.todo.controller;


import app.todo.repository.Task;
import app.todo.repository.User;
import app.todo.service.TaskService;
import app.todo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return taskService.create(user);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable Integer id) {
        taskService.delete(id);
    }

}
