package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.User;
import java.util.List;

public interface UserService {
    
    public User getUserById(Long id);
    public User getUserByName(String name);
    public User getUserByLoginAndByPassword( String login , String password );
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUserByid(Long id);
    public List<User> getAllUsers();
    public void deleteAllUsers();   
    
}
