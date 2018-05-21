package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.Test_has_Question;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.dao.type.UserAnswer;
import com.mycompany.careerguidence.mappers.EnterpricesMapper;
import com.mycompany.careerguidence.mappers.ProfessionsMapper;
import com.mycompany.careerguidence.mappers.QuestionsMapper;
import com.mycompany.careerguidence.mappers.TestsMapper;
import com.mycompany.careerguidence.mappers.UsersMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class ClientServiceImpl implements ClientService {
    
    @Autowired
    UsersMapper um;
    EnterpricesMapper em;
    QuestionsMapper qm;
    TestsMapper tm;
    ProfessionsMapper pm;
    
    //
    //              U S E R    A N D    E N T E R P R I C E
    //
    //                           L O G I N
    @Override
    public User loginUser(String login, String password) {
        try{
            return um.getUser( login , password );
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    //GET BY NAME
    public User getUserByName(String name){
        try{
            return um.getUserByName(name);
        }
        catch(Exception ex){
            System.out.println("error:" + ex);
            return um.getUserByName(name);
        }
    }

    @Override
    public Enterprice loginEnterprice(String login, String password) {
        try{
            return em.getEnterpriceClient(login , password);
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    //GET BY NAME
    public Enterprice getEnterpriceByName( String name ){
        try{
            return em.getEnterpriceByName(name);
        }
        catch(Exception ex){
            System.out.println("error: " + ex);
            return em.getEnterpriceByName(name);
        }
    }
    //                    R E G I S T R A T I O N 
    @Override
    public String registrationUser(User user) {
        try{
            if( user.getAge() >= 14 ){
                um.insertUser(user);
                return "ok";
            }
            else {
                return "registration is allowed from the age of 14 years" ;
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            return ex.toString();
        }
    }

    @Override
    public void registrationEnterprice(Enterprice etreprice) {
        try{
           em.insertEnterprice(etreprice);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    //                          U P D A T E
    @Override
    public void updateUser(User user) {
        try{
            um.updateUser(user);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

    @Override
    public void updateEnterprice(Enterprice etreprice) {
        try{
           em.updateEnterprice(etreprice);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    //
    //          T E S T S   ,     Q U E S T I O N S     ,   A N S W E R S 
    //
    //                      L I S T    Q U E S T I O N S
    @Override
    public List<Question> getQuestions(Long id_user, Long id_test) {
       try{
            return qm.getAll();
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    //GET BY NAME
    public Question getQuestionByName(String name){
        try{
            return qm.getQuestionByName(name);
        }
        catch(Exception ex){
            System.out.println("error: " + ex);
            return qm.getQuestionByName(name);
        }
    }
    //                        S E N D   A   T E S T
    @Override
    public void postTest(List<UserAnswer> user_answers) {
        try{
           
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public Test getTestByName(String name){
        try{
            return tm.getTestByName(name);
        }
        catch (Exception ex) {
            System.out.println("error : " + ex);
            return tm.getTestByName(name);
        }
    }
    //                         G E T    R E S U L T
    @Override
    public Profession getResult(Long id_user, Long id_test) {
       try{
            return pm.getProfession(id_user,id_test);
        }
        catch(Exception ex){
            System.out.println(ex);
            return pm.getProfession(id_user,id_test);
        }      
    }
    public  Profession getResultByName(String name){
        try{
            return pm.getProfessionByName(name);
        }
        catch(Exception ex){
            System.out.println("error: " + ex);
            return  pm.getProfessionByName(name);
        }
    }
    
}
