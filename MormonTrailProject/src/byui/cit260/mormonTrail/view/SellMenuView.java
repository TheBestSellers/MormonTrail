package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Christopher Sellers
 */
public class SellMenuView extends View{
    
    static public String item;
    private SellQuantityMenuView sellQuantityMenuView;

    public SellMenuView() {
        super("\n----Sell Items----"
              + "\nPlease select an item to sell"
              + "\n\nA - Ammo"
              + "\nL - Large Wagon"
              + "\nM - Medium Wagon"
              + "\nS - Small Wagon"
              + "\nP - Protein"
              + "\nV - Veggies"
              + "\nW - Spare Wheel"
              + "\nQ - Return to previous menu");
    }
        
        
    @Override
    public boolean doAction(String[] inputs) {
        
        String menuItem = inputs[0];
        
        sellQuantityMenuView = new SellQuantityMenuView();
        
        switch (menuItem) {
            case "A": item = "Ammo";
                break;
            case "L": item = "Large Wagon";
                break;
            case "M": item = "Medium Wagon";
                break;
            case "S": item = "Small Wagon";
                break;
            case "P": item = "Protein";
                break;
            case "V": item = "Veggie";
                break;
            case "W": item = "Spare Wagon Wheel";
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
        }
        sellQuantityMenuView.display();
        
     return false;
        
    }
    
}
