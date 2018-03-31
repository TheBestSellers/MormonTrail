/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.control.MapControl;
import byui.cit260.mormonTrail.control.PeopleControl;
import byui.cit260.mormonTrail.model.Location;

/**
 *
 * @author Sariah, Christopher, Alyssa
 */
public class gameMenuView extends View {
    
    private PrintCharacterReportView printCharacterReportView;

    public gameMenuView() {
        super("Game Menu"
                + "\nPlease select an option"
                + "\nM - Display Map"
                + "\nC - Character Report"
                + "\nI - Display Inventory"
                + "\nH - Display Average Health of all people"
                + "\nQ - Quit\n");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "M":
                displayMap();
                break;
            case "C":
                printCharacterReport();
                break;
            case "I":
                displayInventory();
                break;
            case "H":
                PeopleControl.calculateAverageHealth(GameControl.createPersons());
                break;
//            case "S": ItemControl.sumWagonWeight(ItemControl.addItem());
//            break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        return false;
    }

    public void displayMap() {

        MapControl mc = new MapControl();
        Location[] locations = mc.createLocations();

        //for (Location location : MormonTrailProject.getMap().locations) {
        this.console.println("********************************************************************************************************************************************************************************************************************\n|START|\n\n"
                + "   Nauvoo     " + locations[1].getName() + "     " + locations[3].getName() + "     " + locations[5].getName() + "     " + locations[7].getName() + "     " + locations[9].getName()
                + "\n     T            " + locations[1].getSymbol() + "                 " + locations[3].getSymbol() + "                 " + locations[5].getSymbol() + "                 " + locations[7].getSymbol() + "                  " + locations[9].getSymbol()
                + "\n     |            |                 |                 |                 |                  |"
                + "\n     |            |                 |                 |                 |                  |"
                + "\n====================================================================================================================================================================\n"
                + "         |                |                   |                |                 |                |\n"
                + "         |                |                   |                |                 |                |\n"
                + "         " + locations[0].getSymbol() + "                " + locations[2].getSymbol() + "                   " + locations[4].getSymbol() + "                " + locations[6].getSymbol() + "                 " + locations[8].getSymbol() + "                " + locations[10].getSymbol()
                + "\n     " + locations[0].getName() + "      " + locations[2].getName() + "          " + locations[4].getName() + "      " + locations[6].getName() + "        " + locations[8].getName() + "       " + locations[10].getName()
                + "\n\n                                                                                                     |END|"
                + "\n*******************************************************************************************************************************************************************************************************************************************************");
        //}
    }

//    public void displayMapReport() {
//        
//        MapControl mc = new MapControl();
//        Location[] locations = mc.createLocations();
//        
//        try (PrintWriter out = new PrintWriter(filePath)) {
//            
//            //print title and column headings
//            out.println("\n\n                       Map Location Report                        ");
//            out.printf("%n%-20s%10s", "Location", "Scene Type");
//            out.printf("%n%-20s%10s", "--------------", "------------------");
//            
//            //print the location and the scene type that is on the map
//            for (Location location : MormonTrailProject.getMap().locations) {
//                out.printf("%n%-20s%7d%13.2", locations.getName()
//                                                                        , locations.getSymbol());
//            }
//        }   catch (IOException ex) {
//            System.out.println("I/O Error: " + ex.getMessage());
//        } 
//    }
    private void printCharacterReport() {
        printCharacterReportView = new PrintCharacterReportView();
        printCharacterReportView.display();
    }

    private void displayInventory() {
        this.console.println("displayInventory stub called");
    }

}
