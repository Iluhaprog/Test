package com.mycompany.careerguidence.mappers;

import com.mycompany.careerguidence.dao.type.Enterprice_has_work;
import com.mycompany.careerguidence.dao.type.Enterprices;
import java.util.List;

public interface EnterpricesMapper {
    
    //INSERT
    public void insertEnterprice(Enterprices enterprice);
    //GET BY ID
    public Enterprices getEnterpriceById(Long id);
    //UPDATE
    public void updateEnterprice(Enterprices enterprice);
    //DELETE BY ID
    public void deleteEnterpriceByid(Long id);
    //GET ALL
    public List<Enterprices> getAll();
    //GET ENTERPRICE WITH WORK
    public Enterprice_has_work getEnterpriseWithWorkById(Long id);
    
    
}
