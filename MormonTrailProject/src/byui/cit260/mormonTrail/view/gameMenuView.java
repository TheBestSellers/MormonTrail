/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.control.PeopleControl;

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
        + "\nH - Display Average Health of all people"
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
            case "H": PeopleControl.calculateAverageHealth(GameControl.createPersons());
            break;
//            case "S": ItemControl.sumWagonWeight(ItemControl.addItem());
//            break;
        default: System.out.println("Invalid menu item");
    }
    return false;
    }

    public void displayMap(){
        System.out.println("---Mormon Trail Map----");
       // for (Location location : locations)
        
    }
    
    private void displayCharacters() {
         System.out.println("displayCharacters stub called");
    }

    private void displayInventory() {
         System.out.println("displayInventory stub called");
    }

}
