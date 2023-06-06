package com.example.Appweb.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "retexs")
@Setter
@Getter @AllArgsConstructor @NoArgsConstructor @ToString
    public class Retex {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
