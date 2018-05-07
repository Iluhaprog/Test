package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Answers;
import java.util.List;

public interface AnswersMapper {
    
    //INSERT
    public void insertAnswer(Answers answer);
    //GET BY ID
    public Answers getAnswerById(Long id);
    //UPDATE
    public void updateAnswer(Answers answer);
    //DELETE BY ID
    public void deleteAnswerByid(Long id);
    //GET ALL
    public List<Answers> getAll();
}
