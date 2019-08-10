package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Product;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas-souza
 */
public class UpdateProductVolumnTest {
    
    private Product prod;
    
    public UpdateProductVolumnTest() {
        this.prod = new Product("12345","Cafe","Cafe Ideal",10);
    }

    @Test
    public void addingVolumnTest(){
        for(int i = 0; i < 10; i++){
            int auxVolumn = prod.getQuantity();
            prod.removeQuantity();
            int newVolumn = prod.getQuantity();
            assertEquals(newVolumn,auxVolumn-1);
        }
    }

    @Test
    public void removingVolumnTest(){
        for(int i = 0; i < 10; i++){
            int auxVolumn = prod.getQuantity();
            prod.addQuantity();
            int newVolumn = prod.getQuantity();
            assertEquals(newVolumn,auxVolumn+1);
        }
    }
}
