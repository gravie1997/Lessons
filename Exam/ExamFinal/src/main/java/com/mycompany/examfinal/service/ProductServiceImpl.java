/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Product;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class ProductServiceImpl implements ProductService{
    
    @Override
    public Product getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product> productsList=session.createSQLQuery("select * from product where id=:id")
                .addEntity(Product.class).setParameter("id", id).list();
        if(productsList.size()>0){
            return productsList.get(0);
        }else{
            return null;
        } 
    }

    @Override
    public Product getByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product> productsList=session.createSQLQuery("select * from product where name=:name")
                .addEntity(Product.class).setParameter("name", name).list();
        if(productsList.size()>0){
            return productsList.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int insertProduct(Product p) {
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
    public void updateProduct(Product p) {
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
    public List<Product> listProducts() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product> productsList =session.createSQLQuery("select * from product")
                .addEntity(Product.class).list();
            return productsList;
    } 
    
}
