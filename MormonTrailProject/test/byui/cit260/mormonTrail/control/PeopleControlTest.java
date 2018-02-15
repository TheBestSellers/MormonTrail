/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alyssahundley
 */
public class PeopleControlTest {
    
    public PeopleControlTest() {
    }
   
    /**
     * Test of calcHealthDraw method, of class PeopleControl.
     */
    @Test
    public void testCalcHealthDraw() {
        System.out.println("\tTest Case 1");
        
        //test case 1
        int stamina = 3;
        int foodShortage = 0;
        double weather = 1.0;
        double pace = 1.5;
        int expResult = 5;
        int result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        
        System.out.println("\tTest Case 2");
        //test case 12
        stamina = 2;
        foodShortage = -2;
        weather = 2;
        pace = 1;
        expResult = -1;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
        
        System.out.println("\tTest Case 3");
        //test case 12
        stamina = 8;
        foodShortage = 3;
        weather = 2;
        pace = 1.5;
        expResult = -1;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("\tTest Case 4");
        //test case 12
        stamina = 4;
        foodShortage = 2;
        weather = 5;
        pace = 2;
        expResult = -1;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        
        System.out.println("\tTest Case 5");
        //test case 12
        stamina = 1;
        foodShortage = 0;
        weather = 1;
        pace = 1;
        expResult = 5;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("\tTest Case 6");
        //test case 12
        stamina = 5;
        foodShortage = 20;
        weather = 3;
        pace = 2;
        expResult = 26;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
