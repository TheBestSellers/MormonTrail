package byui.cit260.mormonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher Sellers
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of calcFoodDraw method, of class ItemControl.
     */
    @Test
    public void testCalcFoodDraw1() {
        System.out.println("calcFoodDraw1");
        int stamina = 3;
        double pace = 1.5;
        int expResult = 9;
        int result = ItemControl.calcFoodDraw(stamina, pace);
        System.out.println(result + " vs " + expResult);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCalcFoodDraw2 () {
        System.out.println("calcFoodDraw2");
        int stamina = 6;
        double pace = 1.0;
        int expResult = -1;
        int result = ItemControl.calcFoodDraw(stamina, pace);
        System.out.println(result + " vs " + expResult);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcFoodDraw3() {
        System.out.println("calcFoodDraw3");
        int stamina = 5;
        double pace = 2.5;
        int expResult = -2;
        int result = ItemControl.calcFoodDraw(stamina, pace);
        System.out.println(result + " vs " + expResult);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcFoodDraw4() {
        System.out.println("calcFoodDraw4");
        int stamina = 0;
        double pace = 0.5;
        int expResult = -1;
        int result = ItemControl.calcFoodDraw(stamina, pace);
        System.out.println(result + " vs " + expResult);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcFoodDraw5() {
        System.out.println("calcFoodDraw5");
        int stamina = 1;
        double pace = 1.0;
        int expResult = 5;
        int result = ItemControl.calcFoodDraw(stamina, pace);
        System.out.println(result + " vs " + expResult);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcFoodDraw6() {
        System.out.println("calcFoodDraw6");
        int stamina = 5;
        double pace = 2.0;
        int expResult = 14;
        int result = ItemControl.calcFoodDraw(stamina, pace);
        System.out.println(result + " vs " + expResult);
        assertEquals(expResult, result);   
    }
    
    
    @Test
    public void testSubtractMoney1() {
        System.out.println("subtractMoney1");
        String item = "";
        int qty = 1;
        int expResult = 9;
        int result = ItemControl.subtractMoney(item, qty);
        System.out.println(result + " vs " + expResult);
        assertEquals(expResult, result);
}
    
    
}
