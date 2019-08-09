/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testModel;

import java.util.Arrays;
import java.util.Collection;
import model.Product;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author lucas-souza
 */
@RunWith(Parameterized.class)
public class createProductsTest {
    
    private int registration = 0;
    private String name  = "";
    private String description = "";
    private int quantity = 0;
    
    public createProductsTest(int reg, String nm, String dscpt, int qtd){
        this.registration = reg;
        this.name = nm;
        this.description = dscpt;
        this.quantity = qtd;
    }
    
    @Parameterized.Parameters
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
            {1,"Cafe","Po de cafe",1},
            {2,"Cha","Po de cha",1},
            {3,"Achocolatado","Po de chocolate ao leite",1}
        });
    }

    @Test
    public void testCreateProduct(){
        Product prod = new Product(registration, name, description, quantity);
        assertNotNull(prod);
    }
}
