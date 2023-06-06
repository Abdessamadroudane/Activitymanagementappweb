package com.example.Appweb.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kpi_values")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KpiValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double rate;
    private String period;
}
