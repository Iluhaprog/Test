package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.mappers.QuestionsMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.QuestionService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional

public class QuestionServiceImpl implements QuestionService{
    
    @Autowired
    private QuestionsMapper question_mapper;

    @Override
    public Question getQuestionById(Long id) {
        try{
            return question_mapper.getQuestionById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Question getQuestionByName(String name) {
        try{
            return question_mapper.getQuestionByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertQuestion(Question question) {
        try{
            question_mapper.insertQuestion(question);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateQuestion(Question question) {
        try{
           question_mapper.updateQuestion(question);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteQuestionById(Long id) {
        try{
           question_mapper.deleteQuestionById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Question> getAllQuestions() {
        try{
            return question_mapper.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    @Override
    public List<Question> getQuestions(Long id_user, Long id_test) {
        try{
            return question_mapper.getQuestions(id_user, id_test);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllQuestions() {
        try{
            question_mapper.deleteAllQuestions();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
}
