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
public class SellMenuView extends View{
    
    private SellQuantityMenuView sellQuantityMenuView;
    
    public SellMenuView() {
        super("\nSell Items"
             + "\nPlease select an item to sell"
             + "\n\nA - Ammo"
             + "\nL - Large Wagon"
             + "\nM - Medium Wagon"
             + "\nS - Small Wagon"
             + "\nP - Protein"
             + "\nV - Veggies"
             + "\nW - Spare Wheel"
             + "\nQ - Return to previous menu");
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        
        String menuItem = inputs[0];
        
        sellQuantityMenuView = new SellQuantityMenuView();
        
        switch (menuItem) {
            case "A": sellQuantityMenuView.display("Ammo");
                break;
            case "L": sellQuantityMenuView.display("Large Wagon");
                break;
            case "M": sellQuantityMenuView.display("Medium Wagon");
                break;
            case "S": sellQuantityMenuView.display("Small Wagon");
                break;
            case "P": sellQuantityMenuView.display("Protein");
                break;
            case "V": sellQuantityMenuView.display("Veggie");
                break;
            case "W": sellQuantityMenuView.display("Wagon Wheel");
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
}

