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
   
        
        System.out.println("\tTest Case 2");
        //test case 12
        stamina = 2;
        foodShortage = -2;
        weather = 2;
        pace = 1;
        expResult = -1;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
 
        
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
    
        
        System.out.println("\tTest Case 5");
        //test case 12
        stamina = 1;
        foodShortage = 0;
        weather = 1;
        pace = 1;
        expResult = 5;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);
    
        
        System.out.println("\tTest Case 6");
        //test case 12
        stamina = 5;
        foodShortage = 20;
        weather = 3;
        pace = 2;
        expResult = 26;
        result = PeopleControl.calcHealthDraw(stamina, foodShortage, weather, pace);
        assertEquals(expResult, result);

      
    }

    /**
     * Test of calcDayOfRest method, of class PeopleControl.
     */
    @Test
    public void testCalcDayOfRest() {
        System.out.println("Test Case 1");
        int stamina = 3;
        int expResult = 5;
        int result = PeopleControl.calcDayOfRest(stamina);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 2");
        stamina = 6;
        expResult = -1;
        result = PeopleControl.calcDayOfRest(stamina);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 3");
        stamina = -1;
        expResult = -1;
        result = PeopleControl.calcDayOfRest(stamina);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 4");
        stamina = 9;
        expResult = -1;
        result = PeopleControl.calcDayOfRest(stamina);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 5");
        stamina = 1;
        expResult = 2;
        result = PeopleControl.calcDayOfRest(stamina);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 6");
        stamina = 5;
        expResult = 8;
        result = PeopleControl.calcDayOfRest(stamina);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcHealth method, of class PeopleControl.
     */
    @Test
    public void testCalcHealth() {
        System.out.println("Test Case 1");
        int currentHealth = 75;
        int healthDraw = 24;
        int dayOfRest = 0;
        int expResult = 51;
        int result = PeopleControl.calcHealth(currentHealth, healthDraw, dayOfRest);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 2");
        currentHealth = 92;
        healthDraw = 0;
        dayOfRest = 0;
        expResult = -1;
        result = PeopleControl.calcHealth(currentHealth, healthDraw, dayOfRest);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 3");
        currentHealth = 105;
        healthDraw = 15;
        dayOfRest = 0;
        expResult = -1;
        result = PeopleControl.calcHealth(currentHealth, healthDraw, dayOfRest);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 4");
        currentHealth = 63;
        healthDraw = 10;
        dayOfRest = 4;
        expResult = -1;
        result = PeopleControl.calcHealth(currentHealth, healthDraw, dayOfRest);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 5");
        currentHealth = 1;
        healthDraw = 0;
        dayOfRest = 8;
        expResult = 9;
        result = PeopleControl.calcHealth(currentHealth, healthDraw, dayOfRest);
        assertEquals(expResult, result);
        
        System.out.println("Test Case 6");
        currentHealth = 100;
        healthDraw = 50;
        dayOfRest = 0;
        expResult = 50;
        result = PeopleControl.calcHealth(currentHealth, healthDraw, dayOfRest);
        assertEquals(expResult, result);
        
        
       
    }
    
}
