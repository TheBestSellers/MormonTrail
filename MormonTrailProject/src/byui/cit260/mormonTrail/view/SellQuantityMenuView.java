

package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.ItemControl;
import java.util.Scanner;

public class SellQuantityMenuView extends View {
    
    public SellQuantityMenuView(String items) {
        super("\nHow many " + items + "(s) would you like to sell?"
             + "\nQ - Return to previous menu");
    }
    
    @Override
    public boolean doAction(String item, String[] inputs) {
        
        int qty = 0;
        
        try {
            qty = Integer.parseInt(inputs[0]);
        }
        catch (Exception e) {
            System.out.println("Invalid value\nEnter a number between 1 and 100");
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
            ItemControl.subtractItem(item, qty);
            ItemControl.addMoney();
            return true;
        }
        
        return false;
            
        }
        
    }

