/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.Arrays;
import java.util.Collection;
import model.Product;
import model.ProductStock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author lucas-souza
 */
@RunWith(Parameterized.class)
public class addProductToStockTest {
    
    private ProductStock stock;
    private String register = "";
    private String name = "";
    private String description = "";
    private int quantity = 0;
    private boolean result = false;
    
    public addProductToStockTest(String reg, String nm, String dscpt, int quantity, boolean result){
        this.register = reg;
        this.name = nm;
        this.description = dscpt;
        this.quantity = quantity;
        this.result = result;
    }
    
    @Before
    public void setUp() {
        stock = ProductStock.getStock();
    }
    
    @Parameterized.Parameters 
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
            {"1","Cafe","Po de cafe", 1, true},
            {"2","Cha","Po de cha", 1,true},
            {"3","Achocolatado","Po de chocolate ao leite", 1,true},
            {"1","Cafe","Po de cafe", 1,false},
            {"2","Cha","Po de cha", 1,false},
            {"3","Achocolatado","Po de chocolate ao leite", 1,false}
        });
    }
    
    @Test
    public void testAddingProductToStock() {
        Product product;
        product = new Product(register, name, description, quantity);
        assertEquals(stock.addProduct(product), result);
    }
}
