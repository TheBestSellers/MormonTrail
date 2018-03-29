package byui.cit260.mormonTrail.view;

import java.util.Scanner;
import byui.cit260.mormonTrail.control.GameControl;

/**
 *
 * @author Christopher Sellers
 */
public class RestoreGameMenuView extends View {

    public RestoreGameMenuView() {
        super("----Restore a saved game----"
         + "\nType the file name of the game you wish to restore,"
         + "\nOr enter 'Q' to quit back to the previous menu:");
    }
        
    @Override
    public boolean doAction(String inputs) {
        
        String fileName = inputs.toLowerCase();
        
        if (fileName.length() > 12) {
            ErrorView.display(this.getClass().getName(),"Invalid value\nEnter a file name "
                    + "no longer than 12 character");
            return false;
        }
        
        try {
            fileName += ".sav";
            GameControl.restoreGame(fileName);
            return true;
        }
        catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error restoring saved game: " + e);
            return false;
        }
    }
}