package com.example.pm.entity;


import jakarta.persistence.*;
import lombok.*;
import com.example.pm.entity.enums.Role;


@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private String id;


private String fullName;
@Column(unique = true, length = 11)
private String cpf;
@Column(unique = true)
private String email;


private String position; // cargo


@Column(unique = true)
private String username;
private String password;


@Enumerated(EnumType.STRING)
private Role role;
}
