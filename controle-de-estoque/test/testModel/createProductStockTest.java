/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testModel;

import model.ProductStock;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas-souza
 */
public class createProductStockTest {
    @Test
    public void testGetProductStock(){
        ProductStock stock = ProductStock.getStock();
        assertNotNull(stock);
        //Singleton Test
        ProductStock stock2 = ProductStock.getStock();
        assertEquals(stock,stock2);
    }
}
