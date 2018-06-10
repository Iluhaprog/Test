package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Answer;
import com.mycompany.careerguidence.dao.type.UserAnswer;
import com.mycompany.careerguidence.mappers.AnswersMapper;
import com.mycompany.careerguidence.mappers.ProfessionsMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.AnswerService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional

public class AnswerServiceImpl implements AnswerService{

    @Autowired
    private AnswersMapper       answer_mapper;
    
    @Autowired
    ProfessionsMapper   profession_mapper;
    
    @Override
    public Answer getAnswerById(Long id) {
        try{
            return  answer_mapper.getAnswerById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Answer getAnswerByName(String name) {
        try{
            return answer_mapper.getAnswerByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void inserAnswer(Answer answer) {
        try{
            answer_mapper.insertAnswer(answer);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateAnswer(Answer answer) {
        try{
            answer_mapper.updateAnswer(answer);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAnswerById(Long id) {
        try{
            answer_mapper.deleteAnswerByid(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Answer> getAllAnswers() {
        try{
            return answer_mapper.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertUserAnswers(List<UserAnswer> user_answer) {
        try{
            answer_mapper.insertUserAnswers(user_answer);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public String getResult(Long id_user, Long id_test) {
         try{
            return profession_mapper.getResult(id_user, id_test).getName_profession();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
}
