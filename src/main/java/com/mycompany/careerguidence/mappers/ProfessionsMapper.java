package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Profession;
import java.util.List;

public interface ProfessionsMapper {
    
    //INSERT
    public void insertProfession(Profession profession);
    //GET BY ID
    public Profession getProfessionById(Long id);
    //
    public Profession getProfession(Long id_user , Long id_test);
    //GET BY NAME
    public Profession getProfessionByName(String name);
    //UPDATE
    public void updateProfession(Profession profession);
    //DELETE BY ID
    public void deleteProfessionByid(Long id);
    //GET ALL
    public List<Profession> getAll();
    
}
