package Classes;
import java.util.Date;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohamed shalash
 */
public class Product {
    int id;
    String name;
    String Description;
    int quntity;
    double price;

    public Product() {
    }

    public Product(int id, String name, String Description,int quntity, double price) {
        this.id = id;
        this.name = name;
        this.Description = Description;
        this.quntity = quntity;
        this.price = price;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", Description=" + Description + ", quntity=" + quntity + ", price=" + price + '}';
    }
    
    
    
}
