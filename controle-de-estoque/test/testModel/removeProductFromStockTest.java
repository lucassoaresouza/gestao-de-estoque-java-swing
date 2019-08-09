/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testModel;

import model.Product;
import model.ProductStock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas-souza
 */
public class removeProductFromStockTest {

    private ProductStock stock;
    private Product prod1;
    private Product prod2;
    private Product prod3;
    private Product prod4;
    private Product prod5;
    
    public removeProductFromStockTest(){
    }
    
    @Before
    public void setUp() {
        stock = ProductStock.getStock();
        prod1 = new Product(1,"Cafe","Po de cafe",1);
        prod2 = new Product(2,"Cha","Po de cha",1);
        prod3 = new Product(3,"Achocolatado","Po de chocolate ao leite",1);
        prod4 = new Product(4,"Arroz","Graos de Arroz",1);
        prod5 = new Product(5, "Chafe", "Cha de cafe",1);
        
        stock.addProduct(prod1);
        stock.addProduct(prod2);
        stock.addProduct(prod3);
    }
    
    @Test
    public void testRemovingProductFromStockTrue() {
        assertTrue(stock.removeProduct(prod1));
        assertTrue(stock.removeProduct(prod2));
        assertTrue(stock.removeProduct(prod3));
    }
    
    @Test
    public void testRemovingProductFromStockFalse(){
        assertFalse(stock.removeProduct(prod4));
        assertFalse(stock.removeProduct(prod5));
    }
}
