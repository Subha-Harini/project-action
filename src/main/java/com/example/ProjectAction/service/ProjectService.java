package com.example.ProjectAction.service;

import com.example.ProjectAction.model.Project;
import com.example.ProjectAction.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public Project createProject(Project project){
        return projectRepository.save(project);
    }

    public List<Project> getProjects(){
        return projectRepository.findAll();
    }

    public Optional<Project> getProject(int projectID){
        return projectRepository.findById(projectID);
    }

    public Project updateProject(Project project){
        Project existingProject = projectRepository.findById(project.getProjectID()).orElse(null);
        existingProject.setProjectName(project.getProjectName());
        existingProject.setDescription(project.getDescription());
        existingProject.setUpdatedBy(project.getUpdatedBy());
        existingProject.setCreatedBy(project.getCreatedBy());
        deleteProject(project.getProjectID());
        return projectRepository.save(project);
    }

    public String deleteProject(int projectID){
        Project existingProject = projectRepository.findById(projectID).orElse(null);
        projectRepository.delete(existingProject);
        return projectID + " deleted";
    }

}
