/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrailproject;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.model.Player;
import byui.cit260.mormonTrail.model.Game;
import byui.cit260.mormonTrail.model.Map;
import byui.cit260.mormonTrail.model.Person;
import byui.cit260.mormonTrail.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author alyssahundley, Christopher, Sariah
 */
public class MormonTrailProject {

    private static Game currentGame = null;
    private static Player player = null;
    private static Map map = null;
    private static Person[] party = GameControl.createPersons();
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static Person[] getParty() {
        return party;
    }

    public static void setParty(Person[] party) {
        MormonTrailProject.party = party;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MormonTrailProject.logFile = logFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MormonTrailProject.currentGame = currentGame;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        MormonTrailProject.map = map;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MormonTrailProject.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MormonTrailProject.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MormonTrailProject.inFile = inFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create StartProgramView and start the program
        try {
            //open character stream files for end user input and output
            MormonTrailProject.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            MormonTrailProject.outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

            MormonTrailProject.setPlayer(player);
            return;

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        } finally {
            try {
                if (MormonTrailProject.inFile != null) {
                    MormonTrailProject.inFile.close();
                }
                if (MormonTrailProject.inFile != null) {
                    MormonTrailProject.outFile.close();
                }
                if (logFile != null) {
                    logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }

    }
}
