/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrey_internship_assignment_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohamed shalash
 */
public class OrderManager {
    
    private List<Order> orderList;
    private static OrderManager orderManager;
    private OrderManager() {
        orderList = new ArrayList<>();
    }
    
    public static OrderManager getInstance(){
        if(orderManager==null){
            orderManager =new OrderManager();
        }
        return orderManager;
    }
    public void  addOrder(Order order){
        orderList.add(order);
    }
    public void removeOrder(int orderId){
        for(Order order:orderList)
            if(orderId == order.getId())
                orderList.remove(order);
    }
    
    public void viewAllOrders(){
        for(Order order:orderList)
            System.out.println(order.toString());
    }
    
    
}
