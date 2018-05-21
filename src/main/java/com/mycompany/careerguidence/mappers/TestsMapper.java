package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Test_has_Question;
import com.mycompany.careerguidence.dao.type.Test;
import java.util.List;

public interface TestsMapper {
    
    //INSERT
    public void insertTest(Test test);
    //SELECT BY ID
    public Test getTestById(Long id);
    //UPDATE
    public void updateTestUser(Test test);
    //DELETE
    public void deleteTestById(Long id);
    //SELECT ALL
    public List<Test> getAll();
    //GET TEST WITH QUESTION
    public Test_has_Question getTestWithQuestionById(Long id);
    //DELETE ALL TESTS
    public void deleteAllTest();
    //GET TEST BY NAME
    public Test getTestByName(String name);
    
}
