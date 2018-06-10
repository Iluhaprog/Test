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
    private UsersMapper user_mapper;

    @Override
    public User getUserById(Long id) {
        try{
            return user_mapper.getUserById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    @Override
    public User getUserByLoginAndByPassword(String login, String password) {
        try{
            return user_mapper.getUserByLoginAndByPassword(login, password);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public User getUserByName(String name) {
        try{
            return user_mapper.getUserByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertUser(User user) {
        try{
            user_mapper.insertUser(user);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateUser(User user) {
        try{
            user_mapper.updateUser(user);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteUserByid(Long id) {
        try{
            user_mapper.deleteUserById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<User> getAllUsers() {
        try{
            return user_mapper.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllUsers() {
        try{
            user_mapper.deleteAllUsers();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    
}
