package com.mycompany.careerguidence.dao.type;


public class Work {
    
    //FIELDS OF WORK
    private Long id_work;
    private String name_work;
    private String position_work;

    //ID OF WORK
    public long getId_work() {
        return id_work;
    }

    public void setId_work(Long id_work) {
        this.id_work = id_work;
    }
    //POSITION OF WORK
    public String getPosition_work() {
        return position_work;
    }

    public void setPosition_work(String position_work) {
        this.position_work = position_work;
    }
    //NAME OF WORK
    public String getName_work() {
        return name_work;
    }

    public void setName_work(String name_work) {
        this.name_work = name_work;
    }
    
}
