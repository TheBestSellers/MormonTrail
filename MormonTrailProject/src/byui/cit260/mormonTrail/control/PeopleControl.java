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

    public static int calcDayOfRest(int stamina){
        if(stamina < 1 || stamina >5 ){
            return -1;
        }
        int dayOfRest = (int)Math.round(stamina*1.5);
        
        return dayOfRest;
        //If parameters are invalid, return -1;
        //If parameters are valid, calculate Stamina*1.5, round to nearest int and return;
    }
    
    public static int calcHealth(int currentHealth, int healthDraw, int dayOfRest){
        
        if(currentHealth < 1 || currentHealth > 100 ){
            return -1;
        }
        if(healthDraw < 0 || healthDraw >50 ){
            return -1;
        }
        if(dayOfRest < 0 || dayOfRest > 8 ){
            return -1;
        }
        if(healthDraw > 0 && dayOfRest > 0){
            return -1;   
        }
        if(healthDraw == 0 && dayOfRest == 0){
            return -1;
        }
        if((currentHealth - healthDraw + dayOfRest)<1){
            return currentHealth = 1;
        }
        if((currentHealth - healthDraw + dayOfRest)>100){
            return currentHealth = 100;
        }
        
        currentHealth = currentHealth - healthDraw + dayOfRest;
        
        return currentHealth;
            
        //If (CurrentHealth – DailyHealthDraw + DayOfRest) < 1, return CurrentHealth = 1 and give signal that party must rest;
        //If (CurrentHealth – DailyHealthDraw + DayOfRest) > 100, return CurrentHealth = 100;
        //If parameters are invalid, return -1;
        //If parameters are valid, calculate CurrentHealth – DailyHealthDraw + DayOfRest, and return;

        //Reset DailyHealthDraw and DayOfRest to 0;

        
        //CurrentHealth – 1-100 
        //DailyHealthDraw – 1-50
        //DayOfRest – 2-8
        //DailyHealthDraw must be >0 OR DayOfRest must be >0
    }
   
    public static double teamPace(String pace){
       double teamPace = 0;
        
       if(pace == "Slow"){
           teamPace = 1;
       }
       if(pace == "Average"){
           teamPace = 1.5;
       }
       if(pace == "Fast"){
           teamPace = 2;
       }
       System.out.println("Your team pace is " + teamPace);
       return teamPace;
       
    }     
}
