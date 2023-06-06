package com.example.Appweb.entities;


import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;


import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "projects")
@Setter
@Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Project {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String start_date;
    private String end_date;
    private String title;

    @OneToMany(mappedBy="project")
    private List<Task> tasks;

    public void setStartDate(String date) {
    }

    public void setEndDate(String date) {
    }
}
