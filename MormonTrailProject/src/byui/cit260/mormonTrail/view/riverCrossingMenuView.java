/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.EventControl;
import byui.cit260.mormonTrail.exceptions.EventControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sariah
 */
public class riverCrossingMenuView extends View {

    private dropRiverSuppliesView dropRiverSuppliesView;
    private riverCrossingProbabilityView riverCrossingProbabilityView;
    
     public riverCrossingMenuView(){
              super("Welcome to the River Crossing"
              + "\nPlease select an option"
              + "\nD - Drop Supplies"
              + "\nC - Cross the river & Probability Success"
              + "\nB - Go back and think about it\n");
    }
    
    @Override
    public boolean doAction(String[] inputs) {
    String menuItem = inputs[0];
       
        switch (menuItem) {
            case "D": dropRiverSuppliesView();
                break;
            case "C": riverCrossingProbabilityView();
                break;
            case "B": return true;
                
            default: System.out.println("Invalid menu item");
        }
        return false;
        
    }

    private void dropRiverSuppliesView() {
        dropRiverSuppliesView = new dropRiverSuppliesView();
        dropRiverSuppliesView.display();
    }

    private void riverCrossingProbabilityView() {
       riverCrossingProbabilityView = new riverCrossingProbabilityView();
       riverCrossingProbabilityView.display();
    }

    }
