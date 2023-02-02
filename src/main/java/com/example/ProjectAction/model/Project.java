package com.example.ProjectAction.model;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Project", uniqueConstraints={@UniqueConstraint(columnNames={"project_id"})})
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private int projectID;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "description")
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_prj_createdBy")
    private Users createdBy;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_prj_updatedBy")
    private Users updatedBy;

}
