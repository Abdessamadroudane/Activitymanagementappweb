package com.example.Appweb.service;
import com.example.Appweb.entities.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Integer taskId);
    Task getTaskById(Integer taskId);
    List<Task> getAllTasks();
    List<Task> getTasksByUser(String userName);
    List<Task> getTasksByProject(Integer projectId);
}