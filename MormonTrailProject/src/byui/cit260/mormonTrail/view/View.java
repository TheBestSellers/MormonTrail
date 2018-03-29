/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author alyssahundley
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    //String[] inputs = new String[1];
    String inputs;

    
    protected final BufferedReader keyboard = MormonTrailProject.getInFile();
    protected final PrintWriter console = MormonTrailProject.getOutFile();
    
    public View(){
      
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        boolean endView = false;
//        do {
//            String[] inputs = this.getInputs();
//            inputs[0] = inputs[0].trim().toUpperCase();
//            if (inputs[0] == null || inputs[0].equals("Q")){
//                return;
//            }

          do{
             inputs = this.getInputs();
             inputs = inputs.trim().toUpperCase();
             if (inputs == null || inputs.equals("Q")){
                 return;
              
          }
            endView = doAction(inputs);
        } while(!endView);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getInputs(){
        boolean valid = false;
        String selection = null;
        try {
            //while a valid name has not been retrieved
            while (!valid) {
                this.console.println(displayMessage);    
                //get the value entered from the keyboard
                selection = this.keyboard.readLine();
                selection = selection.trim().toUpperCase();
                
                if (selection.length() < 1) { //blank value entered
                    this.console.println("You must enter a value.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        
        return selection;
                }
        
//        this.console.println("\n" + this.displayMessage);
               
        
//        while(!valid) {            
//            //get the input user entered, trim it
//            inputs[0] = inFile.nextLine();
//            inputs[0] = inputs[0].trim().toUpperCase();
            
            //Validate that the user entered a letter
//            if(inputs[0].length() < 1) {
//                this.console.println("You must enter a value.");
//                continue;
//            }
//            valid = true;
//            
//        }
    }

