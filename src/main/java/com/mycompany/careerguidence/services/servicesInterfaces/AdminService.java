package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Specialize;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import java.util.List;

/*

    This code was written by 
    Ilya, Vlad, Egor, Vanya, Kolya!

*/


public interface AdminService {
    
    //    G E T   A L L   T E S T S
    public List<Test> getAllTests();
    
    //  G E T    S I N G L E    T E S T 
    public Test geTestById( Long id );
    
    // G E T    A L L    U S E R S
    public List<User> getAll();
    
    //    !!!    SERVICES BY EGOR   !!!
    //G E T   S P E C I A L I Z E   B Y   I D
    public Specialize getSpecializeAdmin(Long id); 
    
    //G E T   E N T E R P R I C E   B Y   I D 
    public Enterprice getEnterpriceAdmin(Long id); 
    
    //G E T    U S E R    B Y    I D
    public User getUserForAdmin(Long id); 
    
    //D E L E T E    U S E R    B Y   I D
    public void deleteUser(Long id); 
    
    //G E T    A L L   S P E C I A L I Z E S
    public List<Specialize> getAllSpecializes(); 
    
    //G E T    A L L   E N T E R P R I C E S
    public List<Enterprice> getAllEnterprices(); 
    
    //D E L E T E    A L L    T E S T S
    public void deleteAllTests(); 
    
    //D E L E T E    A L L    U S E R S
    public void deleteAllUsers();
    
    //__________________________________________________________________________
    //          !!!         SERVICES BY VANYA           !!!
    
    //                        IN DEVELOPING...
    
    //          !!!       END SERVICES BY VANYA         !!!
     
    //__________________________________________________________________________
    //          !!!        SERVICES BY KOLYA            !!!
    
    //          !!!      END SERVICES BY KOLYA          !!!
    
    
}
