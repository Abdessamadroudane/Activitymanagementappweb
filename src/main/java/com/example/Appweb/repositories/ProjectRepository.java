package com.example.Appweb.repositories;

import com.example.Appweb.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectRepository extends JpaRepository<Project,Integer> {

    Project findByName(String s);
}
