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
    private TestsMapper test_mapper;

    @Override
    public Test getTestById(Long id) {
        try{
            return test_mapper.getTestById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Test getTestByName(String name) {
        try{
            return test_mapper.getTestByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertTest(Test test) {
        try{
            test_mapper.insertTest(test);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateTest(Test test) {
        try{
            test_mapper.updateTest(test);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteTestById(Long id) {
        try{
            test_mapper.deleteTestById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Test> getAllTests() {
        try{
            return test_mapper.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Test_has_Question getTestWithQuestionById(Long id) {
        try{
            return test_mapper.getTestWithQuestionById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllTest() {
        try{
            test_mapper.deleteAllTest();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
}
