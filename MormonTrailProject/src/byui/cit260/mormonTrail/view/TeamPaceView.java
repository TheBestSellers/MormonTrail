/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.view;


import byui.cit260.mormonTrail.control.PeopleControl;

/**
 *
 * @author alyssahundley
 */
public class TeamPaceView extends View{
    
    static public String pace;
    
    public TeamPaceView(){
              super("Welcome to the Team Pace Menu"
              + "\nPlease select a pace for today:"
              + "\nS - Slow"
              + "\nA - Average"
              + "\nF - Fast" 
              + "\nOr enter 'Q' to return to the previous menu");
    }
    
    @Override
    public boolean doAction(String inputs) {
    String menuItem = inputs;
       
        switch (menuItem) {
            case "S": pace = "Slow";
            PeopleControl.teamPace(pace);
                break;
            case "A": pace = "Average";
            PeopleControl.teamPace(pace);
                break;
            case "F": pace = "Fast";
            PeopleControl.teamPace(pace);
                break;
            case "Q": return true;
                
            default: ErrorView.display(this.getClass().getName(),"Invalid menu item");
        }
        return false;
        
    }
}
