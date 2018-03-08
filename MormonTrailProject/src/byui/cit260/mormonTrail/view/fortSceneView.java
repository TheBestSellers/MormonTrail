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
public class fortSceneView extends View{


    private GeneralStoreView generalStoreView;

    
  public fortSceneView(){
        super("Welcome to a Fort"
              + "\nPlease select an option"
              + "\nG - Visit the General Store"
              + "\nE - Exit & Return to Trail\n");
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       
        switch (menuItem) {
            case "G": generalStoreView();
                break;
            case "E": return true;
                
            default: System.out.println("Invalid menu item");
        }
        return false;
        
    }

    private void generalStoreView() {
        generalStoreView = new GeneralStoreView();
        generalStoreView.display();
        
    }
    

    
    
    
}

