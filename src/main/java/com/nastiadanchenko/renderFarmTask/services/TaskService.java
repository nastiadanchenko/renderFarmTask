package com.nastiadanchenko.renderFarmTask.services;

import com.nastiadanchenko.renderFarmTask.models.Task;
import com.nastiadanchenko.renderFarmTask.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public boolean saveTask(Task task) {
        Task newTask = new Task();
        if (task != null) {
            taskRepository.save(task);
            return true;
        }
        return false;
    }
}
