package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Role;
import java.util.List;

public interface RolesMapper {
    
    //INSERT
    public void insertRole(Role role);
    //SELECT BY ID
    public Role getRoleById(Long id);
    //UPDATE
    public void updateRoleUser(Role role);
    //DELETE
    public void deleteRoleById(Long id);
    //SELECT ALL
    public List<Role> getAll();
    
}
