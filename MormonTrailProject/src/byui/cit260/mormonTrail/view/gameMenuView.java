/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.model.Game;
import byui.cit260.mormonTrail.model.Player;
import java.util.Scanner;
import byui.cit260.mormonTrail.view.GeneralStoreView;

/**
 *
 * @author Sariah, Christopher, Alyssa
 */
public class gameMenuView extends View{

   
public gameMenuView(){
    super("Game Menu"
        + "\nPlease select an option"
        + "\nM - Display Map"
        + "\nC - Display Characters"
        + "\nI - Display Inventory"
        + "\nQ - Quit\n");
    }
    
    @Override
    public boolean doAction(String[] inputs){
    String menuItem = inputs[0];

    inputs[0] = inputs[0].toUpperCase();

    switch (menuItem) {
        case "M": displayMap();
            break;
           case "C": displayCharacters();
            break;
           case "I": displayInventory();
            break;
        default: System.out.println("Invalid menu item");
    }
    return false;
    }

    public void displayMap(){
        Game game = new Game();
        
    }
//game = get the currentGame from the main class
//locations = get the 2-D locations array from the map
//Print the title
//Print the column numbers for each column
//for every row in map
//Print a row divider
//Print the row number on a new line
//for every column in the row
//Print a column divider
//location = locations[row][column]
//if location has been visited
//Get the mapSymbol for the scene in this location
//Print the mapSymbol
//else
//Print " ?? "
//endif
//endFor
//Print the ending column divider
//endFor
//Print the ending row divider
    
    
    private void displayCharacters() {
         System.out.println("displayCharacters stub called");
    }

    private void displayInventory() {
         System.out.println("displayInventory stub called");
    }

}
