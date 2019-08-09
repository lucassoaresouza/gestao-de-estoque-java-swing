/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Product;
import model.ProductStock;
import model.User;

/**
 *
 * @author lucas-souza
 */
public class StockController {
    
    private User user;
    private ProductStock stock;
    
    public StockController(){
        this.user = new User(11111,"Default User");
        this.stock = ProductStock.getStock();
    }
    
    public void stockIndex(){}
    
    public String getUserName(){
        return this.user.getName();
    }
    
    public String getUserRegistration(){
        return Integer.toString(this.user.getRegistration());
    }
    
    private Product newProduct(int register, String name, String description, int quantity){
        try{
            Product prod = new Product(register, name, description, quantity);
            System.out.println("Produto criado com sucesso!");
            return prod;
        } catch(Exception e){
            System.out.println("O produto não pôde ser criado!");
            return null;
        }   
    }
    
    private void addProductToStock(Product prod){
        
        try{
            this.stock.addProduct(prod);
            System.out.println("O produto foi adicionado com sucesso!");
        } catch(Exception e){
            System.out.println("O produto nao pode ser adicionado!");
        }
        
    }
    
    public int getProductQuantity(){
        return stock.getProducts().size();
    }
    
    public int getTotalVolumesQuantity(){
        if(this.getProductQuantity() > 1){
            int totalVolumes = 0;
            for(Product prod : stock.getProducts()){
                totalVolumes += prod.getQuantity();
            }
            return totalVolumes;
        } else {
            return 0;
        }
    }
    
}
