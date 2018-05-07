package com.mycompany.careerguidence.dao.type;


public class Test_has_Questions {
    //FIELDS OF TEST
    private Long id_test;
    private Long id_user;
    private Long id_profession;
    //FIELD OF QUESTIONS
    private String name_question;
    private boolean flag_question;
    
    //ID OF TEST
    public Long getId_test() {
        return id_test;
    }

    public void setId_test(Long id_test) {
        this.id_test = id_test;
    }
    //ID_USER OF TEST
    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }
    //ID_PROFESSION OF TEST
    public Long getId_profession() {
        return id_profession;
    }

    public void setId_profession(Long id_profession) {
        this.id_profession = id_profession;
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
