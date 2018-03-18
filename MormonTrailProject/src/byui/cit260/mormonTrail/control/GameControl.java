/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;
import byui.cit260.mormonTrail.model.Game;
import byui.cit260.mormonTrail.model.Item;
import byui.cit260.mormonTrail.model.Map;
import byui.cit260.mormonTrail.model.Person;
import byui.cit260.mormonTrail.model.PersonType;
import byui.cit260.mormonTrail.model.Player;
import byui.cit260.mormonTrail.control.MapControl;
import byui.cit260.mormonTrail.model.ItemType;


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
//    if(player == null){
//       return -1;
//    }
    Game game = new Game();
    game.setPlayer(player);
    createPersons();
    createItems();
    MapControl.createMap(0);

        return 1; 
    }
    
    public static Person[] createPersons(){
  
        Person[] persons = new Person[10];
        Person Benjamin = new Person("Benjamin", 50, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Benjamin.ordinal()] = Benjamin;
        Person Peter = new Person("Peter", 90, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Peter.ordinal()] = Peter;
        Person Sarah = new Person("Sarah", 75, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Sarah.ordinal()] = Sarah;
        Person Daniel = new Person("Daniel", 25, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Daniel.ordinal()] = Daniel;
        Person Alexander = new Person("Alexander", 88, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Alexander.ordinal()] = Alexander;
        Person Mary = new Person("Mary", 90, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Mary.ordinal()] = Mary;
        Person Beth = new Person("Beth", 85, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Beth.ordinal()] = Beth;
        Person Joseph = new Person("Joseph", 95, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Joseph.ordinal()] = Joseph;
        Person Harriett = new Person("Harriett", 100, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.Harriett.ordinal()] = Harriett;
        Person George = new Person("George", 65, 100, 3, 3, 5, 5, 5, true);
        persons[PersonType.George.ordinal()] = George;
        
        return persons; 
    }
    
    public static Item[] createItems(){
        Item[] items = new Item[8];
        
        Item Money = new Item("Money", 1, 0, 0);
        items[ItemType.Money.ordinal()] = Money;
        Item Ammo = new Item("Ammo", 1, 1, 0);
        items[ItemType.Ammo.ordinal()] = Ammo;
        Item LargeWagon = new Item("LargeWagon", 100, 100, 0);
        items[ItemType.LargeWagon.ordinal()] = LargeWagon;
        Item MediumWagon = new Item("MediumWagon", 75, 75, 0);
        items[ItemType.MediumWagon.ordinal()] = MediumWagon;
        Item SmallWagon = new Item("SmallWagon", 25, 25, 0);
        items[ItemType.SmallWagon.ordinal()] = SmallWagon;
        Item Protein = new Item("Protein", 1, 2, 0);
        items[ItemType.Protein.ordinal()] = Protein;
        Item Veggie = new Item("Veggie", 1, 1, 0);
        items[ItemType.Veggie.ordinal()] = Veggie;
        Item SpareWheel = new Item("SpareWheel", 5, 2, 0);
        items[ItemType.SpareWheel.ordinal()] = SpareWheel;
        
        return items;
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