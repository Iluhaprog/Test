package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Specialize;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.mappers.AnswersMapper;
import com.mycompany.careerguidence.mappers.EnterpricesMapper;
import com.mycompany.careerguidence.mappers.SpecializesMapper;
import com.mycompany.careerguidence.mappers.TestsMapper;
import com.mycompany.careerguidence.mappers.UsersMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/*

    This code was written by 
    Ilya, Vlad, Egor, Vanya, Kolya!

*/

public class AdminServiceImpl implements AdminService{

    @Autowired
    TestsMapper tm;
    UsersMapper um;
    AnswersMapper am;
    EnterpricesMapper em;
    SpecializesMapper sm;
    
    //    G E T   A L L   T E S T S
    @Override
    public List<Test> getAllTests() {
        
        try{
            return tm.getAll();
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
     //  G E T    S I N G L E    T E S T 
    @Override
    public Test geTestById(Long id) {
        
        try{
            return tm.getTestById(id);
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    
    //  G E T    A L L    U S E R S
     public List<User> getAll(){
         
         
        try{
            return um.getAll();
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
         
     }
    //          !!!         END SERVICES BY ILYA        !!!
     
    //__________________________________________________________________________
    //                          SERVICES BY EGOR
    //G E T   S P E C I A L I Z E   B Y   I D
    @Override
    public Specialize getSpecializeAdmin(Long id) {
        try{ 
            return sm.getSpecialize(id,id); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
            return sm.getSpecialize(id,id); 
    }
    //G E T   E N T E R P R I C E   B Y   I D 
    @Override
    public Enterprice getEnterpriceAdmin(Long id) {
        try{ 
            return em.getEnterpriceAdmin(id); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
        return em.getEnterpriceAdmin(id); 
    }
    //G E T    U S E R    B Y    I D
    @Override
    public User getUserForAdmin(Long id) {
        try{ 
            return um.getUserForAdmin(id); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
        return um.getUserForAdmin(id);  
    }
    //D E L E T E    U S E R    B Y   I D
    @Override
    public void deleteUser(Long id) {
        try{ 
            um.deleteUserById(id); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
    }
    //G E T    A L L   S P E C I A L I Z E S
    @Override
    public List<Specialize> getAllSpecializes() {
        try{ 
            sm.getAll();
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
        return sm.getAll();
    }
    //G E T    A L L   E N T E R P R I C E S
    @Override
    public List<Enterprice> getAllEnterprices() {
        try{ 
            return em.getAll();
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
        return em.getAll();
    }
    //D E L E T E    A L L    T E S T S
    @Override
    public void deleteAllTests() {
        try{ 
            tm.deleteAllTest(); 
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
    }
    //D E L E T E    A L L    U S E R S
    @Override
    public void deleteAllUsers() {
        try{ 
            um.deleteAllUsers();
        } 
        catch(Exception exception){ 
            System.out.println("error : " + exception); 
        } 
    }
    //          !!!        END SERVICE BY EGOR          !!!
    
    //__________________________________________________________________________
    //          !!!         SERVICES BY VANYA           !!!
    
    //                        IN DEVELOPING...
    
    //          !!!       END SERVICES BY VANYA         !!!
     
    //__________________________________________________________________________
    //          !!!        SERVICES BY KOLYA            !!!
    
    //          !!!      END SERVICES BY KOLYA          !!!
    
}
