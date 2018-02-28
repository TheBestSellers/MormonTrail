/*/*9+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author saria
 */
public class helpMenuView {
    
    public helpMenuView(){
            
    }
    String[] inputs = new String[1];
    
    public void displayHelpMenuView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0] == null || inputs[0].equals("Q") || inputs[0].toUpperCase().equals("Q")) {
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
        
        System.out.println("Help Menu"
                + "\nPlease select an option"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nE - Estimate the number of resources"
                + "\nH - Harvest resources"
                + "\nD - Delivering resources to warehouse"
                + "\nQ - Quit");
        
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
            case "G": System.out.println("\nThe goal of the game is to....\n");
                break;
            case "M": System.out.println("\nYou move by....\n");
                break;
            case "E": System.out.println("\nEstimated resources are....\n");
                break;
            case "H": System.out.println("\nHarvest resources by...\n");
                break;
            case "D": System.out.println("\nDeliver resources to warehouse by....\n");
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
    
}
