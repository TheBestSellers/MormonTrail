package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Christopher Sellers
 */
public class BuyMenuView {
    
    private BuyQuantityMenuView buyQuantityMenuView;

    public BuyMenuView() {
    }
    
    String[] inputs = new String[1];

    public void displayBuyMenuView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            inputs[0] = inputs[0].trim().toUpperCase();
            if (inputs[0] == null || inputs[0].equals("Q")){
                return;
            }
            endView = doAction(inputs);
        } while(!endView);
    }

    private String[] getInputs() {
        
        //create scanner to receive user input
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        boolean valid = false;
        
        System.out.println("\n----Buy Items----"
                + "\nPlease select an item to buy"
                + "\n\nA - Ammo"
                + "\nL - Large Wagon"
                + "\nM - Medium Wagon"
                + "\nS - Small Wagon"
                + "\nP - Protein"
                + "\nV - Veggies"
                + "\nW - Spare Wheel"
                + "\nQ - Return to previous menu");
        
        while(!valid) {
            //prompt user for input
            System.out.println("Select a menu option.");
            
            //get the input user entered, trim it
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();
            
            //Validate that the user entered a letter
            if(inputs[0].length() < 1) {
                System.out.println("You must enter a value.");
                continue;
            }
            valid = true;
            
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        String menuItem = inputs[0];
        
        buyQuantityMenuView = new BuyQuantityMenuView();
        
        switch (menuItem) {
            case "A": buyQuantityMenuView.displayBuyQuantityMenuView("Ammo");
                break;
            case "L": buyQuantityMenuView.displayBuyQuantityMenuView("Large Wagon");
                break;
            case "M": buyQuantityMenuView.displayBuyQuantityMenuView("Medium Wagon");
                break;
            case "S": buyQuantityMenuView.displayBuyQuantityMenuView("Small Wagon");
                break;
            case "P": buyQuantityMenuView.displayBuyQuantityMenuView("Protein");
                break;
            case "V": buyQuantityMenuView.displayBuyQuantityMenuView("Veggie");
                break;
            case "W": buyQuantityMenuView.displayBuyQuantityMenuView("Wagon Wheel");
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
    
}
