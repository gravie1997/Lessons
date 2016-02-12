/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Productprice;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class PPServiceImpl implements PPservice{
    
    @Override
    public Productprice getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Productprice> ppList =session.createSQLQuery("select * from productprice where id=:id")
                .addEntity(Productprice.class).setParameter("id", id).list();
        if(ppList.size()>0){
            return ppList.get(0);
        }else{
            return null;
        } 
    }

    @Override
    public int insertPP(Productprice p) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int id=-1;
        try{
            id=(int)session.save(p);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
        return id;
    }

    @Override
    public void updatePP(Productprice p) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            session.update(p);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
    }

    @Override
    public List<Productprice> getListPP() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Productprice> ppList =session.createSQLQuery("select * from productprice")
                .addEntity(Productprice.class).list();
            return ppList;
    }
    
}
