/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Category;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface CategoryService {
    
    public Category getById(int id);
    public Category getByName(String n);
    public int insertCategory(Category c);
    public void updateCategory(Category c);
    public List<Category> getCategoryList();
    
}
