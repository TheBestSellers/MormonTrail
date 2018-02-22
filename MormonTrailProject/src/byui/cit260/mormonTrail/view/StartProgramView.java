/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;

/**
 *
 * @author saria
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
        System.out.println("Type your name: ");
        
        String[] inputs = new String[1];
        inputs[0] = "testInput";
        
        return inputs;
    }
    
    private boolean doAction(String[] inputs) {
        System.out.println("doAction Called");
        System.out.println("\n\tinputs = " + inputs[0]);
        
        return true;
    }
    
}

//displayStartProgramView() {
//endOfView = false
//DO
//inputs = getInputs ()
//IF no inputs were entered OR the first input is Q
//RETURN
//ENDIF
//endOfView = doAction (inputs)
//WHILE endOfView != true
// }