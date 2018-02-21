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
    
    private displayStartProgramView() {
        endOfView = false;
        
        do {
            string [] inputs = this.getInputs();
            
            if (inputs[0] == null || inputs[0].equals("Q")) {
            return;
        }
                    
        } while (endOfView != true);
        
      
        
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