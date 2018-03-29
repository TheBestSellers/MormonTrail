/*
 * I'M PRETTY SURE I WOULDN'T ACTUALLY BUILD THIS AS A SEPARATE VIEW
 * BUT TO MEET THE REQUIREMENTS, IT SEEMS LIKE A NEED A SEPARATE VIEW
 * IF IT IS WANTED, I CAN EASILY REFACTOR THESE BACK TOGETHER.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.ItemControl;
import byui.cit260.mormonTrail.exceptions.ItemControlException;
import java.util.Scanner;

/**
 *
 * @author Christopher S
 */
public class SellQuantityMenuView extends View {
    
    public SellQuantityMenuView() {
        super("\n----How many would you like to sell?----"
             + "\nQ - Return to previous menu");
    }
    @Override
    public boolean doAction(String inputs) {
        
        int qty = 0;
        
        try {
            qty = Integer.parseInt(inputs);
        } catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(),"Invalid value\nEnter a number between 1 and 100");
            return false;
        } catch (Throwable e) {
            ErrorView.display(this.getClass().getName(),"Something happened: " + e);
            return false;
        }
        
        if (qty < 0 || qty > 100) {
            ErrorView.display(this.getClass().getName(),"Invalid value\nEnter a number between 1 and 100");
        }
        
        else if (qty == 0) {
            this.console.println("0 entered, returning to previous menu");
            return true;
        }
        else if (qty > 0 && qty <= 100) {
            this.console.println("Valid value");
            
            try{
                ItemControl.subtractItem(SellMenuView.item, qty);
            } catch (ItemControlException ice){
                  ErrorView.display(this.getClass().getName(),ice.getMessage());
                        return false;
                    }
            
            try{
                ItemControl.addMoney(SellMenuView.item, qty);
            } catch (ItemControlException ice){
                  ErrorView.display(this.getClass().getName(),ice.getMessage());
                        return false;
                    }
        
            return true;
        }
        
        return false;
            
        }
        
    }