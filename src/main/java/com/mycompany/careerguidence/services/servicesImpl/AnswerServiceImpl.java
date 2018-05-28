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
    AnswersMapper       am;
    ProfessionsMapper   pm;
    
    @Override
    public Answer getAnswerById(Long id) {
        try{
            return  am.getAnswerById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Answer getAnswerByName(String name) {
        try{
            return am.getAnswerByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void inserAnswer(Answer answer) {
        try{
            am.insertAnswer(answer);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateAnswer(Answer answer) {
        try{
            am.updateAnswer(answer);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAnswerById(Long id) {
        try{
            am.deleteAnswerByid(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Answer> getAllAnswers() {
        try{
            return am.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertUserAnswers(List<UserAnswer> user_answer) {
        try{
            am.insertUserAnswers(user_answer);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public String getResult(Long id_user, Long id_test) {
         try{
            return pm.getResult(id_user, id_test).getName_profession();
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
}
