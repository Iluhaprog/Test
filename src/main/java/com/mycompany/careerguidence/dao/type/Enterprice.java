package com.mycompany.careerguidence.dao.type;


public class Enterprice {
    
    //FIELDS OF ENTERPRICE
    private Long id_enterprice;
    private String login_enterprice;
    private String password_enterprice;
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
    
    //LOGIN OF ENTERPRICE
    public String getLogin_enterprice() {
        return login_enterprice;
    }

    public void setLogin_enterprice(String login_enterprice) {
        this.login_enterprice = login_enterprice;
    }
    //PASSWORD OF ENTERPRICE
    public String getPassword_enterprice() {
        return password_enterprice;
    }

    public void setPassword_enterprice(String password_enterprice) {
        this.password_enterprice = password_enterprice;
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
