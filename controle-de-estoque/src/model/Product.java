/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucas-souza
 */
public class Product {
    
    private String registration;
    private String name;
    private String description;
    private int quantity;
    
    public Product(String registration, String name, String description, int quantity){
        this.registration = registration;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
    
    
    public boolean addQuantity(){
        try{
            this.quantity += 1;
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public boolean removeQuantity(){
        try{
            this.quantity -= 1;
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public String getRegistration(){
        return this.registration;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
}
