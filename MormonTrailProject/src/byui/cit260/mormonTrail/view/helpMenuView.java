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
            if (inputs[0] == null || inputs[0].equals("Q")) {
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
                + "Please select an option"
                + "G - What is the goal of the game?"
                + "M - How to move"
                + "E - Estimate the number of resources"
                + "H - Harvest resources"
                + "D - Delivering resources to warehouse"
                + "Q - Quit");
        
        while(!valid) {
            //prompt user for input
            System.out.println("Select a menu option.");
            
            //get the input user entered, trim it
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim();
            
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
        
        char menuItem = 0;
        
        switch (menuItem) {
            case 'G': System.out.println("The goal of the game is to....");
                break;
            case 'M': System.out.println("You move by....");
                break;
            case 'E': System.out.println("Estimated resources are....");
                break;
            case 'H': System.out.println("Harvest resources by...");
                break;
            case 'D': System.out.println("Deliver resources to warehouse by....");
                break;
            case 'Q': return true;
            default: System.out.println("Invalid menu item");
            
        }
     return false;
        
    }
    
}
