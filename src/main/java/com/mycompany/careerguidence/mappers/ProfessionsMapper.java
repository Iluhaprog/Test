package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Profession;
import java.util.List;

public interface ProfessionsMapper {
    
    //INSERT
    public void insertProfession(Profession profession);
    //GET BY ID
    public Profession getProfessionById(Long id);
    //UPDATE
    public void updateProfession(Profession profession);
    //DELETE BY ID
    public void deleteProfessionByid(Long id);
    //GET ALL
    public List<Profession> getAll();
    
}
