package byui.cit260.mormonTrail.view;

import java.util.Scanner;
import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.exceptions.GameControlException;
import byui.cit260.mormonTrail.model.Game;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author Christopher Sellers
 */
public class RestoreGameMenuView extends View {

    public RestoreGameMenuView() {
        super("----Restore a saved game----"
         + "\nType the file path of the game you wish to restore,"
         + "\nOr enter 'Q' to quit back to the previous menu:");
    }
        
    @Override
    public boolean doAction(String inputs) {
        
        String filePath = inputs.toLowerCase();
        
        try {
            GameControl.restoreGame(filePath);
        }
        catch (GameControlException | ClassNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        this.console.println("Game was successfully restored from: " + filePath);
        return true;
    }
}