package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Tests;
import java.util.List;

public interface TestsMapper {
    
    //INSERT
    public void insertTest(Tests test);
    //SELECT BY ID
    public Tests getTestById(Long id);
    //UPDATE
    public void updateTestUser(Tests test);
    //DELETE
    public void deleteTestById(Long id);
    //SELECT ALL
    public List<Tests> getAll();
    
}
