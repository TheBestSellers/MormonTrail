/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrailproject;

import byui.cit260.mormonTrail.model.Person;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alyssahundley
 */
public class MormonTrailProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person personOne = new Person();
       
       personOne.setHealth(4);
       personOne.setGatherhingSkill(1);
       personOne.setStartingMoney(10.00);
       personOne.setHuntingSkill(2);
       personOne.setStamina(3);
       personOne.setAvailable(true);
       
        System.out.println(personOne.toString());
   
    }
    
}

//this is a test to see if the commit will work 
