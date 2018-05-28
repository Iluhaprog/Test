package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.Test_has_Question;
import com.mycompany.careerguidence.mappers.TestsMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.TestService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional

public class TestServiceImpl implements TestService {
    
    @Autowired
    TestsMapper tm;

    @Override
    public Test getTestById(Long id) {
        try{
            return tm.getTestById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Test getTestByName(String name) {
        try{
            return tm.getTestByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertTest(Test test) {
        try{
            tm.insertTest(test);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateTest(Test test) {
        try{
            tm.updateTest(test);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteTestById(Long id) {
        try{
            tm.deleteTestById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Test> getAllTests() {
        try{
            return tm.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Test_has_Question getTestWithQuestionById(Long id) {
        try{
            return tm.getTestWithQuestionById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllTest() {
        try{
            tm.deleteAllTest();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
}
