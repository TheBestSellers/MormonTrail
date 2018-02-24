/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrailproject;

import byui.cit260.mormonTrail.model.Event;
import byui.cit260.mormonTrail.model.Inventory;
import byui.cit260.mormonTrail.model.Item;
import byui.cit260.mormonTrail.model.Livestock;
import byui.cit260.mormonTrail.model.Person;
import byui.cit260.mormonTrail.model.Player;
import byui.cit260.mormonTrail.model.Wagon;
import byui.cit260.mormonTrail.model.Game;
import byui.cit260.mormonTrail.view.StartProgramView;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alyssahundley, Christopher, Sariah
 */
public class MormonTrailProject {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        MormonTrailProject.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MormonTrailProject.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        MormonTrailProject.setPlayer(player);
    }
    
}