package com.example.Appweb.entities;


import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity
@Table(name = "users")
@Setter @Getter
@AllArgsConstructor @NoArgsConstructor @ToString

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String password;

    @ManyToOne
    private Team team;

    @OneToMany(mappedBy ="user")
    private List<Retex> retexes;

    @ManyToOne
    private Role role;


}


