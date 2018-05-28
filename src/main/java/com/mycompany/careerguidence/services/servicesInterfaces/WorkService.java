package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Work;
import java.util.List;


public interface WorkService {
    
    public Work getWorkById(Long id);
    public Work getWorkByName(String name);
    public void insertWork(Work work);
    public void updateWork(Work work);
    public void deleteWorkbyId(Long id);
    public List<Work> getAllWorks();
    public void deleteAllWorks();
    
}
