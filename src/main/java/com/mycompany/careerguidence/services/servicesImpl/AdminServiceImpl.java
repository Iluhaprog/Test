package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Answer;
import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Role;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.dao.type.Work;
import com.mycompany.careerguidence.mappers.AnswersMapper;
import com.mycompany.careerguidence.mappers.EnterpricesMapper;
import com.mycompany.careerguidence.mappers.ProfessionsMapper;
import com.mycompany.careerguidence.mappers.QuestionsMapper;
import com.mycompany.careerguidence.mappers.RolesMapper;
import com.mycompany.careerguidence.mappers.TestsMapper;
import com.mycompany.careerguidence.mappers.UsersMapper;
import com.mycompany.careerguidence.mappers.WorksMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.AdminService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*

    This code was written by 
    Ilya, Vlad, Egor, Vanya, Kolya!

*/

@Service 
@Transactional

public class AdminServiceImpl implements AdminService{

    @Autowired
    TestsMapper tm;
    UsersMapper um;
    AnswersMapper am;
    EnterpricesMapper em;
    ProfessionsMapper pm;
    QuestionsMapper qm;
    EnterpricesMapper entrpsrvce;
    WorksMapper wrksrvce;
    RolesMapper rm;
    
    //    G E T   A L L   T E S T S
    @Override
    public List<Test> getAllTests() {
        
        try{
            return tm.getAll();
        }
        catch(Exception ex){
           throw ex;
        }
    }
     //  G E T    S I N G L E    T E S T 
    @Override
    public Test geTestById(Long id) {
        
        try{
            return tm.getTestById(id);
        }
        catch(Exception ex){
           throw ex;
        }
    }
    
    //  G E T    A L L    U S E R S
    @Override
     public List<User> getAll(){
         
         
        try{
            return um.getAll();
        }
        catch(Exception ex){
            throw ex;
        }
         
     }
     //update user
     @Override
     public void updateUser(User user){
         try{
             um.updateUser(user);
         }
         catch(Exception ex){
            throw ex;
         }
     }
     
    //          !!!         END SERVICES BY ILYA        !!!
     
