package com.mycompany.careerguidence.controllers;

import com.mycompany.careerguidence.dao.type.Answer;
import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.services.servicesInterfaces.AnswerService;
import com.mycompany.careerguidence.services.servicesInterfaces.EnterpriceService;
import com.mycompany.careerguidence.services.servicesInterfaces.ProfessionService;
import com.mycompany.careerguidence.services.servicesInterfaces.QuestionService;
import com.mycompany.careerguidence.services.servicesInterfaces.RoleService;
import com.mycompany.careerguidence.services.servicesInterfaces.TestService;
import com.mycompany.careerguidence.services.servicesInterfaces.UserService;
import com.mycompany.careerguidence.services.servicesInterfaces.WorkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*

    This code was written by 
    Ilya, Vlad, Egor, Vanya, Kolya!

*/


@RestController 
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    TestService         ts;
    UserService         us;
    EnterpriceService   es;
    QuestionService     qs;
    AnswerService       as;
    ProfessionService   ps;
    RoleService         rs;
    WorkService         ws;
    
    
    //__________________________________________________________________________
    //          !!!     CONTROLERS BY ILYA      !!!
    //    G E T   A L L   T E S T S
    @RequestMapping(value = "/allTest" ,method = RequestMethod.GET)
    public List<Test> getAllTests(){
        return ts.getAllTests();
    }
    //  G E T    T E S T   B Y   I D    
    @RequestMapping(value="/test/{id}",method = RequestMethod.GET)
    public Test geTestById( @PathVariable Long id ){
        return ts.getTestById(id);
    }
    //          !!! END CONTROLLERS BY ILYA
    
    //__________________________________________________________________________
    //    !!!      CONTROLERS BY EGOR     !!!
    //G E T    U S E R    B Y    I D
    @RequestMapping(value = "/-//-/getUser", method = RequestMethod.GET) 
    public User getUser( 
    @RequestParam(value = "id", required = false, defaultValue = "0") Long id){ 
        return us.getUserById(id);
    } 

    //G E T   A L L   E N T E R P R I C E S 
    @RequestMapping(value = "/-//-/getAllSpecializes", method = RequestMethod.GET) 
    public List<Profession> getAllProfessions(){ 
        return ps.getAllProfessions();
    } 

    //G E T   S P E C I A L I Z E   B Y   I D
    @RequestMapping(value = "/-//-/getSpecialize", method = RequestMethod.GET) 
    public Profession getSpecialize( 
    @RequestParam(value = "id", required = false, defaultValue = "0") Long id){ 
        return ps.getProfessionById(id);
    } 

    //G E T   E N T E R P R I C E   B Y   I D 
    @RequestMapping(value = "/-//-/getCompany", method = RequestMethod.GET) 
    public Enterprice getEnterprice( 
    @RequestParam(value = "id", required = false, defaultValue = "0") Long id){ 
        return es.getEnterpriceById(id);
    } 

    //G E T    A L L   E N T E R P R I C E S
    @RequestMapping(value = "/-//-/getAllEnterprice", method = RequestMethod.GET) 
    public List<Enterprice> getAllEnterprices(){ 
        return es.getAll();
    } 

    //D E L E T E    U S E R    B Y   I D
    @RequestMapping(path="/deleteUser/{deleteId}" , method = RequestMethod.DELETE) 
    public void deleteUser( @PathVariable("deleteId") Long id ){ 
        us.deleteUserByid(id);
    } 

    //D E L E T E    A L L    U S E R S
    @RequestMapping(path="/deleteAllUsers", method = RequestMethod.DELETE) 
    public void DeleteAllUsers(){ 
        us.deleteAllUsers();
    } 

    //D E L E T E    A L L    T E S T S
    @RequestMapping(path="/deleteAllTests", method = RequestMethod.DELETE) 
    public void DeleteAllTests(){ 
        ts.deleteAllTest();
    } 
    //          !!! END CONTROLLERS BY EGOR  !!!
    
    //__________________________________________________________________________
    //     !!!     CONTROLLERS BY VANYA      !!!
    //Удаляет ответы по id 
    @RequestMapping(path="/deleteid/{DeleteAnswerByID}" , method = RequestMethod.DELETE) 
    public void DeleteAnswerById( @PathVariable("DeleteAnswerByID") Long id){ 
        as.deleteAnswerById(id);
    } 
    
    //Удаляет все ответы 
    @RequestMapping(path="/deleteAll" , method = RequestMethod.DELETE) 
    public void DeleteAnswersAll(){ 
        as.getAllAnswers();
    } 
    
    // Обновляет тесты 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void UpdateTest(@RequestBody Test tests) { 
        ts.updateTest(tests);
    } 
    
    //Обновляет вопросы 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateQuestion(@RequestBody Question questions) { 
        qs.updateQuestion(questions);
    } 
    
    //Обновление вопросов 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateAnswer(@RequestBody Answer answers) { 
        as.updateAnswer(answers);
    } 
    
    //Обновление юзеров 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateUsers(@RequestBody User users) { 
        us.updateUser(users);
    } 
    
    //обновление компаний 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateEnterprice(@RequestBody Enterprice interprices) { 
        es.updateEnterprice(interprices);
    } 
    //      !!! END CONTROLLERS BY VANYA !!!
    
    //__________________________________________________________________________
    //      !!!     CONTROLLERS BY KOLYA       !!!
    //D E L E T E    T E S T   B Y  I D
    @RequestMapping(path="/deleteid/{deleteTestById}" , method = RequestMethod.DELETE) 
    public void deleteTestById( @PathVariable("deleteTestById") Long id){ 
        ts.deleteTestById(id);
    } 
    //D E L E T E   P R O F E S S I O N   B Y   I D
    @RequestMapping(path="/deletePositionById/{deletePositionById}" , method = RequestMethod.DELETE) 
    public void deleteWorkById( @PathVariable("deletePositionById") Long id){ 
        ws.deleteWorkbyId(id);
    } 
    //D E L E T E    A L L    P R O F E S S I O N
