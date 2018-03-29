package byui.cit260.mormonTrail.view;
 
 import java.io.Serializable;
 import java.util.Scanner;
import mormontrailproject.MormonTrailProject;
 

 public class hotelSceneView extends View{
     

    private int locationDistance;
    private int iCount;
    
     
    public hotelSceneView() {
     }
     
    String inputs;
    
    
    
    public void display() {
        boolean endView = false;
        do {
            for(iCount = 0; iCount < MormonTrailProject.getParty().length; iCount++){
            
            this.console.println("\n" + (iCount+1) + " - " + MormonTrailProject.getParty()[iCount]);
        } 
            String inputs = this.getInputs();
            if (inputs ==null){
                return;
            }
            endView = doAction(inputs);
        } while(!endView);
    }
    
    public String getInputs(){
        boolean valid = false;
        String selection = null;
        try {
            //while a valid name has not been retrieved
            while (!valid) {
            //prompt user for input
            this.console.println("Please select a person to add to your team");
 
                //get the value entered from the keyboard
                selection = this.keyboard.readLine();
                selection = selection.trim().toUpperCase();
                
                if (selection.length() < 1) { //blank value entered
                    ErrorView.display(this.getClass().getName(),"You must enter a value.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        
        return selection;
                }


    public boolean doAction(String inputs) {
        
//     String menuItem = inputs;
//     for(int iCount = 0; iCount < availableCharacters.length; iCount++){
//         
//        if(iCount == menuItem){
//            
//            this.console.println("\nYou have selected\"\n" + availableCharacters[iCount] + "\n");          
//        }
//     
//     }   
//        if (iCount == menuItem){
//         
//         return true;
//     }
         return false;

    }
     
     
 }