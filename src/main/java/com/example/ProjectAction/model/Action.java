package com.example.ProjectAction.model;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Action", uniqueConstraints={@UniqueConstraint(columnNames={"action_id"})})
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "action_id")
    private int actionID;

    @Column(name = "action_name")
    private String actionName;

    @Column(name = "description")
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_projectID")
    private Project projectID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_act_createdBy")
    private Users createdBy;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_act_updatedBy")
    private Users updatedBy;

}
