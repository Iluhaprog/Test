package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Specializes;
import java.util.List;

public interface SpecializesMapper {
    
    //INSERT
    public void insertSpecialize(Specializes specialize);
    //SELECT BY ID
    public Specializes getSpecializeById(Long id);
    //UPDATE
    public void updateSpecializeUser(Specializes specialize);
    //DELETE
    public void deleteSpecializeById(Long id);
    //SELECT ALL
    public List<Specializes> getAll();
    
}
