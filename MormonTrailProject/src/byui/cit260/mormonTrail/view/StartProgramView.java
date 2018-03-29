package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.exceptions.GameControlException;
import java.util.Scanner;
import byui.cit260.mormonTrail.model.Player;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author Sariah, Christopher and Alyssa
 */
public class StartProgramView extends View{
    
    public StartProgramView() {
        super("\nIn the text-based game The Oregon Trail / Mormon"
              + "\nTrail you play the role of the leader of a small wagon train"
              + "\nheading to Oregon/Utah. It is your job to purchase supplies,"
              + "\nassemble your party, and lead them to safety through the"
              + "\nperils of the wild american west."
              + "\n\nPlease enter your name:");
    }
   
    @Override
    public boolean doAction(String inputs){
    
        String playersName = inputs;
        try {
            MormonTrailProject.setPlayer(GameControl.savePlayer(playersName));
        } catch (GameControlException mce) {
            ErrorView.display(this.getClass().getName(),mce.getMessage());
            return false;
        } catch (Throwable error) {
            ErrorView.display(this.getClass().getName(), error.getMessage());
            return false;
        }
        
        
        this.console.println("=========================" +"Welcome to the game "
            + playersName + ". We hope you have a lot of fun!" + "========================");
   
        mainMenuView mainMenuView = new mainMenuView();                
        mainMenuView.display();
        return true;
       
    }
    
}