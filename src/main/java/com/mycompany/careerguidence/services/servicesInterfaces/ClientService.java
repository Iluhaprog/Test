package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Specialize;
import com.mycompany.careerguidence.dao.type.Test_has_Question;
import com.mycompany.careerguidence.dao.type.User;
import java.util.List;


public interface ClientService {
    
    
    //
    //              U S E R    A N D    E N T E R P R I C E
    //
    //                           L O G I N
    public User loginUser( String login , String password ); 
    public Enterprice loginEnterprice( String login , String password );
    //                    R E G I S T R A T I O N 
    public String registrationUser( User user );
    public void registrationEnterprice( Enterprice etreprice );
    //                          U P D A T E
    public void updateUser( User user );
    public void updateEnterprice( Enterprice etreprice );
    
    
    //
    //          T E S T S   ,     Q U E S T I O N S     ,   A N S W E R S 
    //
    //                      L I S T    Q U E S T I O N S
    public List<Question> getQuestions( Long id_user , Long id_test );
    //                        S E N D   A   T E S T
    public void postTest( Test_has_Question test);
    //                         G E T    R E S U L T
    public Specialize getResult( Long id_user , Long id_test );
    
}
