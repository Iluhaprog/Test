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
    RolesMapper rm;

    @Override
    public Role getRoleById(Long id) {
        try{
            return rm.getRoleById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Role getRoleByName(String name) {
        try{
            return rm.getRoleByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertRole(Role role) {
        try{
            rm.insertRole(role);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateRole(Role role) {
        try{
            rm.updateRole(role);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteRoleById(Long id) {
        try{
            rm.deleteRoleById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Role> getAllRoles() {
        try{
            return rm.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    
}
