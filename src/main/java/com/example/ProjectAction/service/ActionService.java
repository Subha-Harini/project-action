package com.example.ProjectAction.service;

import com.example.ProjectAction.model.Action;
import com.example.ProjectAction.repository.ActionRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActionService {

    @Autowired
    ActionRepsitory actionRepsitory;

    public Action createAction(Action action){
        return actionRepsitory.save(action);
    }

    public List<Action> getActions(){
        return actionRepsitory.findAll();
    }

    public Optional<Action> getAction(int projectID){
        return actionRepsitory.findById(projectID);
    }

    public Action updateAction(Action action){
        Action existingaction = actionRepsitory.findById(action.getActionID()).orElse(null);
        existingaction.setActionName(action.getActionName());
        existingaction.setCreatedBy((action.getCreatedBy()));
        existingaction.setDescription(action.getDescription());
        existingaction.setUpdatedBy(action.getUpdatedBy());
        existingaction.setCreatedBy(action.getCreatedBy());
        return actionRepsitory.save(action);
    }

    public String deleteAction(int actionID){
        Action existingaction = actionRepsitory.findById(actionID).orElse(null);
        actionRepsitory.delete(existingaction);
        return actionID + " deleted";
    }

}
