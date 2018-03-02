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
public class dropRiverQuantityView {
    
    public dropRiverQuantityView() {
        
    }
    
    String[] inputs = new String[1];
    
   public void displayDropRiverQuantityView(String item) {
       boolean endView = false;
       do {
            String[] inputs = this.getInputs(item);
            inputs[0] = inputs[0].trim();
            if (inputs[0] == null || inputs[0].equals("Q")){
                return;
   }
            endView = doAction(item, inputs);
       } while(!endView);
    
}
   
   private String[] getInputs(String item) {
        
        //create scanner to receive user input
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        boolean valid = false;
        
        System.out.println("\nHow many" + item + "(s) would you like to drop from your wagon?----"
                + "\nE - Exit and Return to previous menu");
        
        while(!valid) {
            //prompt user for input
            System.out.println("Enter your amount.");
            
            //get the input user entered, trim it
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();
            
            //Validate that the user entered a letter
            if(inputs[0].length() < 1) {
                System.out.println("You must enter an interger value.");
                continue;
            }
            valid = true;
            
        }
        return inputs;
   }
        
        private boolean doAction(String item, String[] inputs) {
        
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