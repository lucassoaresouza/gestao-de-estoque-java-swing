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
    
    private static ProductStock stock = null;
    private ArrayList<Product> products;
    private ArrayList<User> users;
    
    private ProductStock(){
        this.products = null;
        this.users = null;
    }
    
    public static ProductStock getStock(){
        
        if(stock == null){
            stock = new ProductStock();
            return stock;
        } else {
            return stock;
        }
        
    }
    
    public ArrayList<Product> getProducts(){
        return this.products;
    }
    
    public ArrayList<User> getUsers(){
        return this.users;
    }
    
}
