package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Roles;
import java.util.List;

public interface RolesMapper {
    
    //INSERT
    public void insertRole(Roles role);
    //SELECT BY ID
    public Roles getRoleById(Long id);
    //UPDATE
    public void updateRoleUser(Roles role);
    //DELETE
    public void deleteRoleById(Long id);
    //SELECT ALL
    public List<Roles> getAll();
    
}
