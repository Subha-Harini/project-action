package com.example.ProjectAction.controller;

import com.example.ProjectAction.model.Project;
import com.example.ProjectAction.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("/createProject")
    public Project createProject(@RequestBody Project project){
        return projectService.createProject(project);
    }

    @GetMapping("/getProjects")
    public List<Project> getProjects(){
        return projectService.getProjects();
    }

    @GetMapping("/getProject/{projectID}")
    public Optional<Project> getProject(@PathVariable("projectID") int projectID){
        return projectService.getProject(projectID);
    }

    @PutMapping("/updateProject")
    public Project updateProject(@RequestBody Project project){
        return projectService.updateProject(project);
    }

    @DeleteMapping("/deleteProject")
    public void deleteProject(@RequestParam int projectID){
        projectService.deleteProject(projectID);
    }
}
