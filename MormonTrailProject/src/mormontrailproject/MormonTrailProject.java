/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrailproject;

import byui.cit260.mormonTrail.model.Event;
import byui.cit260.mormonTrail.model.Item;
import byui.cit260.mormonTrail.model.Livestock;
import byui.cit260.mormonTrail.model.Person;
import byui.cit260.mormonTrail.model.Wagon;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alyssahundley, Christopher, Sariah
 */
public class MormonTrailProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Wagon testWagon = new Wagon();
       Event testEvent = new Event();
       Item testItem = new Item();
       Livestock testOx = new Livestock();
       
       testEvent.setDescription("You've probably died of dysentary or something.");
       testEvent.setImpact(5);
       
       testWagon.setName("Test Wagon");
       testWagon.setCost(50);
       testWagon.setWeight(1800);
       testWagon.setCapacity(150);
       
       testItem.setName("Test Item");
       testItem.setCost(4);
       testItem.setWeight(5);
       
       testOx.setName("Test Ox");
       testOx.setCost(25);
       testOx.setWeight(100);
       testOx.setHealth(98);
       
       System.out.println(testEvent.toString());
       System.out.println(testItem.toString());
       System.out.println(testWagon.toString() + " " + testWagon.getName() + " " + 
               testWagon.getWeight() + " " + testWagon.getCost() + " " + testWagon.getCapacity());
       System.out.println(testOx.toString() + " " + testOx.getName() + " " + 
               testOx.getWeight() + " " + testOx.getCost() + " " + testOx.getHealth());
      
       
   
    }
    
}

//this is a test to see if the commit will work ....:::
