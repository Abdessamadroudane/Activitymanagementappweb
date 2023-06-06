package com.example.Appweb.repositories;

import com.example.Appweb.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;

@RepositoryRestResource
public interface TeamRepository extends JpaRepository<Team,Integer> {
    @Query("SELECT t FROM Team t JOIN t.users m WHERE m.id = :userId")
    Team findTeamByUserId(Long userId);
Team findByName(String name);
}
