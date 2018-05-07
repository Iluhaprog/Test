package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Users;
import java.util.List;


public interface UsersMapper {
    
    //INSERT
    public void insertUser(Users user);
    //SELECT BY ID
    public Users getUserById(Long id);
    //UPDATE
    public void updateUser(Users user);
    //DELETE
    public void deleteUserById(Long id);
    //SELECT ALL
    public List<Users> getAll();
    
}
