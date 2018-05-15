package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Specialize;
import java.util.List;

public interface SpecializesMapper {
    
    //INSERT
    public void insertSpecialize(Specialize specialize);
    //SELECT BY ID
    public Specialize getSpecialize(Long id_user,Long id_test);
    //UPDATE
    public void updateSpecializeUser(Specialize specialize);
    //DELETE
    public void deleteSpecializeById(Long id);
    //SELECT ALL
    public List<Specialize> getAll();
    
}
