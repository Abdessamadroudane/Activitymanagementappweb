package com.example.Appweb.service;
import com.example.Appweb.entities.Project;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project);
    Project updateProject(Project project);
    void deleteProject(Integer projectId);
    Project getProjectById(Integer projectId);
    List<Project> getAllProjects();
}
