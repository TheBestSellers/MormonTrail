/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

import java.io.PrintWriter;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author alyssahundley
 */
public class ErrorView {
    private static PrintWriter console = MormonTrailProject.getOutFile();
    private static PrintWriter log = MormonTrailProject.getLogFile();
    
    
    public static void display(String className, String errorMessage){
        
        console.println("\n-----------ERROR------------------" 
                + "\n" + errorMessage 
                + "\n----------------------------------");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
}
