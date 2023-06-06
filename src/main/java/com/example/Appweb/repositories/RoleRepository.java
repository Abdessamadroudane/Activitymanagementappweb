package com.example.Appweb.repositories;

import com.example.Appweb.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role,Integer> {
    public Role findByName(String name);

}
