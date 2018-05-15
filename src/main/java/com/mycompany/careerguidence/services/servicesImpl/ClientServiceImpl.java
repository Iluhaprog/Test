package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Specialize;
import com.mycompany.careerguidence.dao.type.Test_has_Question;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.mappers.EnterpricesMapper;
import com.mycompany.careerguidence.mappers.QuestionsMapper;
import com.mycompany.careerguidence.mappers.SpecializesMapper;
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
    SpecializesMapper sm;
    
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
    //                        S E N D   A   T E S T
    @Override
    public void postTest(Test_has_Question test) {
        try{
           
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    //                         G E T    R E S U L T
    @Override
    public Specialize getResult(Long id_user, Long id_test) {
       try{
            return sm.getSpecialize(id_user,id_test);
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }      
    }
    
}
