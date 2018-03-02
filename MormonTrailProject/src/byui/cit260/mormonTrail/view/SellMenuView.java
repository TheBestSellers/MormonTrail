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
 * @author alyssahundley
 */
public class SellMenuView {
    
    private SellQuantityMenuView sellQuantityMenuView;
    
    public SellMenuView() {
    }
    
    String[] inputs = new String[1];

    public void displaySellMenuView() {
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
        
        System.out.println("\nSell Items"
                + "\nPlease select an item to sell"
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
        
        sellQuantityMenuView = new SellQuantityMenuView();
        
        switch (menuItem) {
            case "A": sellQuantityMenuView.displaySellQuantityMenuView("Ammo");
                break;
            case "L": sellQuantityMenuView.displaySellQuantityMenuView("Large Wagon");
                break;
            case "M": sellQuantityMenuView.displaySellQuantityMenuView("Medium Wagon");
                break;
            case "S": sellQuantityMenuView.displaySellQuantityMenuView("Small Wagon");
                break;
            case "P": sellQuantityMenuView.displaySellQuantityMenuView("Protein");
                break;
            case "V": sellQuantityMenuView.displaySellQuantityMenuView("Veggie");
                break;
            case "W": sellQuantityMenuView.displaySellQuantityMenuView("Wagon Wheel");
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
}

