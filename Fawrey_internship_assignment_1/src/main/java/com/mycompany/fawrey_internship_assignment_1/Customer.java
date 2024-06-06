/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrey_internship_assignment_1;

import java.util.regex.Pattern;

/**
 1* do not forget matching for email
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    
/* Methods: Constructors*/
   /* private void CheckValidEmail(String email ){
        try{
            String email_regix ="^[a-zA-Z0-9.]+@+[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}$";
            if (!Pattern.matches(email_regix, email)) {
                throw new IllegalArgumentException("Invalid email address: " + email);
            } 
            
        }catch(Exception e){
        }
    }*/
    public Customer() {
    }

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
    
    
    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + '}';
    }
    
}
