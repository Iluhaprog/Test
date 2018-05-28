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
    EnterpricesMapper em;
    
    @Override
    public Enterprice getEnterpriceById(Long id) {
        try{
            return em.getEnterpriceById(id);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice getEnterpriceByName(String name) {
        try{
            return em.getEnterpriceByName(name);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void insertEnterprice(Enterprice enterprice) {
        try{
            em.insertEnterprice(enterprice);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void updateEnterprice(Enterprice enterprice) {
        try{
            em.updateEnterprice(enterprice);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleterEnterpriceById(Long id) {
        try{
           em.deleteEnterpriceByid(id);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public List<Enterprice> getAll() {
        try{
            return em.getAll();
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice_has_work getEnterpriceWithWorkById(Long id) {
        try{
            return em.getEnterpriseWithWorkById(id);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public Enterprice getEnterpriceByLoginAndByPassword(String login, String password) {
        try{
            return em.getEnterpriceByLoginAndByPassword(login, password);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public void deleteAllEnterprices() {
        try{
            em.deleteAllEnterprices();
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
}
