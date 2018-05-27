package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.dao.type.UserAnswer;
import com.mycompany.careerguidence.mappers.AnswersMapper;
import com.mycompany.careerguidence.mappers.EnterpricesMapper;
import com.mycompany.careerguidence.mappers.ProfessionsMapper;
import com.mycompany.careerguidence.mappers.QuestionsMapper;
import com.mycompany.careerguidence.mappers.TestsMapper;
import com.mycompany.careerguidence.mappers.UsersMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.ClientService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional

public class ClientServiceImpl implements ClientService {
    
    @Autowired
    UsersMapper um;
    EnterpricesMapper em;
    QuestionsMapper qm;
    TestsMapper tm;
    ProfessionsMapper pm;
    AnswersMapper am;
    
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
            throw ex;
        }
    }
    //GET BY NAME
    public User getUserByName(String name){
        try{
            return um.getUserByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice loginEnterprice(String login, String password) {
        try{
            return em.getEnterpriceClient(login , password);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    //GET BY NAME
    public Enterprice getEnterpriceByName( String name ){
        try{
            return em.getEnterpriceByName(name);
        }
        catch(Exception ex){
            throw ex;
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
            throw ex;
        }
    }

    @Override
    public void registrationEnterprice(Enterprice etreprice) {
        try{
           em.insertEnterprice(etreprice);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    //                          U P D A T E
    @Override
    public void updateUser(User user) {
        try{
            um.updateUser(user);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateEnterprice(Enterprice etreprice) {
        try{
           em.updateEnterprice(etreprice);
        }
        catch(Exception ex){
            throw ex;
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
            throw ex;
        }
    }
    //GET BY NAME
    public Question getQuestionByName(String name){
        try{
            return qm.getQuestionByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    //                        S E N D   A   T E S T
    @Override
    public void postTest(List<UserAnswer> user_answers) {
        try{
          am.insertUserAnswers(user_answers);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    public Test getTestByName(String name){
        try{
            return tm.getTestByName(name);
        }
        catch (Exception ex) {
            throw ex;
        }
    }
    //                         G E T    R E S U L T
    @Override
    public String getResult(Long id_user, Long id_test) {
       try{
           Profession pf = pm.getProfession(id_user, id_test);
            return pf.getName_profession();
        }
        catch(Exception ex){
           throw ex;
        }      
    }
    public  Profession getResultByName(String name){
        try{
            return pm.getProfessionByName(name);
        }
        catch(Exception ex){
           throw ex;
        }
    }
    
}
