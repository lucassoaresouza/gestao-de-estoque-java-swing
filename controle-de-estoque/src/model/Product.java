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
    
    int registration;
    String name;
    String description;
    
    Product(int registration, String name, String description){
        this.registration = registration;
        this.name = name;
        this.description = description;
    }
    
    int getRegistration(){
        return this.registration;
    }
    
    String getName(){
        return this.name;
    }
    
    String getDescription(){
        return this.description;
    }
}
