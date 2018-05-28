package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Answer;
import com.mycompany.careerguidence.dao.type.UserAnswer;
import java.util.List;

public interface AnswerService {
    
    public Answer getAnswerById(Long id);
    public Answer getAnswerByName(String name);
    public void inserAnswer(Answer answer);
    public void updateAnswer(Answer answer);
    public void deleteAnswerById(Long id);
    public List<Answer> getAllAnswers();
    public void insertUserAnswers(List<UserAnswer> user_answer);   
    public String getResult(Long id_user,Long id_test);
    
    
}
