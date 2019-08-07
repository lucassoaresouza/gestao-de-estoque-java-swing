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
    
    private int registration;
    private String name;
    private String description;
    
    public Product(int registration, String name, String description){
        this.registration = registration;
        this.name = name;
        this.description = description;
    }
    
    public int getRegistration(){
        return this.registration;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
}
