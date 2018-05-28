package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.Test_has_Question;
import java.util.List;

public interface TestService {
    
    public Test getTestById(Long id);
    public Test getTestByName(String name);
    public void insertTest(Test test);
    public void updateTest(Test test);
    public void deleteTestById(Long id);
    public List<Test> getAllTests();
    public Test_has_Question getTestWithQuestionById(Long id);
    public void deleteAllTest();
    
}
