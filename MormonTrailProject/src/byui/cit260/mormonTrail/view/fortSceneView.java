/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;


import java.util.Scanner;

/**
 *
 * @author Sariah
 */
public class fortSceneView {


    private generalStoreView generalStoreView;

    
  public fortSceneView(){
        
    }
    
    String[] inputs = new String[1];

        public void displayFortSceneView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0] == null || inputs[0].toUpperCase().equals("Q")){
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
        
        System.out.println("Wlsome to a Fort"
                + "\nPlease select an option"
                + "\nG - Visit the General Store"
                + "\nE - Exit & Return to Trail\n");
        
        while(!valid) {
            //prompt user for input
            System.out.println("Select a menu option.\n");
            
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
            case "G": generalStoreView();
                break;
            case "E": return true;
                
            default: System.out.println("Invalid menu item");
        }
        return false;
        
    }

    private void generalStoreView() {
        generalStoreView = new generalStoreView();
        generalStoreView.displayGeneralStoreView();
        
    }
    

    
    
    
}

