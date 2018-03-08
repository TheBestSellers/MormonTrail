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
public class helpMenuView extends View{
    
    public helpMenuView(){
        super("Help Menu"
              + "\nPlease select an option"
              + "\nG - What is the goal of the game?"
              + "\nM - How to move"
              + "\nE - Estimate the number of resources"
              + "\nH - Harvest resources"
              + "\nD - Delivering resources to warehouse"
              + "\nQ - Quit");
            
    }
        
    @Override
    public boolean doAction(String[] inputs) {
        
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
