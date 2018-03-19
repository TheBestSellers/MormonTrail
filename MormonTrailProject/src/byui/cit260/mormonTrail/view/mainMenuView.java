/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.model.Game;
import byui.cit260.mormonTrail.model.Player;

/**
 *
 * @author Sariah, Christopher, Alyssa
 */
public class mainMenuView extends View{

private gameMenuView gameMenuView;
private SaveGameMenuView saveGameMenuView;
private RestoreGameMenuView restoreGameMenuView;
private startExistingGameView startExistingGameView;
private helpMenuView helpMenuView;
private GeneralStoreView generalStoreView;
private TeamPaceView teamPaceView;
private riverCrossingMenuView riverCrossingMenuView;
    
public mainMenuView(){
    super("Main Menu"
        + "\nPlease select an option"
        + "\nN - Start new game"
        + "\nR - Restore a saved game"
        + "\nS - Save current game"
        + "\nH - Get help on how to play the game"
        + "\nG - Test the general store view"
        + "\nP - Test the team pace view"
        + "\nC - Test the River Crossing view"
        + "\nQ - Quit\n");
    }
    
    @Override
    public boolean doAction(String[] inputs){
    String menuItem = inputs[0];

    inputs[0] = inputs[0].toUpperCase();

    switch (menuItem) {
        case "N": startNewGame();
            break;
        case "R": restoreSavedGame();
            break;
        case "S": saveGame();
            break;
        case "H": getHelp();
            break;
        case "G": generalStore();
            break;
        case "P": teamPace();
            break;
        case "C": riverCrossingMenuView();
            break;
        default: System.out.println("Invalid menu item");
    }
    return false;
    }

    private void startNewGame() {
        Player player = null;
        GameControl.createNewGame(player);    
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
    
    private void generalStore() {
        generalStoreView = new GeneralStoreView();
        generalStoreView.display();
    }
    
    private void teamPace() {
        teamPaceView = new TeamPaceView();
        teamPaceView.display();
    }

    private void riverCrossingMenuView() {
        riverCrossingMenuView = new riverCrossingMenuView();
        riverCrossingMenuView.display();
    }
   
}
