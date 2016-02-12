/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Category;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class CategoryServiceImpl implements CategoryService{
    
    @Override
    public Category getById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Category> categoryList = session.createSQLQuery("select * from category where id=:id").
                addEntity(Category.class).setParameter("id", id).list();
        if(categoryList.size()>0){
            return categoryList.get(0);
        }else{
            return null;
        }
    }

    @Override
    public Category getByName(String n) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Category> categoryList = session.createSQLQuery("select * from category where name=:name").
                addEntity(Category.class).setParameter("name", n).list();
        if(categoryList.size()>0){
            return categoryList.get(0);
        }else{
            return null;
        }
    }
    
    @Override
    public List<Category> getCategoryList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Category> categoryList=session.createSQLQuery("select * from category")
                .addEntity(Category.class).list();
            return categoryList;
    } 
    
    
    @Override
    public int insertCategory(Category c){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int id=-1;
        try{
            id=(int)session.save(c);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
        return id;
    }
    
    @Override
    public void updateCategory(Category c){
    Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
     
        try{
            session.update(c);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
    }
    
}
