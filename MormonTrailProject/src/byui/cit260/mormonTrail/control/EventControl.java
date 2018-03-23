/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;
import byui.cit260.mormonTrail.exceptions.EventControlException;
import java.util.Random;

/**
 *
 * @author sariahmudaliar
 */
public class EventControl {
    
//    public static int calcWagonSuppliesDrop(int wagonWeight, int wagonCurrentInventory, int dropSuppliesTotal)
//        throws EventControlException {
//        
//        int newWagonWeight;
//        newWagonWeight = (wagonWeight - dropSuppliesTotal);
//                return newWagonWeight;
//    }

 
    public static int calcRiverCrossingProbability(int riverDepth, int wagonWeight, int oxenStrength)
                    throws EventControlException {
        
        if(riverDepth < 1 || riverDepth > 10){
            throw new EventControlException("Exception Error: River Depth must be between 1 and 10");
        }
       
        else if(wagonWeight < 1 || wagonWeight > 10){
            throw new EventControlException("Exception Error: Wagon Weight must be between 1 and 10");
        }
       
        else if(oxenStrength < 1 || oxenStrength > 10){
            throw new EventControlException("Exception Error: Oxen Strength must be between 1 and 10");
        }
        
        int riverProbability = (riverDepth + wagonWeight + oxenStrength);
        
        return riverProbability;
    }

   
}
