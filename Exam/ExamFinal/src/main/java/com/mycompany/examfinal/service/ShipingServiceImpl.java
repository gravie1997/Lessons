/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Shiping;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class ShipingServiceImpl implements ShipingService{
    
    
    @Override
    public Shiping getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Shiping> shipingList=session.createSQLQuery("select * from shiping where id=:id")
                .addEntity(Shiping.class).setParameter("id", id).list();
        if(shipingList.size()>0){
            return shipingList.get(0);
        }else{
            return null;
        } 
    }

    @Override
    public int insertId(Shiping s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int id=-1;
        try{
            id=(int)session.save(s);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
        return id;
    }

    @Override
    public void update(Shiping s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            session.update(s);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
    }

    @Override
    public List<Shiping> getListShiping() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Shiping> shipingList =session.createSQLQuery("select * from shiping")
                .addEntity(Shiping.class).list();
            return shipingList;
    } 
    

    @Override
    public List<Shiping> getByIdOrder(int id) {
    Session session = HibernateUtil.getSessionFactory().openSession();
        List<Shiping> shipingList = session.createSQLQuery("select * shiping where idorder="+id+";")
                .addEntity(Shiping.class).list();
            return shipingList;
    }
    
}
