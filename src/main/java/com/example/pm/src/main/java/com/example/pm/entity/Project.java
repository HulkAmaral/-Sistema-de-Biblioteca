package com.example.pm.entity;


import jakarta.persistence.*;
import lombok.*;
import com.example.pm.entity.enums.ProjectStatus;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "projects")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private String id;


private String name;
private String description;
private LocalDate startDate;
private LocalDate endDate;


@Enumerated(EnumType.STRING)
private ProjectStatus status;


@ManyToOne
@JoinColumn(name = "manager_id")
private User manager;


@ManyToMany
@JoinTable(name = "project_team",
joinColumns = @JoinColumn(name = "project_id"),
inverseJoinColumns = @JoinColumn(name = "team_id"))
private Set<Team> teams;
}
