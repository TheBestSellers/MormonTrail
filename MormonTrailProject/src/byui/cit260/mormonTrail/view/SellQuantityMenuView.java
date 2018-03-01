

package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.ItemControl;
import java.util.Scanner;

public class SellQuantityMenuView {
    
    public SellQuantityMenuView() {
    }
    
    String[] inputs = new String[0];

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
        
        System.out.println("\nHow many " + item + "(s) would you like to sell?"
                + "\nQ - Return to previous menu");
        
        while(!valid) {
            //prompt user for input
            System.out.println("Enter your amount.");
            
            //get the input user entered
            inputs[0] = inFile.nextLine();
            
            //Validate that the user entered an integer
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
        catch (NumberFormatException e) {
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
            return true;
        }
        
        return false;
            
        }
        
    }

