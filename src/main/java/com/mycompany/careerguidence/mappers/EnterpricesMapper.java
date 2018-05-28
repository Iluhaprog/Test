package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Enterprice_has_work;
import com.mycompany.careerguidence.dao.type.Enterprice;
import java.util.List;

public interface EnterpricesMapper {
    
    //INSERT
    public void insertEnterprice(Enterprice enterprice);
    //GET BY LOGIN + PASSWORD FOR CLIENT
    public Enterprice getEnterpriceByLoginAndByPassword(String login , String password);
    //GET ENTERPRICE BY ID FOR ADMIN
    public Enterprice getEnterpriceById(Long id);
    //UPDATE
    public void updateEnterprice(Enterprice enterprice);
    //DELETE BY ID
    public void deleteEnterpriceByid(Long id);
    //GET ALL
    public List<Enterprice> getAll();
    //GET ENTERPRICE WITH WORK
    public Enterprice_has_work getEnterpriseWithWorkById(Long id);
    //GET ENTERPRICE BY NAME
    public Enterprice getEnterpriceByName(String name);
    //
    public void deleteAllEnterprices();
    
}
