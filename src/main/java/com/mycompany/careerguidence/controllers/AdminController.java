package com.mycompany.careerguidence.controllers;

import com.mycompany.careerguidence.dao.type.Answer;
import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Specialize;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.services.servicesInterfaces.AdminService;
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
    AdminService as;
    
    //__________________________________________________________________________
    //          !!!     CONTROLERS BY ILYA      !!!
    //    G E T   A L L   T E S T S
    @RequestMapping(value = "/allTest" ,method = RequestMethod.GET)
    public List<Test> getAllTests(){
        return as.getAllTests();
    }
    //  G E T    T E S T   B Y   I D    
    @RequestMapping(value="/test/{id}",method = RequestMethod.GET)
    public Test geTestById( @PathVariable Long id ){
        return as.geTestById(id);
    }
    //          !!! END CONTROLLERS BY ILYA
    //__________________________________________________________________________
    //    !!!      CONTROLERS BY EGOR     !!!
    //G E T    U S E R    B Y    I D
    @RequestMapping(value = "/-//-/getUser", method = RequestMethod.GET) 
    public User getUser( 
    @RequestParam(value = "id", required = false, defaultValue = "0") Long id){ 
        return as.getUserForAdmin(id); 
    } 

    //G E T   A L L   E N T E R P R I C E S 
    @RequestMapping(value = "/-//-/getAllSpecializes", method = RequestMethod.GET) 
    public List<Specialize> getAllSpecialize(){ 
        return as.getAllSpecializes(); 
    } 

    //G E T   S P E C I A L I Z E   B Y   I D
    @RequestMapping(value = "/-//-/getSpecialize", method = RequestMethod.GET) 
    public Specialize getSpecialize( 
    @RequestParam(value = "id", required = false, defaultValue = "0") Long id){ 
        return as.getSpecializeAdmin(id); 
    } 

    //G E T   E N T E R P R I C E   B Y   I D 
    @RequestMapping(value = "/-//-/getCompany", method = RequestMethod.GET) 
    public Enterprice getEnterprice( 
    @RequestParam(value = "id", required = false, defaultValue = "0") Long id){ 
        return as.getEnterpriceAdmin(id); 
    } 

    //G E T    A L L   E N T E R P R I C E S
    @RequestMapping(value = "/-//-/getAllEnterprice", method = RequestMethod.GET) 
    public List<Enterprice> getAllEnterprices(){ 
        return as.getAllEnterprices(); 
    } 

    //D E L E T E    U S E R    B Y   I D
    @RequestMapping(path="/deleteUser/{deleteId}" , method = RequestMethod.DELETE) 
    public void deleteUser( @PathVariable("deleteId") Long id ){ 
        as.deleteUser(id); 
    } 

    //D E L E T E    A L L    U S E R S
    @RequestMapping(path="/deleteAllUsers", method = RequestMethod.DELETE) 
    public void DeleteAllUsers(){ 
        as.deleteAllUsers();
    } 

    //D E L E T E    A L L    T E S T S
    @RequestMapping(path="/deleteAllTests", method = RequestMethod.DELETE) 
    public void DeleteAllTests(){ 
        as.deleteAllTests();
    } 
    //          !!! END CONTROLLERS BY EGOR  !!!
    //__________________________________________________________________________
    //     !!!     CONTROLLERS BY VANYA      !!!
    //Удаляет ответы по id 
    @RequestMapping(path="/deleteid/{DeleteAnswerByID}" , method = RequestMethod.DELETE) 
    public void DeleteAnswerById( @PathVariable("DeleteAnswerByID") Answer id){ 
    } 
    
    //Удаляет все ответы 
    @RequestMapping(path="/deleteAll" , method = RequestMethod.DELETE) 
    public void DeleteAnswersAll(){ 
    } 
    
    // Обновляет тесты 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void UpdateTests(@RequestBody Test tests) { 
    } 
    
    //Обновляет вопросы 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateQuestions(@RequestBody Question questions) { 
    } 
    
    //Обновление вопросов 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateAnswers(@RequestBody Answer answers) { 
    } 
    
    //Обновление юзеров 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateUsers(@RequestBody User users) { 
    } 
    
    //обновление компаний 
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
    public void updateInterprices(@RequestBody Enterprice interprices) { 
    } 
    //      !!! END CONTROLLERS BY VANYA
    //__________________________________________________________________________
    //      !!!     CONTROLLERS BY KOLYA       !!!
    //D E L E T E    T E S T   B Y  I D
    @RequestMapping(path="/deleteid/{deleteTestById}" , method = RequestMethod.DELETE) 
    public void deleteTestById( @PathVariable("deleteTestById") Test id){ 
    } 
    //D E L E T E   P R O F E S S I O N   B Y   I D
    @RequestMapping(path="/deletePositionById/{deletePositionById}" , method = RequestMethod.DELETE) 
    public void deletePositionById( @PathVariable("deletePositionById") Profession id){ 
    } 
    //D E L E T E    A L L    P R O F E S S I O N
    @RequestMapping(path = "/deleteAllPosition",method = RequestMethod.DELETE) 
    public void deleteAllPosition(@RequestBody Profession position) { 
    } 
    //D E L E T E    A L L    E N T E R P R I C E S
    @RequestMapping(path = "/deleteAllEnterprices",method = RequestMethod.DELETE) 
    public void deleteAllEnterprices(@RequestBody Enterprice enterprice) { 
    } 
    //D E L E T E   E N T E R P R I C E   B Y   I D
    @RequestMapping(path = "/deleteEnterpricesById",method = RequestMethod.DELETE) 
    public void deleteEnterpricesById(@RequestBody Enterprice enterprice) { 
    } 
    //DELETE QUESTION BY ID
    @RequestMapping(path = "/deleteQustionById",method = RequestMethod.DELETE) 
    public void deleteQustionById(@RequestBody Question id) { 
    } 
    //???????????????UPDATE OR DELETE ALL QUESTIONS
    @RequestMapping(path = "/update/updateid",method = RequestMethod.PUT)//OR DELETE  
    public void deleteAllQuestion(@RequestBody Question id) { 
    } 
    //          !!! END CONTROLLERS BY KOLYA
    
}