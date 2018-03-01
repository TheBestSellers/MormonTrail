package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Christopher Sellers
 */
public class GeneralStoreView {

    private BuyMenuView buyMenuView;
    private SellMenuView sellMenuView;
    
    public GeneralStoreView() {
    }
    
    String[] inputs = new String[1];

    public void displayGeneralStoreView() {
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
        
        System.out.println("----Welcome to the General Store!----"
                + "\nBuy\\sell all the supplies you could need on your journey!"
                + "\nPlease select an option"
                + "\n\nB - Buy"
                + "\nS - Sell"
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
        
        switch (menuItem) {
            case "B": buyMenuView = new BuyMenuView();
                      buyMenuView.displayBuyMenuView();
                break;
            case "S": sellMenuView = new SellMenuView();
                      sellMenuView.displaySellMenuView();
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
    
    
}
