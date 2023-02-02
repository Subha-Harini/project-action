package com.example.ProjectAction.controller;

import com.example.ProjectAction.model.Action;
import com.example.ProjectAction.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/action")
public class ActionController {

    @Autowired
    ActionService actionService;

    @PostMapping("/createAction")
    public Action createAction(@RequestBody Action action){
        return actionService.createAction(action);
    }

    @GetMapping("/getActions")
    public List<Action> getActions(){
        return actionService.getActions();
    }

    @GetMapping("/getAction")
    public Optional<Action> getAction(@RequestParam int actionID){
        return actionService.getAction(actionID);
    }

    @PutMapping("/updateAction")
    public Action updateAction(@RequestBody Action action){
        return actionService.updateAction(action);
    }

    @DeleteMapping("/deleteAction")
    public void deleteAction(@RequestParam int actionID){
        actionService.deleteAction(actionID);
    }
}
