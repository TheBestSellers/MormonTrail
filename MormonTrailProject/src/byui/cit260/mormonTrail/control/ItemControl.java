package byui.cit260.mormonTrail.control;

/**
 *
 * @author ChristopherSellers
 */
public class ItemControl {
    
    public static int calcFoodDraw(double stamina, double pace) {
        
        int errorCode = 0;
        
        if(stamina < 1 || stamina > 5) {
            errorCode--;
        }
        
        if(pace < 1 || pace > 2) {
            errorCode -= 2;
        }
        
        if(errorCode < 0) {
            return errorCode;
        }
        
        int foodDraw = (int)Math.round((((stamina/2)*pace)+2)*2);
        return foodDraw;
    }
    
}


//calcFoodDraw(Stamina: int, Pace: double) returns int
//
//If stamina is not between 1 and 5, return -1;
//If pace is not between 1 and 2, return -2;
//If both are invalid, return -3;
//If parameters are all valid, calculate FoodDraw: (((Stamina/2)Pace)+2)*2, round to nearest int and return;
//
//Return FoodDraw
