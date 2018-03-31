/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.control.MapControl;
import mormontrailproject.MormonTrailProject;
import byui.cit260.mormonTrail.exceptions.GameControlException;
import byui.cit260.mormonTrail.exceptions.MapControlException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sariah, Christopher, Alyssa
 */
public class mainMenuView extends View{

private gameMenuView gameMenuView;
private SaveGameMenuView saveGameMenuView;
private RestoreGameMenuView restoreGameMenuView;
private helpMenuView helpMenuView;
//private GeneralStoreView generalStoreView;
private TeamPaceView teamPaceView;
private riverCrossingMenuView riverCrossingMenuView;
private PrintMapReport PrintMapReport;
    
public mainMenuView(){
    super("Main Menu"
        + "\nPlease select an option"
        + "\nN - Start new game"
        + "\nR - Restore a saved game"
        + "\nS - Save current game"
        + "\nH - Get help on how to play the game"
        //+ "\nG - Test the general store view"
        + "\nP - Test the team pace view"
        + "\nC - Test the River Crossing view"
        + "\nM - Print Map Locations Report"
        + "\nQ - Quit\n");
    }
    
    @Override
    public boolean doAction(String inputs) {
    String menuItem = inputs;

    inputs = inputs.toUpperCase();

    switch (menuItem) {
        case "N": {
        try {
            startNewGame();
        } catch (GameControlException | MapControlException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
    }
            break;
        case "R": restoreSavedGame();
            break;
        case "S": saveGame();
            break;
        case "H": getHelp();
            break;
//        case "G": generalStore();
//            break;
        case "P": teamPace();
            break;
        case "C": riverCrossingMenuView();
            break;
        case "M": PrintMapReport();
            break;
        default: ErrorView.display(this.getClass().getName(),"Invalid menu item");
    }
    return false;
    }

    private void startNewGame() throws GameControlException, MapControlException {
        try {
        GameControl.createNewGame(MormonTrailProject.getPlayer());
        } catch (GameControlException gce){
            ErrorView.display(this.getClass().getName(),gce.getMessage());
        }
        gameMenuView = new gameMenuView();
        gameMenuView.display();
        
    }
    
    private void restoreSavedGame() {
        restoreGameMenuView = new RestoreGameMenuView();
        restoreGameMenuView.display();
    }
    
    private void saveGame() {
        saveGameMenuView = new SaveGameMenuView();
        saveGameMenuView.display();
    }

    private void getHelp() {
       helpMenuView = new helpMenuView();
       helpMenuView.display();
    }
    
//    private void generalStore() {
//        generalStoreView = new GeneralStoreView();
//        generalStoreView.display();
//    }
    
    private void teamPace() {
        teamPaceView = new TeamPaceView();
        teamPaceView.display();
    }

    private void riverCrossingMenuView() {
        riverCrossingMenuView = new riverCrossingMenuView();
        riverCrossingMenuView.display();
    }

    private void PrintMapReport() {
       PrintMapReport = new PrintMapReport();
       PrintMapReport.display();
    }


   
}
