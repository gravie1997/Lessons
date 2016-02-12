/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examfinal.service;

import com.mycompany.examfinal.domain.entity.Orders;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface OrderService {
    
    
    public Orders getById(int id);
    public List<Orders> getListOrders();
    public int insertOrder(Orders o);
    public void updateOrder(Orders o);
    public List<Orders> ordersByUserId(int id);
}
