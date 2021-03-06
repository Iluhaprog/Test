package com.mycompany.careerguidence.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.dao.type.UserAnswer;
import com.mycompany.careerguidence.services.servicesInterfaces.AnswerService;
import com.mycompany.careerguidence.services.servicesInterfaces.EnterpriceService;
import com.mycompany.careerguidence.services.servicesInterfaces.QuestionService;
import com.mycompany.careerguidence.services.servicesInterfaces.TestService;
import com.mycompany.careerguidence.services.servicesInterfaces.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping("/client")

public class ClientController {
    
    @Autowired
    private TestService         tests_service;
    @Autowired
    private UserService         user_service;
    @Autowired
    private EnterpriceService   enterprice_service;
    @Autowired
    private QuestionService     question_service;
    @Autowired
    private AnswerService       answer_service;
    //
    //              U S E R    A N D    E N T E R P R I C E
    //
    
    @RequestMapping(value = "test" , method = RequestMethod.GET)
    public String test(){
        return "hello world";
    }
    
    //GET BY NAME
    @RequestMapping(value="/testbyname/{name}",method = RequestMethod.GET)
    public Test getTestByName(@PathVariable String name){
        return tests_service.getTestByName(name);
    }
    @RequestMapping(value="/userbyname/{name}",method = RequestMethod.GET)
    public User getUserByName(@PathVariable String name){
        return user_service.getUserByName(name);
    }
    @RequestMapping(value="/enterpricebyname/{name}",method = RequestMethod.GET)
    public Enterprice getEnterpriceByName(@PathVariable String name ){
        return enterprice_service.getEnterpriceByName(name);
    }
    
    //                           L O G I N
    @RequestMapping(value="/loginUser/login/{login}/pass/{password}",method = RequestMethod.GET)
    public User loginUser( @PathVariable String login , @PathVariable String password ){
        return user_service.getUserByLoginAndByPassword(login, password);
    } 
    
    @RequestMapping(value="/loginEnterprice/login/{login}/pass/{password}",method = RequestMethod.GET)
    public Enterprice loginEnterprice( @PathVariable String login , @PathVariable String password ){
        return enterprice_service.getEnterpriceByLoginAndByPassword(login, password);
    } 
    //                    R E G I S T R A T I O N 
    @RequestMapping(value="/registrationUser",method = RequestMethod.POST)
    public void registrationUser( User user ){
        user_service.insertUser(user);
    } 
    
    @RequestMapping(value="/registrationEnterprice",method = RequestMethod.POST)
    public void registrationEnterprice( Enterprice etreprice ){
        enterprice_service.insertEnterprice(etreprice);
    } 
    //                          U P D A T E
    @RequestMapping(value="/updateUser",method = RequestMethod.PUT)
    public void updateUser( User user ){
        user_service.updateUser(user);
    } 
    
    @RequestMapping(value="/updateEnterprice",method = RequestMethod.PUT)
    public void updateEnterprice( Enterprice etreprice ){
        enterprice_service.updateEnterprice(etreprice);
    } 
    
    //
    //          T E S T S   ,     Q U E S T I O N S     ,   A N S W E R S 
    //
    //                      L I S T    Q U E S T I O N S
    @RequestMapping(value="/login/{id_user}/test/{id_test}",method = RequestMethod.GET)
    public List<Question> getQuestions( @PathVariable Long id_user , @PathVariable Long id_test ){
        return question_service.getQuestions(id_user, id_test);
    }
     //GET BY NAME
    @RequestMapping(value="/questionbyname/{name}",method = RequestMethod.GET)
    public Question getQuestionByName(@PathVariable String name){
        return question_service.getQuestionByName(name);
    }
    //          S E N D   A   T E S T   T O   G E T   T H E   R E S U L T
    @RequestMapping(value="/test/{answers}",method = RequestMethod.POST)
    public void postTest( @PathVariable List<UserAnswer> answers){
        answer_service.insertUserAnswers(answers);
    }
    //                         G E T    R E S U L T
    @RequestMapping(value="/login/{id_user}/test/{id_test}/result",method = RequestMethod.GET)
    public  String getResult( @PathVariable Long id_user , @PathVariable Long id_test ){
        return answer_service.getResult(id_user, id_test);
    }        
    
}
