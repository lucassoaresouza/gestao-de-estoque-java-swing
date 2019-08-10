/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Product;
import model.ProductStock;
import model.TableModel;
import model.User;

/**
 *
 * @author lucas-souza
 */
public class StockController {
    
    private User user;
    private ProductStock stock;
    private TableModel tableModel;
    
    public StockController(){
        this.user = new User(1111111,"Usuário Padrão");
        this.stock = ProductStock.getStock();
        this.tableModel = new TableModel();
    }
    
    public void stockIndex(){}
    
    public String getUserName(){
        return this.user.getName();
    }
    
    public String getUserRegistration(){
        return Integer.toString(this.user.getRegistration());
    }
    
    private Product newProduct(String register, String name, 
            String description, int quantity){
        try{
            Product prod = new Product(register, name, description, quantity);
            System.out.println("Produto criado com sucesso!");
            return prod;
        } catch(Exception e){
            System.out.println("O produto não pôde ser criado!");
            return null;
        }   
    }
    
    public void addProductToStock(String productReg,String productNm, 
            String productDscpt, int productQntd){
        
        try{
            Product prod = newProduct(productReg, productNm, 
                    productDscpt, productQntd);
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
        if(this.getProductQuantity() > 0){
            int totalVolumes = 0;
            for(Product prod : stock.getProducts()){
                totalVolumes += prod.getQuantity();
            }
            return totalVolumes;
        } else {
            return 0;
        }
    }
    
    public ArrayList<Product> getAllProducts(){
        return stock.getProducts();
    }
    
    public TableModel getTableModel(){
        return this.tableModel;
    }
    
    public Product getProductByIndex(int index){
        
        try{
            return stock.getProductByIndex(index);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void updateProduct(int index, String reg, String nm, 
            String dscpt, int quantity){
        this.getProductByIndex(index).setRegistration(reg);
        this.getProductByIndex(index).setName(nm);
        this.getProductByIndex(index).setDescription(dscpt);
        this.getProductByIndex(index).setQuantity(quantity);
    }
    
    public boolean removeProduct(int index){
        if(stock.removeProduct(index)){
            return true;
        } else {
            return false;
        }
    }
    
}
