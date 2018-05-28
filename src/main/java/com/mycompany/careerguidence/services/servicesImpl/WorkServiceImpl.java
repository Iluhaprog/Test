package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Work;
import com.mycompany.careerguidence.mappers.WorksMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.WorkService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional

public class WorkServiceImpl implements WorkService{
    
    @Autowired
    WorksMapper wm;

    @Override
    public Work getWorkById(Long id) {
        try{
            return wm.getWorkById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Work getWorkByName(String name) {
        try{
            return wm.getWorkByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertWork(Work work) {
        try{
            wm.insertWork(work);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateWork(Work work) {
        try{
            wm.updateWork(work);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteWorkbyId(Long id) {
        try{
            wm.deleteWorkById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Work> getAllWorks() {
        try{
            return wm.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllWorks() {
        try{
           wm.deleteAllWorks();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    
}
