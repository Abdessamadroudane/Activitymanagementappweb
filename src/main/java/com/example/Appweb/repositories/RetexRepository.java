package com.example.Appweb.repositories;

import com.example.Appweb.entities.Retex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RetexRepository extends JpaRepository<Retex,Integer> {

}
