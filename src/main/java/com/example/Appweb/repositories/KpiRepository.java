package com.example.Appweb.repositories;

import com.example.Appweb.entities.Kpi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KpiRepository extends JpaRepository<Kpi,Integer> {


}
