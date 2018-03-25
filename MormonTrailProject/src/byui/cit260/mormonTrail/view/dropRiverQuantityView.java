
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.ItemControl;
import byui.cit260.mormonTrail.exceptions.ItemControlException;
import java.util.Scanner;

/**
 *
 * @author Christopher S
 */
public class dropRiverQuantityView extends View {
    
    public dropRiverQuantityView() {
        super("\n----How many would you like to drop?----"
             + "\nQ - Return to previous menu");
    }
    @Override
    public boolean doAction(String[] inputs) {
        
        int qty = 0;
        
        try {
            qty = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value\nEnter a number between 1 and 100");
            return false;
        } catch (Throwable e) {
            System.out.println("Something happened: " + e);
            return false;
        }
        
        if (qty < 0 || qty > 100) {
            System.out.println("Invalid value\nEnter a number between 1 and 100");
        }
        
        else if (qty == 0) {
            System.out.println("0 entered, returning to previous menu");
            return true;
        }
        else if (qty > 0 && qty <= 100) {
            System.out.println("Valid value");
            
            try{
                ItemControl.subtractItem(dropRiverSuppliesView.item, qty);
            } catch (ItemControlException ice){
                  System.out.println(ice.getMessage());
                        return false;
                    }
            return true;
        }
        
        return false;
            
        }
        
    }