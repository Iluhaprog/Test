package com.mycompany.careerguidence.dao.type;


public class Enterprices {
    
    //FIELDS OF ENTERPRICE
    private Long id_enterprice;
    private String name_enterprice;
    private String geolocation_enterprice;
    private String phone_enterprice;

    //ID OF ENTERPRICE
    public long getId_enterprice() {
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
    
}
