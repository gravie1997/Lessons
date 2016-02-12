/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Users;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class UsersServiceImpl implements UsersService{
    @Override
    public Users getById(int id) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Users> userList=session.createSQLQuery("select * from users where id=:id")
                .addEntity(Users.class).setParameter("id", id).list();
        if(userList.size()>0){
            return userList.get(0);
        }else{
            return null;
        } 
    }

    @Override
    public Users getByUsernameAndPassword(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Users> userList=session.createSQLQuery("select * from users where login =:login and password=:password")
                .addEntity(Users.class).setParameter("login", username).setParameter("password", password).list();
        if(userList.size()>0){
            return userList.get(0);
        }else{
            return null;
        } 
        
    }

    @Override
    public int insertUser(Users u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int id=-1;
        try{
            id=(int)session.save(u);
            session.save(u);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        } 
        return id;
    }

    @Override
    public void updateUser(Users u) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        try{
            session.update(u);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        }   
    }

    @Override
    public List<Users> getUserList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Users> userList=session.createSQLQuery("select * from users")
                .addEntity(Users.class).list();
            return userList;
    } 
}
    

