package com.mycompany.careerguidence.dao.type;


public class UserAnswer {
    
    private Long id_user; 
    private Long id_question; 
    private boolean flag; 


    public Long getId_user() { 
        return id_user; 
    } 

    public void setId_user(Long id_user) { 
        this.id_user = id_user; 
    } 

    public Long getId_question() { 
        return id_question; 
    } 

    public void setId_question(Long id_question) { 
        this.id_question = id_question; 
    } 

    public boolean getFlag() { 
        return flag; 
    } 

    public void setFlag(boolean flag) { 
        this.flag = flag; 
    } 
    
}
