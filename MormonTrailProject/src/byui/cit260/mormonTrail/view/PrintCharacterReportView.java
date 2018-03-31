/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import byui.cit260.mormonTrail.control.PeopleControl;
import byui.cit260.mormonTrail.exceptions.PeopleControlException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author Admin
 */
public class PrintCharacterReportView extends View {

    public PrintCharacterReportView() {
        super("----Save Character Report----"
                + "\nType the file path where you wish to save the character report,"
                + "\nOr enter 'Q' to quit back to the previous menu:");
    }

    @Override
    public boolean doAction(String inputs) {
        String filePath = inputs.toLowerCase();

        try {
            PeopleControl.printCharacterReport(MormonTrailProject.getParty(), filePath);
        } catch (PeopleControlException | IOException pce) {
            ErrorView.display(this.getClass().getName(), "Error: " + pce);
            return false;
        } 

        this.console.println("Report was successfully printed to: " + filePath);
        return true;
    }

}
