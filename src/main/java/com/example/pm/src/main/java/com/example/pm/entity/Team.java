package com.example.pm.entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.Set;


@Entity
@Table(name = "teams")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Team {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private String id;


private String name;
private String description;


@ManyToMany
@JoinTable(name = "team_user",
joinColumns = @JoinColumn(name = "team_id"),
inverseJoinColumns = @JoinColumn(name = "user_id"))
private Set<User> members;
}
