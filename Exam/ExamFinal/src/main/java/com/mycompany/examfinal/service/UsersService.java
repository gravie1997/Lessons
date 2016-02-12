/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Users;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UsersService {
    
    public Users getById(int id);
    public Users getByUsernameAndPassword(String username , String password);
    public int insertUser(Users u);
    public void updateUser(Users u);
    public List<Users> getUserList();
    
}
