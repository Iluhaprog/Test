package com.mycompany.careerguidence.dao.type;


public class Enterprice_has_work {
    
    //FIELDS OF ENTERPRICE
    private Long id_enterprice;
    private String name_enterprice;
    private String geolocation_enterprice;
    private String phone_enterprice;
    //FIELDS OF WORK
    private String name_work;
    private String position_work;

    //ID OF ENTERPRICE
    public Long getId_enterprice() {
        return id_enterprice;
    }

    public void setId_enterprice(Long id_enterprice) {
        this.id_enterprice = id_enterprice;
    }
    //NAME OF ENTERPRISE
    public String getName_enterprice() {
        return name_enterprice;
    }

    public void setName_enterprice(String name_enterprice) {
        this.name_enterprice = name_enterprice;
    }
    //GEOLOCATION OF ENTERPPRICE
    public String getGeolocation_enterprice() {
        return geolocation_enterprice;
    }

    public void setGeolocation_enterprice(String geolocation_enterprice) {
        this.geolocation_enterprice = geolocation_enterprice;
    }
    //PHONE OF ENTERPRICE
    public String getPhone_enterprice() {
        return phone_enterprice;
    }

    public void setPhone_enterprice(String phone_enterprice) {
        this.phone_enterprice = phone_enterprice;
    }
    //NAME OF WORK
    public String getName_work() {
        return name_work;
    }
    
    public void setName_work(String name_work) {
        this.name_work = name_work;
    }
    //POSITION OF WORK
    public String getPosition_work() {
        return position_work;
    }

    public void setPosition_work(String position_work) {
        this.position_work = position_work;
    }
    
    
}
