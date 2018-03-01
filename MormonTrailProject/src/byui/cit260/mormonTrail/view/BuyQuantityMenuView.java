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
public class BuyQuantityMenuView {
    
    public BuyQuantityMenuView() {
    }
    
    String[] inputs = new String[1];

    public void displayBuyQuantityMenuView(String item) {
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
        
        System.out.println("\n----How many " + item + "(s) would you like to buy?----"
                + "\nQ - Return to previous menu");
        
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
            ItemControl.addItem(item, qty);
            ItemControl.subtractMoney();
            return true;
        }
        
        return false;
            
        }
        
    }