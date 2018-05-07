package com.mycompany.careerguidence.dao.type;


public class Users {
   
    //FIELDS OF USER
    private Long id_user;
    private int age_user;
    private String name_user;
    private String surname_user;
    private String email_user;
    private String login_user;
    private String password_user;
    //FIELDS  ROLE   
    private String name_role;
    
    //ID OF USER
    public Long getId() {
        return id_user;
    }
    public void setId(Long id_user) {
        this.id_user = id_user;
    }
    
    //AGE OF USER
    public int getAge() {
        return age_user;
    }
    public void setAge(int age_user) {
        this.age_user = age_user;
    }
    
    //NAME OF USER
    public String getName() {
        return name_user;
    }
    public void setName(String name_user) {
        this.name_user = name_user;
    }
    
    //SURNAME OF USER
    public String getSurname() {
        return surname_user;
    }
    public void setSurname(String surname_user) {
        this.surname_user = surname_user;
    }
    
    //EMAIL OF USER
    public String getEmail() {
        return email_user;
    }
    public void setEmail(String email_user) {
        this.email_user = email_user;
    }
    
    //LOGIN OF USER
    public String getLogin() {
        return login_user;
    }
    public void setLogin(String login_user) {
        this.login_user = login_user;
    }
    
    //PASSWORD OF USER
    public String getPassword() {
        return password_user;
    }
    public void setPassword(String password_user) {
        this.password_user = password_user;
    }
    
    //NAME OF ROLE
    public String getName_role() {
        return name_role;
    }
    public void setName_role(String name_role) {
        this.name_role = name_role;
    }   
    
}
