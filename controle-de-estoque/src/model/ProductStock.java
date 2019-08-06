/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author lucas-souza
 */
public class ProductStock {
    
    private int registration;
    private ArrayList<Product> products = null;
    private ArrayList<User> users = null;
    
    ProductStock(int registration){
        this.registration = registration;
    }
    
    public ArrayList<Product> getProducts(){
        return this.products;
    }
    
    public ArrayList<User> getUsers(){
        return this.users;
    }
    
}
