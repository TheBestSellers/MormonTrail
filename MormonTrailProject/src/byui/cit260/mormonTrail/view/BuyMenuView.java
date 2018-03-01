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
 * @author Christopher S
 */
public class buyMenuView {
    
    public buyMenuView() {
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
        
        switch (menuItem) {
            case "A": ItemControl.addItem("ammo", 2);
                break;
            case "L": ItemControl.addItem("Large Wagon", 2);
                break;
            case "M": ItemControl.addItem("Medium Wagon", 2);
                break;
            case "S": ItemControl.addItem("Small Wagon", 2);
                break;
            case "P": ItemControl.addItem("Protein", 2);
                break;
            case "V": ItemControl.addItem("Veggie", 2);
                break;
            case "W": ItemControl.addItem("Wagon Wheel", 2);
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
    
}