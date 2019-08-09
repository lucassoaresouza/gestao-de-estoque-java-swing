/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ProductStock;
import model.User;

/**
 *
 * @author lucas-souza
 */
public class StockController {
    
    private User user;
    private ProductStock stock;
    
    StockController(){
        this.user = new User(11111,"Default User");
        this.stock = ProductStock.getStock();
    }
    
    public void stockIndex(){}
    
}
