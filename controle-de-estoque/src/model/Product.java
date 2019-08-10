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
    
    public Product(String reg, String name, String dscp, int qt){
        this.registration = reg;
        this.name = name;
        this.description = dscp;
        this.quantity = qt;
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
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setRegistration(String registration){
        this.registration = registration;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
