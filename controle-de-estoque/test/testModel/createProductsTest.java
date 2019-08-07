/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testModel;

import java.util.Arrays;
import java.util.Collection;
import model.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    
    public createProductsTest(int reg, String nm, String dscpt){
        this.registration = reg;
        this.name = nm;
        this.description = dscpt;
    }
    
    @Parameterized.Parameters
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
            {1,"Cafe","Po de cafe"},
            {2,"Cha","Po de cha",},
            {3,"Achocolatado","Po de chocolate ao leite"}
        });
    }

    @Test
    public void testCreateProduct(){
        Product prod = new Product(registration, name, description);
        assertNotNull(prod);
    }
}
