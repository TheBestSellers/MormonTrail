/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.MapControl;
import byui.cit260.mormonTrail.exceptions.MapControlException;
import byui.cit260.mormonTrail.model.Location;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author sariah mudaliar
 */
public class PrintMapReport extends View {


    
    public PrintMapReport() {
        super("------Print Map Report------"
                + "\nType the file path you wish to save this game under,"
                + "\nOr enter 'Q' to quit back to the previous menu: ");
    }

    @Override
    public boolean doAction(String inputs) {
        
        String filePath = inputs.toLowerCase();
        Location[] location = MapControl.createLocations();
        
        try {
            MapControl.printReport(location, filePath);
        }
        catch (MapControlException mce) {
        ErrorView.display("Error Occured" , filePath);

            return false;
        }
                
        this.console.println("Report was successfully printed at: " + filePath);
        return true;
    }
    

    
}
