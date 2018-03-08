/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;


import java.util.Scanner;

/**
 *
 * @author Sariah
 */
public class townSceneView extends View{

    private hotelSceneView hotelSceneView;
    private GeneralStoreView generalStoreView;

    
  public townSceneView(){
      super("Welcome to a Town"
                + "\nPlease select an option"
                + "\nH - Visit the Hotel"
                + "\nG - Visit the General Store"
                + "\nE - Exit & Return to Trail\n");
        
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       
        switch (menuItem) {
            case "H": hotelSceneView();
                break;
            case "G": generalStoreView();
                break;
            case "E": return true;
                
            default: System.out.println("Invalid menu item");
        }
        return false;
        
    }

    private void hotelSceneView() {
       hotelSceneView = new hotelSceneView();
       hotelSceneView.display();
    }

    private void generalStoreView() {
        generalStoreView = new GeneralStoreView();
        generalStoreView.display();
        
    }
    

    
    
    
}
