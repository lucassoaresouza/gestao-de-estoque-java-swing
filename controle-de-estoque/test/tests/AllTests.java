/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author lucas-souza
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({tests.createProductsTest.class, 
                     tests.createProductStockTest.class, 
                     tests.addProductToStockTest.class,
                     tests.removeProductFromStockTest.class,
                     tests.UpdateProductVolumnTest.class,
                     tests.ShowingProductDataTest.class,
                     tests.UpdateProductTest.class
                    })

public class AllTests {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
