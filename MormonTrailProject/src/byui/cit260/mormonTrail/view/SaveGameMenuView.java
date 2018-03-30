package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.exceptions.GameControlException;
import byui.cit260.mormonTrail.model.Game;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author Christopher Sellers
 */
public class SaveGameMenuView extends View {

    public SaveGameMenuView() {
        super("----Save Current Game----"
         + "\nType the file path you wish to save this game under,"
         + "\nOr enter 'Q' to quit back to the previous menu:");
    }
        
    @Override
    public boolean doAction(String inputs) {
        
        String filePath = inputs.toLowerCase();
        
        Game game = MormonTrailProject.getCurrentGame();
        
        try {
            GameControl.saveGame(game, filePath);
        }
        catch (GameControlException gce) {
            ErrorView.display(this.getClass().getName(),"Error saving file." + gce.getMessage());
            return false;
        }
        this.console.println("Game was successfully saved at: " + filePath);
        return true;
    }
}