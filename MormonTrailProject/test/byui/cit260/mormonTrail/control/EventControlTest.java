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
 * @author saria
 */
public class EventControlTest {
    
    public EventControlTest() {
    }

    /**
     * Test of calcRiverCrossingProbability method, of class EventControl.
     */
    @Test
    public void testCalcRiverCrossingProbability() {
        System.out.println("Test 1");
        int riverDepth = 4;
        int wagonWeight = 7;
        int oxenStrength = 2;
        int expResult = 13;
        int result = EventControl.calcRiverCrossingProbability(riverDepth, wagonWeight, oxenStrength);
        assertEquals(expResult, result);
    
          System.out.println("Test 2");
        riverDepth = -1;
        wagonWeight = 60;
        oxenStrength = 43;
        expResult = 0;
        result = EventControl.calcRiverCrossingProbability(riverDepth, wagonWeight, oxenStrength);
        assertEquals(expResult, result);
        
          System.out.println("Test 3");
        riverDepth = 12;
        wagonWeight = 11;
        oxenStrength = -1;
        expResult = 0;
        result = EventControl.calcRiverCrossingProbability(riverDepth, wagonWeight, oxenStrength);
        assertEquals(expResult, result);
        
          System.out.println("Test 4");
        riverDepth = 54;
        wagonWeight = 13;
        oxenStrength = -2;
        expResult = 0;
        result = EventControl.calcRiverCrossingProbability(riverDepth, wagonWeight, oxenStrength);
        assertEquals(expResult, result);
        
          System.out.println("Test 5");
        riverDepth = 1;
        wagonWeight = 1;
        oxenStrength = 1;
        expResult = 3;
        result = EventControl.calcRiverCrossingProbability(riverDepth, wagonWeight, oxenStrength);
        assertEquals(expResult, result);
        
          System.out.println("Test 6");
        riverDepth = 10;
        wagonWeight = 10;
        oxenStrength = 10;
        expResult = 30;
        result = EventControl.calcRiverCrossingProbability(riverDepth, wagonWeight, oxenStrength);
        assertEquals(expResult, result);
    }
    
}
