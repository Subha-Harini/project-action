package com.example.ProjectAction.model;

import javax.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Users", uniqueConstraints={@UniqueConstraint(columnNames={"user_id"})})
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_ID")
    private String emailID;

//    @OneToMany(mappedBy = "createdBy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Project> listCreatedBy = new ArrayList<>();

//    @OneToMany(mappedBy = "updatedBy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Project> listUpdatedBy = new ArrayList<>();

//    @OneToMany(mappedBy = "createdBy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Project> listCreatedBy = new ArrayList<>();
//
//    @OneToMany(mappedBy = "updatedBy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Project> listUpdatedBy = new ArrayList<>();

}
