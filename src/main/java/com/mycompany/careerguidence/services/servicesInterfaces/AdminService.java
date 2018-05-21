package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Answer;
import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Profession;
import com.mycompany.careerguidence.dao.type.Question;
import com.mycompany.careerguidence.dao.type.Role;
import com.mycompany.careerguidence.dao.type.Test;
import com.mycompany.careerguidence.dao.type.User;
import com.mycompany.careerguidence.dao.type.Work;
import java.util.List;

/*

    This code was written by 
    Ilya, Vlad, Egor, Vanya, Kolya!

*/


public interface AdminService {
    
    
    // GET BY NAME
        public User getUserByName(String name);
        public Enterprice getEnterpriceByName( String name );
        public Question getQuestionByName(String name);
        public Test getTestByName(String name);
        public Profession getResultByName(String name);
        public Role getROleByName(String name);
        public Work getWorkByName(String name);
        public Profession getProfessionByName(String name);
    
    //
    
    //    G E T   A L L   T E S T S
    public List<Test> getAllTests();
    
    //  G E T    S I N G L E    T E S T 
    public Test geTestById( Long id );
    
    // G E T    A L L    U S E R S
    public List<User> getAll();
    
    //    !!!    SERVICES BY EGOR   !!!
    //G E T   S P E C I A L I Z E   B Y   I D
    public Profession getProfessionAdmin(Long id); 
    
    //G E T   E N T E R P R I C E   B Y   I D 
    public Enterprice getEnterpriceAdmin(Long id); 
    
    //G E T    U S E R    B Y    I D
    public User getUserForAdmin(Long id); 
    
    //D E L E T E    U S E R    B Y   I D
    public void deleteUser(Long id); 
    
    //G E T    A L L   S P E C I A L I Z E S
    public List<Profession> getAllProfession(); 
    
    //G E T    A L L   E N T E R P R I C E S
    public List<Enterprice> getAllEnterprices(); 
    
    //D E L E T E    A L L    T E S T S
    public void deleteAllTests(); 
    
    //D E L E T E    A L L    U S E R S
    public void deleteAllUsers();
    //update user
    public void updateUser(User user);
    
    //__________________________________________________________________________
    //          !!!         SERVICES BY VANYA           !!!

    public void getEnterpriceById(Long id); 


    public void updateEnterprice(Enterprice enterprices); 


    public void deleteEnterpriceById(Long id); 


    public void insertEnterprice(Enterprice enterprices);
    
    

    public  void getWorkById(Long id); 

    public void updateWork(Work work); 

    public void deleteWorkById(Long id); 

    public List<Work> getAllWorks();

    public void insertWork(Work work);
    
    
    //          !!!       END SERVICES BY VANYA         !!!
     
    //__________________________________________________________________________
    //          !!!        SERVICES BY KOLYA            !!!
    
        //INSERT 
    public void insertTest(Test test); 
    //SELECT BY ID 
    public Test getTestById(Long id); 
    //UPDATE 
    public void updateTest(Test test); 
    //DELETE 
    public void deleteTestById(Long id); 
    //INSERT 
    public void insertQuestion(Question quetion); 
    //GET BY ID 
    public Question getQuestionById(Long id); 
    //UPDATE 
    public void updateQuestion(Question question); 
    //DELETE BY ID 
    public void deleteQuestionnById(Long id); 
    //GET ALL 
    public List<Question> getAllQuestion();

    
    //          !!!      END SERVICES BY KOLYA          !!!
    
    //__________________________________________________________________________
    //          !!!        SERVICES BY VLADIK           !!!
    public Answer getAnswersById(Long id);


    public void insertAnswers(Answer answer);


    public void updateAnswer(Answer answer);


    public void deleteAnswerById(Long id);
    
    
    public List<Answer> getAllAnswers();
    //          !!!      END SERVICES BY VLADIK         !!!
    
    
}
