package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Work;
import java.util.List;


public interface WorksMapper {
    
    //INSERT
    public void insertWork(Work work);
    //SELECT BY ID
    public Work getWorkById(Long id);
    //UPDATE
    public void updateWork(Work work);
    //DELETE
    public void deleteWorkById(Long id);
    //SELECT ALL
    public List<Work> getAll();
    
}
