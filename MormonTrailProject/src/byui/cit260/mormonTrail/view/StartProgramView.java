package byui.cit260.mormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Saria, Christopher and Alyssa
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void display() {
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0] == null || inputs[0].equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);
        } while(!endOfView);
        
    }

    private String[] getInputs() {
        
        //create scanner to receive user input
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        boolean valid = false; 
        String[] inputs = new String[1];
        System.out.println("This is a description of the view."
                + "\nSomething about entering your name, maybe.");

        while(!valid) {
            //prompt for user input
            System.out.println("Type your name: ");
            
            //get the name entered by the user
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toLowerCase();
            
            if(inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            valid = true;
        }
        
        return inputs;
       
    }
    
    private boolean doAction(String[] inputs) {
        System.out.println("doAction Called");
        System.out.println("\n\tinputs = " + inputs[0]);
        
        return true;
    }
    
}