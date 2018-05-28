package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.mappers.UsersMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.UserService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional

public class UserServiceImpl implements UserService {
    
    @Autowired
    UsersMapper um;

    @Override
    public User getUserById(Long id) {
        try{
            return um.getUserById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    @Override
    public User getUserByLoginAndByPassword(String login, String password) {
        try{
            return um.getUserByLoginAndByPassword(login, password);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public User getUserByName(String name) {
        try{
            return um.getUserByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertUser(User user) {
        try{
            um.insertUser(user);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateUser(User user) {
        try{
            um.updateUser(user);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteUserByid(Long id) {
        try{
            um.deleteUserById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<User> getAllUsers() {
        try{
            return um.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllUsers() {
        um.deleteAllUsers();
    }
    
    
}
