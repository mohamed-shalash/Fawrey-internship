/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrey_internship_assignment_1;

import java.util.List;

/**
 *
 * @author mohamed shalash
 */
public class Order {
       
    private int id;
    private Customer customer;
    private List<Product> productList;
    private double totalAmount;

    public Order() {
        totalAmount=0;
    }

    public Order(Customer customer, List<Product> productList) {
        this.customer = customer;
        this.productList = productList;
        totalAmount=0;
    }

    public Order(int id, Customer customer, List<Product> productList) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        totalAmount=0;
    }
    
    public double calculateTotalAmount(){
        for(Product SingleProduct:productList)
            totalAmount += SingleProduct.getPrice();
        return totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        calculateTotalAmount();
        return "Order{" + "id=" + id + ", customer=" + customer + ", productList=" + productList + ", totalAmount=" + totalAmount + '}';
    }
    
    
    
}
