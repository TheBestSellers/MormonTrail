/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.GameControl;
import byui.cit260.mormonTrail.control.MapControl;
import byui.cit260.mormonTrail.exceptions.GameControlException;
import byui.cit260.mormonTrail.exceptions.MapControlException;
import byui.cit260.mormonTrail.model.Item;
import byui.cit260.mormonTrail.model.Location;

/**
 *
 * @author alyssahundley
 */
public class PrintItemView extends View{

    public PrintItemView() {
        super("------Print Item Report------"
                + "\nType the file path you wish to save this item report under,"
                + "\nOr enter 'Q' to quit back to the previous menu: ");      
    }
    @Override
    
    public boolean doAction(String inputs) {
        
        String filePath = inputs.toLowerCase();
        Item[] item = GameControl.createItems();
        
        try {
            GameControl.printItemsReport(item, filePath);
        }
        catch (GameControlException gce) {
        ErrorView.display("Error Occured" , filePath);

            return false;
        }
                
        this.console.println("Report was successfully printed at: " + filePath);
        return true;
    }
}
    