//    @RequestMapping(path = "/deleteAllWorks",method = RequestMethod.DELETE) 
//    public void deleteAllWorks(@RequestBody Profession position) { 
//        ws.deleteAllWorks();
//    } 
    //D E L E T E    A L L    E N T E R P R I C E S
    @RequestMapping(path = "/deleteAllEnterprices",method = RequestMethod.DELETE) 
    public void deleteAllEnterprices(@RequestBody Enterprice enterprice) { 
        es.deleteAllEnterprices();
    } 
    //D E L E T E   E N T E R P R I C E   B Y   I D
    @RequestMapping(path = "/deleteEnterpricesById",method = RequestMethod.DELETE) 
    public void deleteEnterpricesById(Long id) {
        es.deleterEnterpriceById(id);
    } 
    //DELETE QUESTION BY ID
    @RequestMapping(path = "/deleteQustionById",method = RequestMethod.DELETE) 
    public void deleteQustionById(Long id) { 
        qs.deleteQuestionById(id);
    } 
    @RequestMapping(path = "/delete/deleteid",method = RequestMethod.DELETE)
    public void deleteAllQuestion(Long id) { 
        qs.deleteAllQuestions();
    } 
    //          !!! END CONTROLLERS BY KOLYA !!!
    
    //__________________________________________________________________________
    //          C O N T R O L L E R S    B Y     V L A D I K
    
    @RequestMapping(path = "/getanswerbyid",method = RequestMethod.GET)
    public Answer getAnswerById(Long id){
        return as.getAnswerById(id);
    }
    
    @RequestMapping(path = "/insertanswer",method = RequestMethod.POST)
    public void insertAnswer(@RequestBody Answer answer){
        as.inserAnswer(answer);
    }
    
    @RequestMapping(path = "/deleteanswer",method = RequestMethod.DELETE)
    public void deleteAnswer(Long id){
        as.deleteAnswerById(id);
    }
    
    
    
    //          !!! END CONTROLLERS BY VLADIK !!!
    
}
