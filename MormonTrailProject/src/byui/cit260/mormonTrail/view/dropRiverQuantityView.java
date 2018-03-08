/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.ItemControl;
import java.util.Scanner;

/**
 *
 * @author Sariah
 */
public class dropRiverQuantityView extends View{
    
    public dropRiverQuantityView(String item) {
        super("\nHow many" + item + "(s) would you like to drop from your wagon?----"
             + "\nE - Exit and Return to previous menu");
        
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
           ItemControl.subtractRiverItem(item, qty);
            return true;
        }
        
        return false;
            
        }
        
   
}