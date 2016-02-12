/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Orders;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class OrderServiceImpl implements OrderService{
    
    @Override
    public Orders getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Orders> orderList =session.createSQLQuery("select * from orders where id=:id")
                .addEntity(Orders.class).setParameter("id", id).list();
        if(orderList.size()>0){
            return orderList.get(0);
        }else{
            return null;
        } 
    }

    @Override
    public List<Orders> getListOrders() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Orders> listOrders =session.createSQLQuery("select * from orders")
                .addEntity(Orders.class).list();
            return listOrders;
    }

    @Override
    public int insertOrder(Orders o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int id=-1;
        try{
            id=(int)session.save(o);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
        return id;
    }

    @Override
    public void updateOrder(Orders o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            session.update(o);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
    }

    @Override
    public List<Orders> ordersByUserId(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Orders> ordersList = session.createSQLQuery("select * from orders where iduser="+id+";")
                .addEntity(Orders.class).list();
            return ordersList;
    }
    
}
