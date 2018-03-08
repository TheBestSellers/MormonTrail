/*
 * I'M PRETTY SURE I WOULDN'T ACTUALLY BUILD THIS AS A SEPARATE VIEW
 * BUT TO MEET THE REQUIREMENTS, IT SEEMS LIKE A NEED A SEPARATE VIEW
 * IF IT IS WANTED, I CAN EASILY REFACTOR THESE BACK TOGETHER.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.ItemControl;
import java.util.Scanner;

/**
 *
 * @author Christopher S
 */
public class BuyQuantityMenuView extends View {
    
    public BuyQuantityMenuView(String items) {
        super("\n----How many " + items + "(s) would you like to buy?----"
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
            ItemControl.addItem(item, qty);
            ItemControl.subtractMoney();
            return true;
        }
        
        return false;
            
        }
        
    }