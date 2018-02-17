/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;
import java.util.Random;

/**
 *
 * @author sariahmudaliar
 */
public class EventControl {
    
    public static int calcRiverCrossingProbability(int riverDepth, int wagonWeight, int oxenStrength){
        if(riverDepth < 1 || riverDepth > 10){
            return 0;
        }
        if(wagonWeight < 1 || wagonWeight > 10){
            return 0;
        }
        if(oxenStrength < 1 || oxenStrength > 10){
            return 0;
        }
        
        int riverProbability = (riverDepth + wagonWeight + oxenStrength);
        
        return riverProbability;
        
    }
   
}
