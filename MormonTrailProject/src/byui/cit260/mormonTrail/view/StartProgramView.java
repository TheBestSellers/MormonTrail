package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import java.util.Scanner;
import byui.cit260.mormonTrail.model.Player;

/**
 *
 * @author Sariah, Christopher and Alyssa
 */
public class StartProgramView {
    
    public StartProgramView() {
    
    }
    String[] inputs = new String[1];
    
    public void display() {
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0] == null || inputs[0].equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);
        } while(!endOfView);
    }

    private String[] getInputs() {
        
        //create scanner to receive user input
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        boolean valid = false; 
        
        System.out.println("This is a description of the view."
                + "\nSomething about entering your name, maybe.");

        while(!valid) {
            //prompt for user input
            System.out.println("Type your name: ");
            
            //get the name entered by the user, trim and lowercase it
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toLowerCase();
            
            //Validate that the user entered something
            if(inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            valid = true;
        }
        
        return inputs;
       
    }
    
    public boolean doAction(String[] inputs){
    
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        
        if(player == null){
            System.out.println("Could not create the player. Enter a different name.");
            return false;
        }
        
        else{
            System.out.println("=========================" + "Welcome to the game "
                    + playersName + ". we hope you have a lot of fun!" + "========================");
        }
   
        mainMenuView mainMenuView = new mainMenuView();                
        mainMenuView.displayMainMenuView();
        return true;
       
    }
    
}