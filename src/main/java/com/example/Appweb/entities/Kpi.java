package com.example.Appweb.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kpis")
@Setter
@Getter  @AllArgsConstructor @NoArgsConstructor @ToString
public class Kpi {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String type;
    @ManyToOne
    private Activity activity;
}
