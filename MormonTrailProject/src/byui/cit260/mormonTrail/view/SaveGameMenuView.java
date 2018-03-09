package byui.cit260.mormonTrail.view;

import java.util.Scanner;
import byui.cit260.mormonTrail.control.GameControl;

/**
 *
 * @author Christopher Sellers
 */
public class SaveGameMenuView extends View {

    public SaveGameMenuView() {
        super("----Save Current Game----"
         + "\nType the file name you wish to save this game under,"
         + "\nOr enter 'Q' to quit back to the previous menu:");
    }
        
    @Override
    public boolean doAction(String[] inputs) {
        
        String fileName = inputs[0].toLowerCase();
        
        if (fileName.length() > 12) {
            System.out.println("Invalid value\nEnter an existing file name "
                    + "not including the file extension.");
            return false;
        }
        
        try {
            fileName += ".sav";
            GameControl.saveGame(fileName);
            return true;
        }
        catch (Exception e) {
            System.out.println("Error saving game: " + e);
            return false;
        }
    }
}