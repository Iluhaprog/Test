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
    private WorksMapper work_mapper;

    @Override
    public Work getWorkById(Long id) {
        try{
            return work_mapper.getWorkById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Work getWorkByName(String name) {
        try{
            return work_mapper.getWorkByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertWork(Work work) {
        try{
            work_mapper.insertWork(work);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateWork(Work work) {
        try{
            work_mapper.updateWork(work);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteWorkbyId(Long id) {
        try{
            work_mapper.deleteWorkById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Work> getAllWorks() {
        try{
            return work_mapper.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllWorks() {
        try{
           work_mapper.deleteAllWorks();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    
}
