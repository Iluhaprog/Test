package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Profession;
import java.util.List;

public interface ProfessionService {
    
    public Profession getProfessionById(Long id);
    public Profession getProfessionByName(String name);
    public void insertProfession(Profession profession);
    public void updateProfession(Profession profession);
    public void deleteProfessionById(Long id);
    public List<Profession> getAllProfessions();
    
}
