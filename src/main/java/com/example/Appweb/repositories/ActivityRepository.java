package com.example.Appweb.repositories;

import com.example.Appweb.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActivityRepository extends JpaRepository<Activity,Integer> {

    Activity findById(int s);
}
