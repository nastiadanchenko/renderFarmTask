package com.nastiadanchenko.renderFarmTask.services;

import com.nastiadanchenko.renderFarmTask.models.Task;
import com.nastiadanchenko.renderFarmTask.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addTask(String userId,Task task) {
        Long id = Long.parseLong(userId);
        List<Task> tasks =  userRepository.getById(id).getTasks();
        tasks.add(task);
    }
}
