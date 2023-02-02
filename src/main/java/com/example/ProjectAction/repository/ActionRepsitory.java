package com.example.ProjectAction.repository;

import com.example.ProjectAction.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepsitory extends JpaRepository<Action, Integer> {
}
