/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;

/**
 *
 * @author alyssahundley
 */
public class PeopleControl {
    
    public static int calcHealthDraw(int stamina, int foodShortage, double weather, double pace){
        if(stamina < 1 || stamina >5 ){
            return -1;
        }
        if(foodShortage < 0 || foodShortage >20){
            return -1;
        } 
        if (!(weather == 1.0 || weather == 1.5 || weather == 2.0 || weather == 3.0)){
            return -1;
        }
       if(!(pace == 1 || pace == 1.5 || pace == 2)){
           return -1;
       }
       
       int healthDraw = (int)Math.round((6-stamina)*(weather)*(pace) + foodShortage);
       
       return healthDraw;
    }
            
            
    //calcHealthDraw(Stamina: int, Food: int, Weather: double, Pace: double) returns int
    //If parameters are invalid, return -1;
    //If parameters are valid, calculate (6-Stamina)(Weather)(Pace) + foodShortage, round to nearest int and return;
    
    //PARAMETERS
    //Stamina - (constant for each person, 1-5)
    //Amount of food, calcDailyHealthDraw. Subtract shortage of food available from food drawn from each person’s health.
    //Weather - Clear (1), Wind(1.5), Rain (2), Snow(3). Later in the season, there is more probability of bad weather.
    //Team Pace - Slow (1), Average(1.5), Fast(2)


}
