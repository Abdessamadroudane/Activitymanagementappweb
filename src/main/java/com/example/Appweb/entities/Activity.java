package com.example.Appweb.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "activities")
@Setter
@Getter @AllArgsConstructor @NoArgsConstructor @ToString


public class Activity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String capitalisation;
    private String desc_activity;
    @JsonManagedReference
   @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "activity")
    private List<SubTeam> subTeams;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "activity")
    private List<Kpi> kpis;

}
