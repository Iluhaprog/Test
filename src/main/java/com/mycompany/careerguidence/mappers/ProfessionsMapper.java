package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Professions;
import java.util.List;

public interface ProfessionsMapper {
    
    //INSERT
    public void insertProfession(Professions profession);
    //GET BY ID
    public Professions getProfessionById(Long id);
    //UPDATE
    public void updateProfession(Professions profession);
    //DELETE BY ID
    public void deleteProfessionByid(Long id);
    //GET ALL
    public List<Professions> getAll();
    
}
