package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.mappers.ProfessionsMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.ProfessionService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional

public class ProfessionServiceImpl implements ProfessionService {

    @Autowired
    ProfessionsMapper pm;
    
    @Override
    public Profession getProfessionById(Long id) {
        try{
            return pm.getProfessionById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Profession getProfessionByName(String name) {
        try{
            return pm.getProfessionByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertProfession(Profession profession) {
        try{
            pm.insertProfession(profession);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateProfession(Profession profession) {
        try{
            pm.updateProfession(profession);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteProfessionById(Long id) {
        try{
            pm.deleteProfessionByid(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Profession> getAllProfessions() {
        try{
            return pm.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    
    
    
}
