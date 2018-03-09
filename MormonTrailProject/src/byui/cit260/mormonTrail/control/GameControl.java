/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;
import byui.cit260.mormonTrail.model.Player;

/**
 *
 * @author alyssahundley, Sariah
 */
 public class GameControl {
    
    public static Player savePlayer (String name){
        
        if (name == null || name.length() <1){
            return null;
        }

        System.out.println("***savePlayer() called");
        Player player = new Player();
        player.setName(name);
        return player;
    }
    
    public static void createNewGame(Player player) {
       System.out.println("****startNewGame() called");
    }

    public static boolean restoreGame(String fileName) {
        System.out.println("****restoreGame() called, file name: " +fileName);
        return true;
    }
    
    public static boolean saveGame(String fileName) {
        System.out.println("****saveGame() called, file name: " +fileName);
        return true;
    }
}


//savePlayer(name): Player
//BEGIN
// if name is null OR length of name is < 1 THEN
// RETURN null
// ENDIF
// player = new Player object
// save the name in the player object
// save the player in the main class of the project
// RETURN player
//END