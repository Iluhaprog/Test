package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Question;
import java.util.List;

public interface QuestionsMapper {
    
    //INSERT
    public void insertQuestion(Question question);
    //GET BY ID
    public Question getQuestionById(Long id);
    //UPDATE
    public void updateQuestion(Question question);
    //DELETE BY ID
    public void deleteQuestionnByid(Long id);
    //GET ALL
    public List<Question> getAll();
    
}
