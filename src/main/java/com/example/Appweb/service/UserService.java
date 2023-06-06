package com.example.Appweb.service;

import com.example.Appweb.entities.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long userId);
    Object getUserById(Long userId);
    List<User> getAllUsers();
    List<User> getUsersByTeam(String teamName);
}
