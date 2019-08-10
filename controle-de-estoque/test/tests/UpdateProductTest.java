/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import model.Product;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas-souza
 */
public class UpdateProductTest {
   
    Product prod = null;
    
    public UpdateProductTest() {
        this.prod = new Product("122e2","Cafe","Cafe Ideal",5);
    }

    @Test
    public void updateRegisterTest(){
        prod.setRegistration("eee2e");
        assertEquals(prod.getRegistration(),"eee2e");
    }
    
    @Test
    public void updateNameTest(){
        prod.setName("Arroz");
        assertEquals(prod.getName(),"Arroz");
    }
    
    @Test
    public void updateDescriptionTest(){
        prod.setDescription("Arroz legal");
        assertEquals(prod.getDescription(),"Arroz legal");
    }
    
    @Test
    public void updateVolumnTest(){
        int auxVolumn = prod.getQuantity();
        prod.removeQuantity();
        assertEquals(prod.getQuantity(),auxVolumn - 1);
        auxVolumn = prod.getQuantity();
        prod.addQuantity();
        assertEquals(prod.getQuantity(),auxVolumn + 1);
    }
}
