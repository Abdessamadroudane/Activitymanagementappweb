package com.example.Appweb.repositories;

import com.example.Appweb.entities.KpiValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KpiValueRepository extends JpaRepository<KpiValue,Integer> {

}
