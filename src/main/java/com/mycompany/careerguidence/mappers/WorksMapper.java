package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Works;
import java.util.List;


public interface WorksMapper {
    
    //INSERT
    public void insertWork(Works work);
    //SELECT BY ID
    public Works getWorkById(Long id);
    //UPDATE
    public void updateWork(Works work);
    //DELETE
    public void deleteWorkById(Long id);
    //SELECT ALL
    public List<Works> getAll();
    
}
