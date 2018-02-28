/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author saria
 */
public class HotelScene extends Scene implements Serializable {
    
    //class instance variables
    private String[] availableCharacters;
    private int locationDistance;
    private int iCount;
    
    
    public HotelScene() {
    }
    int[] inputs = new int[1];
    
    public void displayHotelSceneView() {
        boolean endView = false;
     
    }
    
    private int[] getInputs() {
        
                //create scanner to receive user input
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        boolean valid = false;
        
        System.out.println("Help Menu" + 
                "\nPlease select a person to add to your team");
        
        for(iCount = 0; iCount < availableCharacters.length; iCount++){
            
            System.out.println("\n" + (iCount+1) + " - " + availableCharacters[iCount]);
        }    
        
        System.out.println("\n" + iCount + "- Quit");
        
        while(!valid) {
            //prompt user for input
            System.out.println("Select a menu option.");
            
            //get the input user entered, trim it
            inputs[0] = Integer.parseInt(inFile.nextLine());
 
            //Validate that the user entered a value
            if(inputs[0] < 1) {
                System.out.println("You must enter a value.");
                continue;
            }
            valid = true;
            
        }
        return inputs;
    }

    private boolean doAction(int[] inputs) {
        
     int menuItem = inputs[0];
     for(iCount = 0; iCount < availableCharacters.length; iCount++){
         
        if(iCount == menuItem){
            
            System.out.println("\nYou have selected\"\n" + availableCharacters[iCount] + "\n");

            break;
        }
            
     }
     
     if (iCount == menuItem){
         
         return true;
     }
         return false;

}



    public String[] getAvailableCharacters() {
        return availableCharacters;
    }

    public void setAvailableCharacters(String[] availableCharacters) {
        this.availableCharacters = availableCharacters;
    }

    public int getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(int locationDistance) {
        this.locationDistance = locationDistance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        /* hash = 41 * hash + this.availableCharacters;*/
        hash = 41 * hash + this.locationDistance;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HotelScene other = (HotelScene) obj;
        if (this.availableCharacters != other.availableCharacters) {
            return false;
        }
        if (this.locationDistance != other.locationDistance) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "availableCharacters=" + availableCharacters + ", locationDistance=" + locationDistance + '}';
    }
   
    
    
}
