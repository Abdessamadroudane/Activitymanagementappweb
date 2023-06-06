package com.example.Appweb.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "tasks")
@Setter
@Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String start_date;
    private String end_date;
    private String title;


    @ManyToOne
    private User assign;

    @ManyToOne
    private Project project;
}
