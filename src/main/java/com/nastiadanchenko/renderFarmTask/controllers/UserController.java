package com.nastiadanchenko.renderFarmTask.controllers;

import com.nastiadanchenko.renderFarmTask.models.Task;
import com.nastiadanchenko.renderFarmTask.services.TaskService;
import com.nastiadanchenko.renderFarmTask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TaskService taskService;
    

@GetMapping("/addTask/{userId}")
    public void createTask(Task task, @PathVariable String userId) {
        taskService.saveTask(task);
        userService.addTask(userId,task);
    }
}
