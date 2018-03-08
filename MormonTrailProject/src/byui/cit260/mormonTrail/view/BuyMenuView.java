package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Christopher Sellers
 */
public class BuyMenuView extends View{
    
    private BuyQuantityMenuView buyQuantityMenuView;

    public BuyMenuView() {
        super("\n----Buy Items----"
              + "\nPlease select an item to buy"
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
        
        buyQuantityMenuView = new BuyQuantityMenuView();
        
        switch (menuItem) {
            case "A": buyQuantityMenuView.display("Ammo");
                break;
            case "L": buyQuantityMenuView.display("Large Wagon");
                break;
            case "M": buyQuantityMenuView.display("Medium Wagon");
                break;
            case "S": buyQuantityMenuView.display("Small Wagon");
                break;
            case "P": buyQuantityMenuView.display("Protein");
                break;
            case "V": buyQuantityMenuView.display("Veggie");
                break;
            case "W": buyQuantityMenuView.display("Wagon Wheel");
                break;
            case "Q": return true;
            default: System.out.println("\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
    
}
