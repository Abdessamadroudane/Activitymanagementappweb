package com.example.Appweb.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sub_teams")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mission;


    @ManyToOne
    private Team team;
    @ManyToOne
    private Activity activity;
}
