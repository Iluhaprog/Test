package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Questions;
import java.util.List;

public interface QuestionsMapper {
    
    //INSERT
    public void insertQuestion(Questions question);
    //GET BY ID
    public Questions getQuestionById(Long id);
    //UPDATE
    public void updateQuestion(Questions question);
    //DELETE BY ID
    public void deleteQuestionnByid(Long id);
    //GET ALL
    public List<Questions> getAll();
    
}
