package com.mycompany.careerguidence.dao.type;


public class Question {
    
    private Long id_question;
    private String name_question;
    private boolean flag_question;

    //ID OF QUESTION
    public long getId_question() {
        return id_question;
    }

    public void setId_question(Long id_question) {
        this.id_question = id_question;
    }
    //NAME OF QUESTION
    public String getName_question() {
        return name_question;
    }

    public void setName_question(String name_question) {
        this.name_question = name_question;
    }
    //FLAG OF QUESTION
    public boolean isFlag_question() {
        return flag_question;
    }

    public void setFlag_question(boolean flag_question) {
        this.flag_question = flag_question;
    }
    
}
