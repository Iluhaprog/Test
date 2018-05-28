package com.mycompany.careerguidence.services.servicesInterfaces;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Enterprice_has_work;
import java.util.List;


public interface EnterpriceService {
    
    public Enterprice getEnterpriceById(Long id);
    public Enterprice getEnterpriceByName(String name);
    public void insertEnterprice(Enterprice enterprice);
    public void updateEnterprice(Enterprice enterprice);
    public void deleterEnterpriceById(Long id);
    public List<Enterprice> getAll();
    public Enterprice_has_work getEnterpriceWithWorkById(Long id);
    public Enterprice getEnterpriceByLoginAndByPassword(String login , String password);
    public void deleteAllEnterprices();
    
}
