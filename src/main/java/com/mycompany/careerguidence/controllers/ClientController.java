package com.mycompany.careerguidence.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.Test_has_Question;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.services.servicesInterfaces.ClientService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping("/client")

public class ClientController {
    
    @Autowired
    ClientService cl;
    //
    //              U S E R    A N D    E N T E R P R I C E
    //
    
    //GET BY NAME
    @RequestMapping(value="/testbyname/{name}",method = RequestMethod.GET)
    public Test getTestByName(@PathVariable String name){
        return cl.getTestByName(name);
    }
    @RequestMapping(value="/userbyname/{name}",method = RequestMethod.GET)
    public User getUserByName(@PathVariable String name){
        return cl.getUserByName(name);
    }
    @RequestMapping(value="/enterpricebyname/{name}",method = RequestMethod.GET)
    public Enterprice getEnterpriceByName(@PathVariable String name ){
        return cl.getEnterpriceByName(name);
    }
    
    //                           L O G I N
    @RequestMapping(value="/loginUser/login/{login}/pass/{password}",method = RequestMethod.GET)
    public User loginUser( @PathVariable String login , @PathVariable String password ){
        return cl.loginUser(login, password);
    } 
    
    @RequestMapping(value="/loginEnterprice/login/{login}/pass/{password}",method = RequestMethod.GET)
    public Enterprice loginEnterprice( @PathVariable String login , @PathVariable String password ){
        return cl.loginEnterprice(login, password);
    } 
    //                    R E G I S T R A T I O N 
    @RequestMapping(value="/registrationUser",method = RequestMethod.POST)
    public String registrationUser( User user ){
        return cl.registrationUser(user);
    } 
    
    @RequestMapping(value="/registrationEnterprice",method = RequestMethod.POST)
    public void registrationEnterprice( Enterprice etreprice ){
        cl.registrationEnterprice(etreprice);
    } 
    //                          U P D A T E
    @RequestMapping(value="/updateUser",method = RequestMethod.PUT)
    public void updateUser( User user ){
        cl.updateUser(user);
    } 
    
    @RequestMapping(value="/updateEnterprice",method = RequestMethod.PUT)
    public void updateEnterprice( Enterprice etreprice ){
        cl.updateEnterprice(etreprice);
    } 
    
    //
    //          T E S T S   ,     Q U E S T I O N S     ,   A N S W E R S 
    //
    //                      L I S T    Q U E S T I O N S
    @RequestMapping(value="/login/{id_user}/test/{id_test}",method = RequestMethod.GET)
    public List<Question> getQuestions( @PathVariable Long id_user , @PathVariable Long id_test ){
        return null;
    }
     //GET BY NAME
    @RequestMapping(value="/questionbyname/{name}",method = RequestMethod.GET)
    public Question getQuestionByName(@PathVariable String name){
        return cl.getQuestionByName(name);
    }
    //          S E N D   A   T E S T   T O   G E T   T H E   R E S U L T
    @RequestMapping(value="/test/{test}",method = RequestMethod.POST)
    public void postTest( @PathVariable Test_has_Question test){
        
    }
    //                         G E T    R E S U L T
    @RequestMapping(value="/login/{id_user}/test/{id}/result",method = RequestMethod.GET)
    public  Profession getResult( @PathVariable Long id_user , @PathVariable Long id_test ){
        return cl.getResult(id_user, id_test);
    }
    //GET BY NAME
    @RequestMapping(value="/result/{name}",method = RequestMethod.GET)
    public  Profession getResultByName(@PathVariable String name){
        return cl.getResultByName(name);
    }
    
    
    
    
        
    
}
