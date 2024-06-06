/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrey_internship_assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author mohamed shalash
 */
public class CustomerManager {
     private CopyOnWriteArrayList<Customer> customerList;
     private static CustomerManager customerManager;
    private CustomerManager() {
        customerList = new CopyOnWriteArrayList<>();
    }
    
    public static CustomerManager getInstance(){
        if(customerManager==null){
            customerManager =new CustomerManager();
        }
        return customerManager;
    }
    
    public void  addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void removeCustomer(int customerId){
        for(Customer customer:customerList)
            if(customerId == customer.getId())
                customerList.remove(customer);
    }
    
    public void viewAllCustomers(){
        for(Customer customer:customerList)
            System.out.print(customer.toString());
    }
}
