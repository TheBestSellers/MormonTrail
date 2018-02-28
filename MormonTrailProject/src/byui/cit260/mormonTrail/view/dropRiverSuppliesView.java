/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;


import byui.cit260.mormonTrail.control.EventControl;
import java.util.Scanner;

/**
 *
 * @author Sariah
 */
public class dropRiverSuppliesView {

    private Object calcWagonSuppliesDrop;

   

    
  public dropRiverSuppliesView(){
        
    }
    
    String[] inputs = new String[1];

        public void displayDropRiverSuppliesView() {
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
        
        System.out.println("Current Wagon Supplies"
                + "\nPlease select an item you would like to drop"
                + "\nF - Food"
                + "\nT - Tools"
                + "\nO - Other Items"
                + "\nE - Exit & Return\n");
        
        while(!valid) {
            //prompt user for input
            System.out.println("Select an item from your wagon to drop\n");
            
            //get the input user entered, trim it
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();
            
            //Validate that the user entered a letter
            if(inputs[0].length() < 1) {
                System.out.println("You must select an item or press E to exit and return");
                continue;
            }
            
            valid = true;
            
        }
        return inputs;
        

    }

    private boolean doAction(String[] inputs) {
        
        if (inputs > 0) {
           calcWagonSuppliesDrop.EventControl();
        } else {
            System.out.println("Error, Try Again.");
        }
        
        
        
        int dropSuppliesTotal;
        dropSuppliesTotal = EventControl.calcWagonSuppliesDrop(0, 0, 0);
        
        
        if(calcWagonSuppliesDrop > 0){
        System.out.println("Your total wagon weight is now....");
        
        } 
        
         else { System.out.println("Your wagon weight stays the same");

        }
     return false;
        
        
    }

    private void EventControl() {
        EventControl EventControl = new EventControl();
        EventControl.displayEventControl();
        
    }
    
    
    
}

