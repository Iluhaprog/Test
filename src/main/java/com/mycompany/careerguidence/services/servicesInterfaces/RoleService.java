package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Role;
import java.util.List;


public interface RoleService {
    
    public Role getRoleById(Long id);
    public Role getRoleByName(String name);
    public void insertRole(Role role);
    public void updateRole(Role role);
    public void deleteRoleById(Long id);
    public List<Role> getAllRoles();
    
}
