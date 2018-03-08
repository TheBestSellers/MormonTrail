/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;


import byui.cit260.mormonTrail.control.EventControl;
import java.util.Scanner;

/**
 *
 * @author Sariah
 */
public class dropRiverSuppliesView extends View{

    private dropRiverQuantityView dropRiverQuantityView;

     
  public dropRiverSuppliesView(){
        super("Current Wagon Supplies"
              + "\nPlease select an item you would like to drop"
              + "\nF - Food"
              + "\nT - Tools"
              + "\nO - Other Items"
              + "\nE - Exit & Return\n");
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        
           String menuItem = inputs[0];
           
           dropRiverQuantityView = new dropRiverQuantityView();
           
           switch (menuItem) {
               case "F": dropRiverQuantityView.display("Food");
                    break;
               case "T": dropRiverQuantityView.display("Tools");
                    break;
               case "O": dropRiverQuantityView.display("Other");
                    break;
               case "E": return true;
               default: System.out.println("\nInvalid menu item\n");
        }
     return false;
        
        
    }

    
    
    
}