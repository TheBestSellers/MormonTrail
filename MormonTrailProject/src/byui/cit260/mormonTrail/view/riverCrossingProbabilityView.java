/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.exceptions.EventControlException;
import byui.cit260.mormonTrail.control.EventControl;

/**
 *
 * @author Sariah
 */
public class riverCrossingProbabilityView extends View {

public riverCrossingProbabilityView() {
    super("Press C for calculate to see your probability: ");
}
    
    @Override
    public boolean doAction(String[] inputs) {
       String playersName = inputs[0];
        try {
           int calcRiverCrossingProbability = EventControl.calcRiverCrossingProbability(5, 20, 1);
        } catch (EventControlException mce) {
            System.out.println(mce.getMessage());
            return false;
        }
        return false;
        
        
 
    }
}
