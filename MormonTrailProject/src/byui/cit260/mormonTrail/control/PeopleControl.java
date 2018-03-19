/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;

import byui.cit260.mormonTrail.model.Person;

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
    
    public static double calculateAverageHealth(Person[] people) {
        // valid people array is not null
        if (people == null) {return -1;}

        double averageHealth = 0;
        double totalHealth = 0;
        
        // loop through array, adding each health value to totalHealth
        try {
            for (Person person : people) {
                totalHealth += person.getHealth();
                if (person.getHealth() < 1 || person.getHealth() > 100 
                        || person.getName() == null ) {
                    return -1;
                }
            }

            // divide totalHealth by number of people
            averageHealth = totalHealth / (double)people.length;
        }
        
        // return -1 if failure and averageHealth if successful
        catch (Exception e) {
            return -1;
        }
        
        System.out.println("\nThe average health of the people is: " 
                + averageHealth);
        
        return averageHealth;
    }
}