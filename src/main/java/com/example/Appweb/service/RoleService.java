package com.example.Appweb.service;
import com.example.Appweb.entities.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    Role updateRole(Role role);
    void deleteRole(Integer roleId);
    Role getRoleById(Integer roleId);
    List<Role> getAllRoles();
    List<Role> getRolesByUser(Integer userId);
}
