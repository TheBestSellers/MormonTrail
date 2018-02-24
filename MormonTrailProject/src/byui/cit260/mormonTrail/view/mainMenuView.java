/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author Sariah, Christopher, Alyssa
 */
public class mainMenuView {

    private gameMenuView gameMenuView;
    private startExistingGameView startExistingGameView;
    private helpMenuView helpMenuView;
    
  public mainMenuView(){
        
    }
    
    String[] inputs = new String[1];

        public void displayMainMenuView() {
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
        
        System.out.println("Main Menu"
                + "Please select an option"
                + "\nN - Start new game"
                + "\nR - Restart exisiting game"
                + "\nH - Get help on how to play the game"
                + "\nE - Exit\n");
        
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
            case "N": startNewGame();
                break;
            case "R": restartGame();
                break;
            case "H": getHelp();
                break;
            case "E": return true;
                
            default: System.out.println("Invalid menu item");
        }
        return false;
        
    }
    


    private void restartGame() {
        startExistingGameView = new startExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void startNewGame() {
      Player Player = null;
      GameControl.createNewGame(Player);
        
        gameMenuView = new gameMenuView();
        gameMenuView.displayGameMenuView();
       
    }

    private void getHelp() {
       helpMenuView = new helpMenuView();
       helpMenuView.displayHelpMenuView();
       
    }
    
    
    
}
