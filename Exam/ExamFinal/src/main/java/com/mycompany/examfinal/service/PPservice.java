/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Productprice;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PPservice {
    
    public Productprice getById(int id);
    public int insertPP(Productprice p);
    public void updatePP(Productprice p);
    public List<Productprice> getListPP();
    
}
