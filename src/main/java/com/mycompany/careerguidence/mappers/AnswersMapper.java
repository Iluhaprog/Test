package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Answer;
import java.util.List;

public interface AnswersMapper {
    
    //INSERT
    public void insertAnswer(Answer answer);
    //GET BY ID
    public Answer getAnswerById(Long id);
    //UPDATE
    public void updateAnswer(Answer answer);
    //DELETE BY ID
    public void deleteAnswerByid(Long id);
    //GET ALL
    public List<Answer> getAll();
}
