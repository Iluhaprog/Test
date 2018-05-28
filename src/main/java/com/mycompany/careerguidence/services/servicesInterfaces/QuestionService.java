package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Question;
import java.util.List;


public interface QuestionService {
    
    public Question getQuestionById(Long id);
    public Question getQuestionByName(String name);
    public void insertQuestion(Question question);
    public void updateQuestion(Question question);
    public void deleteQuestionById(Long id);
    public List<Question> getAllQuestions();
    public List<Question> getQuestions(Long id_user , Long id_test);
    public void deleteAllQuestions();
}
