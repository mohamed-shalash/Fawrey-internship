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
public class ProductManager {
     private CopyOnWriteArrayList<Product> productList;
     private static ProductManager productManager;
    private ProductManager() {
        productList = new CopyOnWriteArrayList<>();
    }
    
    public static ProductManager getInstance(){
        if(productManager==null){
            productManager =new ProductManager();
        }
        return productManager;
    }
    
    public void   addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(int productId){
        for(Product product:productList)
            if(productId == product.getId())
                productList.remove(product);
    }
    
    public void viewAllProducts(){
        for(Product product:productList)
            System.out.print(product.toString());
    }
    
    public void updateStock(int productId, int newStock)
{
        for(Product product:productList)
            if(productId == product.getId())
                product.setStockQuantity(newStock);
    }
    
    
}
