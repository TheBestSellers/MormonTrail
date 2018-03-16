/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;
import byui.cit260.mormonTrail.model.Game;
import byui.cit260.mormonTrail.model.Inventory;
import byui.cit260.mormonTrail.model.Map;
import byui.cit260.mormonTrail.model.Person;
import byui.cit260.mormonTrail.model.Player;

/**
 *
 * @author alyssahundley, Sariah
 */
 public class GameControl {
    
    public static Player savePlayer (String name){
        
        if (name == null || name.length() <1){
            return null;
        }

        System.out.println("***savePlayer() called");
        Player player = new Player();
        player.setName(name);
        return player;
    }
    
    public static int createNewGame(Player player) {
        
        Game.setPlayer(player);
        if(player == null){
           return -1;
       }
       
       //game = create a new Game object
       //Save a reference to the Player object in the game
       //Save a reference to the game in the main class
       
       //actors = createActors()
       //Save the list of actors in the Game object
       //Assign an actor to the player
       //items = createItems()
       //Save the list of items in the game

       //Assign the map to the game
       
        return 1; 
    }
    
    public static Person[] createPersons(){
  
        Person[] persons = new Person[10];
        
        public Person(String name, double health, double startingMoney, int huntingSkill, int gatheringSkill, int stamina, int dailyProteinDraw, int dailyVeggieDraw, boolean available){
            this.name = name;
            this.health = health;
            this.startingMoney = startingMoney;
            this.huntingSkill = huntingSkill;
            this.gatheringSkill = gatheringSkill;
            this.stamina = stamina;
            this.dailyProteinDraw = dailyProteinDraw;
            this.dailyVeggieDraw = dailyVeggieDraw;
            this.available = available; 
           
            Person Benjamin = new Person("Bemjamin", 50, 100, 3, 3, 5, 5, 5, true);
        }
        
        
        
        
        
       
//        actors = create an array Actor objects
//        actor1 = new Actor object
//        Assign values to each attribute in the Actor object
//        Assign actor1 to the next position in the actors array
//        actor2 = new Actor object
//        Assign values to each attribute in the Actor object
//        Assign actor2 to the next position in the actors array

        return items; 
    }
    
    public static Inventory[] createItems(){
        System.out.println("createItems has been called");
        return null;
    }

    public static boolean restoreGame(String fileName) {
        System.out.println("****restoreGame() called, file name: " +fileName);
        return true;
    }
    
    public static boolean saveGame(String fileName) {
        System.out.println("****saveGame() called, file name: " +fileName);
        return true;
    }
}


//savePlayer(name): Player
//BEGIN
// if name is null OR length of name is < 1 THEN
// RETURN null
// ENDIF
// player = new Player object
// save the name in the player object
// save the player in the main class of the project
// RETURN player
//END