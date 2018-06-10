package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Role;
import com.mycompany.careerguidence.mappers.RolesMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.RoleService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional

public class RoleServiceImpl implements RoleService{
    
    @Autowired
    private RolesMapper role_mapper;

    @Override
    public Role getRoleById(Long id) {
        try{
            return role_mapper.getRoleById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Role getRoleByName(String name) {
        try{
            return role_mapper.getRoleByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertRole(Role role) {
        try{
            role_mapper.insertRole(role);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateRole(Role role) {
        try{
            role_mapper.updateRole(role);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteRoleById(Long id) {
        try{
            role_mapper.deleteRoleById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Role> getAllRoles() {
        try{
            return role_mapper.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    
}
