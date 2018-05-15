package com.mycompany.careerguidence.dao.type;


public class Answer {
    
    //FIELD OF ANSWER
    private Long id_questions;
    private Long id_specializes;// test
    private boolean flag_answer;
    
    //ID_QUESTION OF ANSWER
    public long getId_questions() {
        return id_questions;
    }

    public void setId_questions(Long id_questions) {
        this.id_questions = id_questions;
    }
    //ID_SPECIALIZES OF ANSWER
    public long getId_specializes() {
        return id_specializes;
    }

    public void setId_specializes(Long id_specializes) {
        this.id_specializes = id_specializes;
    }
    //FLAG OF ANSWER
    public boolean isFlag() {
        return flag_answer;
    }

    public void setFlag(boolean flag_answer) {
        this.flag_answer = flag_answer;
    }
    
}
