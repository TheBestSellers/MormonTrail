/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author alyssahundley
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    String[] inputs = new String[1];
    
    public View(){
      
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
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
    
    @Override
    public String[] getInputs(){
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        boolean valid = false;
        
        System.out.println("\n" + this.displayMessage);
               
        
        while(!valid) {            
            //get the input user entered, trim it
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();
            
            //Validate that the user entered a letter
//            if(inputs[0].length() < 1) {
//                System.out.println("You must enter a value.");
//                continue;
//            }
            valid = true;
            
        }
      return inputs;
    }
}

