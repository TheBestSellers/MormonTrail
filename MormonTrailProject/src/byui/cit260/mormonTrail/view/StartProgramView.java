package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.exceptions.GameControlException;
import java.util.Scanner;
import byui.cit260.mormonTrail.model.Player;

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
    public boolean doAction(String[] inputs){
    
        String playersName = inputs[0];
        try {
            Player player = GameControl.savePlayer(playersName);
        } catch (GameControlException mce) {
            System.out.println(mce.getMessage());
            return false;
                
        }
        
        if(player == null){
            System.out.println("Could not create the player."
                    + "Enter a different name.");
            return false;
        }
        
        else{
            System.out.println("=========================" +"Welcome to the game "
                    + playersName + ". we hope you have a lot of fun!" + "========================");
        }
   
        mainMenuView mainMenuView = new mainMenuView();                
        mainMenuView.display();
        return true;
       
    }
    
}