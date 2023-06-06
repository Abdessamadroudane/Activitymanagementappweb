package com.example.Appweb.repositories;

import com.example.Appweb.entities.SubTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SubTeamRepository extends JpaRepository<SubTeam,Integer> {
}
