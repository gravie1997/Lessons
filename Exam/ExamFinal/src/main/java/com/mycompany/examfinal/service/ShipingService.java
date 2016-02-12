/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Shiping;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ShipingService {
    public Shiping getById(int id);
    public int insertId(Shiping s);
    public void update(Shiping s);
    public List<Shiping> getListShiping();
    public List<Shiping> getByIdOrder(int id);
    
}
