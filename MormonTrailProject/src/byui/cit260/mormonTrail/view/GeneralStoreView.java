package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Christopher Sellers
 */
public class GeneralStoreView extends View {

    private BuyMenuView buyMenuView;
    private SellMenuView sellMenuView;
    private PrintItemView printItemView;
    
    public GeneralStoreView() {
        super("----Welcome to the General Store!----"
         + "\nBuy\\sell all the supplies you could need on your journey!"
         + "\nPlease select an option"
         + "\n\nB - Buy"
         + "\nS - Sell"
         + "\nP - Print list of items"
         + "\nQ - Return to previous menu");
    }
      
        
    @Override
    public boolean doAction(String inputs) {
        
        String menuItem = inputs;
        
        switch (menuItem) {
            case "B": buyMenuView = new BuyMenuView();
                      buyMenuView.display();
                break;
            case "S": sellMenuView = new SellMenuView();
                      sellMenuView.display();
                break;
            case "P": printItemView = new PrintItemView();
                      printItemView.display();
                break;
            case "Q": return true;
            default: ErrorView.display(this.getClass().getName(),"\nInvalid menu item\n\n");
            
        }
     return false;
        
    }
    
    
}
