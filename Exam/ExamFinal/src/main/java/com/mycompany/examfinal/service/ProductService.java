/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Product;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProductService {
    
     public Product getById(int id);
    public Product getByName(String name);
    public int insertProduct(Product p);
    public void updateProduct(Product p);
    public List<Product> listProducts();
    
}
