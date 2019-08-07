/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testModel;

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
    private int register = 0;
    private String name = "";
    private String description = "";
    private boolean result = false;
    
    public addProductToStockTest(int reg, String nm, String dscpt, boolean result){
        this.register = reg;
        this.name = nm;
        this.description = dscpt;
        this.result = result;
    }
    
    @Before
    public void setUp() {
        stock = ProductStock.getStock();
    }
    
    @Parameterized.Parameters 
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
            {1,"Cafe","Po de cafe",true},
            {2,"Cha","Po de cha",true},
            {3,"Achocolatado","Po de chocolate ao leite",true},
            {1,"Cafe","Po de cafe",false},
            {2,"Cha","Po de cha",false},
            {3,"Achocolatado","Po de chocolate ao leite",false}
        });
    }
    
    @Test
    public void testAddingProductToStock() {
        Product product;
        product = new Product(register, name, description);
        assertEquals(stock.addProduct(product), result);
    }
}
