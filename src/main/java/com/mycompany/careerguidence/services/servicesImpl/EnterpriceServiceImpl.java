package com.mycompany.careerguidence.services.servicesImpl;

import com.mycompany.careerguidence.dao.type.Enterprice;
import com.mycompany.careerguidence.dao.type.Enterprice_has_work;
import com.mycompany.careerguidence.mappers.EnterpricesMapper;
import com.mycompany.careerguidence.services.servicesInterfaces.EnterpriceService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class EnterpriceServiceImpl implements EnterpriceService{

    @Autowired
    private EnterpricesMapper enterprice_mapper;
    
    @Override
    public Enterprice getEnterpriceById(Long id) {
        try{
            return enterprice_mapper.getEnterpriceById(id);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice getEnterpriceByName(String name) {
        try{
            return enterprice_mapper.getEnterpriceByName(name);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertEnterprice(Enterprice enterprice) {
        try{
            enterprice_mapper.insertEnterprice(enterprice);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateEnterprice(Enterprice enterprice) {
        try{
            enterprice_mapper.updateEnterprice(enterprice);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleterEnterpriceById(Long id) {
        try{
           enterprice_mapper.deleteEnterpriceByid(id);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Enterprice> getAll() {
        try{
            return enterprice_mapper.getAll();
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice_has_work getEnterpriceWithWorkById(Long id) {
        try{
            return enterprice_mapper.getEnterpriseWithWorkById(id);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice getEnterpriceByLoginAndByPassword(String login, String password) {
        try{
            return enterprice_mapper.getEnterpriceByLoginAndByPassword(login, password);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllEnterprices() {
        try{
            enterprice_mapper.deleteAllEnterprices();
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
}
