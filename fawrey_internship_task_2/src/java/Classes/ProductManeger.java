package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohamed shalash
 */
public class ProductManeger {
    private static ProductManeger productManeger;
    private CopyOnWriteArrayList<Product> product_list;
    private ProductManeger() {
        product_list =new CopyOnWriteArrayList<>();
        Product p1 =new Product(1,"meat","this is meat",24,10);
        
        Product p2 =new Product(2,"sugger",
                "this is a sugger",48,20);
        
        product_list.add(p1);
        product_list.add(p2);
    }
    public static ProductManeger Getinstance(){
        if(productManeger ==null)
            productManeger =new ProductManeger();
        return productManeger;
    }
    
   
    
    public CopyOnWriteArrayList<Product> GetAll(){
        return product_list;
    }
    
    public boolean add(Product p){
        product_list.add(p);
        return true;
    }
    
    public boolean update(Product p2){
        for(Product product:product_list)
            if(p2.id == product.getId()){
                product.setName(p2.getName());
                product.setDescription(p2.getDescription());
                product.setPrice(p2.getPrice());
                product.setQuntity(p2.getQuntity());
                
            }
        return true;
    }
    
    public boolean delete(int id){
        for(Product product:product_list)
            if(id == product.getId())
                product_list.remove(product);
        return true;
    }
}
