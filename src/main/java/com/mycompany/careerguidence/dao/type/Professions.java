package com.mycompany.careerguidence.dao.type;


public class Professions {
    
    //FIELDS OF PROFESSION
    private Long id_profession;
    private String name_profession;
    private String description_profession;

    //ID OF PROFESSION
    public long getId_profession() {
        return id_profession;
    }

    public void setId_profession(Long id_profession) {
        this.id_profession = id_profession;
    }
    //NAME OF PROFESSION
    public String getName_profession() {
        return name_profession;
    }

    public void setName_profession(String name_profession) {
        this.name_profession= name_profession;
    }
    //DESCRIPTION OF PROFESSION
    public String getDescription_profession() {
        return description_profession;
    }

    public void setDescription_profession(String description_profession) {
        this.description_profession = description_profession;
    }
    
}