    //__________________________________________________________________________
    //                          SERVICES BY EGOR
    //G E T   S P E C I A L I Z E   B Y   I D
    @Override
    public Profession getProfessionAdmin(Long id) {
        try{ 
            return pm.getProfession(id,id); 
        } 
        catch(Exception ex){ 
            throw ex;
        } 
            
    }
    //G E T   E N T E R P R I C E   B Y   I D 
    @Override
    public Enterprice getEnterpriceAdmin(Long id) {
        try{ 
            return em.getEnterpriceAdmin(id); 
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    }
    //G E T    U S E R    B Y    I D
    @Override
    public User getUserForAdmin(Long id) {
        try{ 
            return um.getUserForAdmin(id); 
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    }
    //D E L E T E    U S E R    B Y   I D
    @Override
    public void deleteUser(Long id) {
        try{ 
            um.deleteUserById(id); 
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    }
    //G E T    A L L   S P E C I A L I Z E S
    @Override
    public List<Profession> getAllProfession() {
        try{ 
           return pm.getAll();
        } 
        catch(Exception ex){ 
           throw ex;
        } 
    }
    //G E T    A L L   E N T E R P R I C E S
    @Override
    public List<Enterprice> getAllEnterprices() {
        try{ 
            return em.getAll();
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    }
    //D E L E T E    A L L    T E S T S
    @Override
    public void deleteAllTests() {
        try{ 
            tm.deleteAllTest(); 
        } 
        catch(Exception ex){ 
           throw ex;
        } 
    }
    //D E L E T E    A L L    U S E R S
    @Override
    public void deleteAllUsers() {
        try{ 
            um.deleteAllUsers();
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    }
    //          !!!        END SERVICE BY EGOR          !!!
    
    //__________________________________________________________________________
    //          !!!         SERVICES BY VANYA           !!!
    
    //(1)
    @Override
    public void updateEnterprice(Enterprice enterprices) {
        try{ 
            entrpsrvce.updateEnterprice(enterprices);
        } 
            catch(Exception ex){ 
            throw ex; 
        }

    }

    @Override
    public void deleteEnterpriceById(Long id) {
        try{ 
            entrpsrvce.deleteEnterpriceByid(id);
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    }


    @Override
    public void insertEnterprice(Enterprice enterprices) {
        try{
            entrpsrvce.insertEnterprice(enterprices);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void getEnterpriceById(Long id) {
        try{
        entrpsrvce.getEnterpriceAdmin(id);
        }
        catch(Exception ex){
           throw ex;
        }
    }
    //(2)
    @Override
    public void getWorkById(Long id) {
        try{
            wrksrvce.getWorkById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateWork(Work works) {
         try{ 
            wrksrvce.updateWork(works); 
        } 
        catch(Exception ex){ 
            throw ex;
        }     
    }
    
    @Override
    public List<Work> getAllWorks() {
        try{
            return wrksrvce.getAll(); 
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteWorkById(Long id) {
        try{ 
            wrksrvce.deleteWorkById(id);
        } 
        catch(Exception ex){ 
            throw ex; 
        } 
    }

    @Override
    public void insertWork(Work works) {
        try{
            wrksrvce.insertWork(works);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    //          !!!       END SERVICES BY VANYA         !!!
     
    //__________________________________________________________________________
    //          !!!        SERVICES BY KOLYA            !!!
    //(1)
   @Override 
    public Test getTestById(Long id){ 
        try{ 
            return tm.getTestById(id); 
        } 
        catch(Exception ex){ 
            throw ex; 
        } 
    }

    @Override 
    public void insertTest(Test test) { 
        try{ 
            tm.insertTest(test); 
        } 
        catch(Exception ex){ 
            throw ex;
        }  
    } 

    @Override 
    public void updateTest(Test test) { 
        try{ 
            tm.updateTestUser(test); 
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    } 

    @Override 
    public void deleteTestById(Long id) { 
        try{ 
            tm.deleteTestById(id); 
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    } 


    //(2)
    @Override 
    public void insertQuestion(Question question) { 
        try{ 
            qm.insertQuestion(question);
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    } 
    @Override 
    public Question getQuestionById(Long id) { 
        try{ 
            return qm.getQuestionById(id); 
        } 
        catch(Exception ex){ 
            throw ex; 
        } 
    } 
    @Override 
    public void updateQuestion(Question question) { 
        try{ 
            qm.insertQuestion(question); 
        } 
        catch(Exception ex){ 
            throw ex; 
        } 
    } 
    @Override 
    public void deleteQuestionnById(Long id){ 
        try{ 
            qm.deleteQuestionById(id); 
        } 
        catch(Exception ex){ 
            throw ex;
        } 
    } 
    @Override 
    public List<Question> getAllQuestion() { 
        try{ 
            return qm.getAll(); 
        } 
         catch(Exception ex){ 
             throw ex;
        } 
    } 
    
    //          !!!      END SERVICES BY KOLYA          !!!
    
    //__________________________________________________________________________
    //          !!!        SERVICES BY VLADIK           !!!
    
    @Override 
    public Answer getAnswersById(Long id) { 
        try{
            return am.getAnswerById(id);
        }
        catch(Exception ex){
            throw ex;
        }
    } 

    @Override 
    public void insertAnswers(Answer answer) { 
       try{
            am.insertAnswer(answer);
        }
        catch(Exception ex){
            throw ex;
            
        }
    } 

    @Override 
    public void updateAnswer(Answer answer) { 
       try{
            am.updateAnswer(answer);
        }
        catch(Exception ex){
            throw ex;
        }
    } 

    @Override 
    public void deleteAnswerById(Long id) { 
        try{
            am.deleteAnswerByid(id);
        }
        catch(Exception ex){
            throw ex;
        }
    } 
    @Override
    public List<Answer> getAllAnswers(){
        try{
            return am.getAll();
        }
        catch(Exception ex){
            throw ex;
        }    
    }

    
    //          !!!      END SERVICES BY VLADIK         !!!

    //                      G E T   B Y   N A M E
    @Override
    public User getUserByName(String name) {
        try{
            return um.getUserByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice getEnterpriceByName(String name) {
        try{
            return em.getEnterpriceByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Question getQuestionByName(String name) {
        try{
            return qm.getQuestionByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public Test getTestByName(String name) {
        try{
            return tm.getTestByName(name);
        }
        catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public Profession getResultByName(String name) {
        try{
            return pm.getProfessionByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    @Override
    public Role getROleByName(String name){
        try {
            return rm.getRoleByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    @Override
    public Work getWorkByName(String name){
        try {
            return wrksrvce.getWorkByName(name);
        }
        catch(Exception ex){
            throw ex;
        }  
    }
    @Override
    public Profession getProfessionByName(String name){
        try {
            return pm.getProfessionByName(name);
        }
        catch(Exception ex){
            throw ex;
        }
    }

}
