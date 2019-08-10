package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import model.Product;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas-souza
 */
public class ShowingProductDataTest {
    
    ArrayList<Product> prods = new ArrayList<Product>();
    
    public ShowingProductDataTest() {
    
        prods.add(new Product("111","Cafe","cafe",1));
        prods.add(new Product("222","Cha","cha",2));
        prods.add(new Product("333","Arroz","arroz",3));
        prods.add(new Product("444","Milho","milho",4));
        prods.add(new Product("555","Abacate","abacate",1));
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void showingProductDataTest() {
         Product prod0 = prods.get(0);
         assertEquals(prod0.getRegistration(), "111");
         assertEquals(prod0.getName(),"Cafe");
         assertEquals(prod0.getDescription(),"cafe");
         assertEquals(prod0.getQuantity(),1);
         Product prod1 = prods.get(1);
         assertEquals(prod1.getRegistration(), "222");
         assertEquals(prod1.getName(),"Cha");
         assertEquals(prod1.getDescription(),"cha");
         assertEquals(prod1.getQuantity(),2);
         Product prod2 = prods.get(2);
         assertEquals(prod2.getRegistration(), "333");
         assertEquals(prod2.getName(),"Arroz");
         assertEquals(prod2.getDescription(),"arroz");
         assertEquals(prod2.getQuantity(),3);
         Product prod3 = prods.get(3);
         assertEquals(prod3.getRegistration(), "444");
         assertEquals(prod3.getName(),"Milho");
         assertEquals(prod3.getDescription(),"milho");
         assertEquals(prod3.getQuantity(),4);
         Product prod4 = prods.get(4);
         assertEquals(prod4.getRegistration(), "555");
         assertEquals(prod4.getName(),"Abacate");
         assertEquals(prod4.getDescription(),"abacate");
         assertEquals(prod4.getQuantity(),1);
     }
}
