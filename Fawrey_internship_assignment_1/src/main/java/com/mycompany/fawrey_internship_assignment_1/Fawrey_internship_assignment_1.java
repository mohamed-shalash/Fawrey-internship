/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fawrey_internship_assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author mohamed shalash
 */
public class Fawrey_internship_assignment_1 {

    public static void main(String[] args) {
        
        
        
        //■ Add a new product
        Product product1 =new Product(1, "name of product 1", "description of product 1", 20, 10);
        ProductManager productManeger =ProductManager.getInstance();
        productManeger.addProduct(product1);
        //■ Remove a product
        productManeger.removeProduct(1);
                
        //■ View all products
        productManeger.viewAllProducts();
        
        //■ Add a new customer
        Customer customer1 =new Customer(1, "name", "email", "address");
        CustomerManager customerManager = CustomerManager.getInstance();
        customerManager.addCustomer(customer1);
        //■ Remove a customer
        customerManager.removeCustomer(1);
        //■ View all customers
        customerManager.viewAllCustomers();
        
        //■ Create a new order
        Customer customer2 =new Customer(2, "mohamed", "email", "address");
        Customer customer3 =new Customer(3, "tawfeek", "email", "address");
        customerManager.addCustomer(customer2);
        customerManager.addCustomer(customer3);
        
        
        Product product2 =new Product(2, "name of product 2", "description of product 2", 30, 20);
        Product product3 =new Product(3, "name of product 3", "description of product 3", 40, 30);
        
        productManeger.addProduct(product2);
        productManeger.addProduct(product3);
        
        List<Product> products =new ArrayList<>();
        products.add(product2);
        products.add(product3);
        
        
        Order order1 =new Order(1, customer2,products );
        OrderManager orderManager =OrderManager.getInstance();
        orderManager.addOrder(order1);
        
        //■ View all order
        orderManager.viewAllOrders();
    }
}
