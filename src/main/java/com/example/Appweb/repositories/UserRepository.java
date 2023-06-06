package com.example.Appweb.repositories;

import com.example.Appweb.entities.Task;
import com.example.Appweb.entities.Team;
import com.example.Appweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByLogin(String login);
    User findById(Long userId);

    void deleteById(Long userId);


}
