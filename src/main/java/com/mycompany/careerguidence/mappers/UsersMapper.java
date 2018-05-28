package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.User;
import java.util.List;


public interface UsersMapper {
    
    //INSERT
    public void insertUser(User user);
    //SELECT BY LOGIN + PASSWORD FOR CLIENT
    public User getUserByLoginAndByPassword( String login , String password );
    //GET USER BY UD FOR ADMIN
    public User getUserById(Long id);
    //UPDATE
    public void updateUser(User user);
    //DELETE
    public void deleteUserById(Long id);
    //DELETE ALL USERS
    public void deleteAllUsers();
    //SELECT ALL
    public List<User> getAll();
    //GET USER BY NAME
    public User getUserByName(String name);
    
}
