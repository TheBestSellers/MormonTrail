/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;
import byui.cit260.mormonTrail.exceptions.GameControlException;
import byui.cit260.mormonTrail.exceptions.MapControlException;
import byui.cit260.mormonTrail.model.Game;
import byui.cit260.mormonTrail.model.Item;
import byui.cit260.mormonTrail.model.Person;
import byui.cit260.mormonTrail.model.PersonType;
import byui.cit260.mormonTrail.model.Player;
import byui.cit260.mormonTrail.model.ItemType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author alyssahundley, Sariah
 */
 public class GameControl {
    
    public static Player savePlayer (String name)
        throws GameControlException {
        
        if (name == null || name.length() <1){
            throw new GameControlException("Could not create name, please try again");
        }

        System.out.println("***savePlayer() called");
        Player player = new Player();
        MormonTrailProject.setPlayer(player);
        MormonTrailProject.getPlayer().setName(name);
        return player;
    }
    
    public static void createNewGame(Player player) throws GameControlException,
            MapControlException {
        
        if(player == null){
            throw new GameControlException("Player is null, cannot create game");
        }
        Game game = new Game();
        MormonTrailProject.setCurrentGame(game);
        MormonTrailProject.getCurrentGame().setPlayer(player);
        Person[] people = createPersons();
        createItems();
        MapControl.createMap(1);
    }
    
    public static Person[] createPersons(){
  
        Person[] persons = new Person[10];
        Person Benjamin = new Person("Benjamin", 50, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Benjamin.ordinal()] = Benjamin;
        Person Peter = new Person("Peter", 90, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Peter.ordinal()] = Peter;
        Person Sarah = new Person("Sarah", 75, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Sarah.ordinal()] = Sarah;
        Person Daniel = new Person("Daniel", 25, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Daniel.ordinal()] = Daniel;
        Person Alexander = new Person("Alexander", 88, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Alexander.ordinal()] = Alexander;
        Person Mary = new Person("Mary", 90, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Mary.ordinal()] = Mary;
        Person Beth = new Person("Beth", 85, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Beth.ordinal()] = Beth;
        Person Joseph = new Person("Joseph", 95, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Joseph.ordinal()] = Joseph;
        Person Harriett = new Person("Harriett", 100, 100, 3, 3, 5, 5, 5, "Hotel");
        persons[PersonType.Harriett.ordinal()] = Harriett;
        Person George = new Person("George", 65, 100, 3, 3, 5, 5, 5, "Hotel");
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

    public static Game restoreGame(String filePath) throws GameControlException, ClassNotFoundException{
        if (filePath == null || filePath.length() < 1 ) {
            throw new GameControlException ("Something went wrong loading the"
                    + " game. filePath cannot be null or less than 1 in length.");
        }
        Game game = null;
        try (BufferedInputStream inputFileStream = 
                new BufferedInputStream(new FileInputStream(filePath));
            ObjectInputStream InputObjectStream =
                new ObjectInputStream(new FileInputStream(filePath))) {
            game = (Game)InputObjectStream.readObject();
        } catch (IOException ex) {
            throw new GameControlException ("Something went wrong loading the game: " + ex);
        }
        MormonTrailProject.setCurrentGame(game);
        MormonTrailProject.setPlayer(MormonTrailProject.getCurrentGame().getPlayer());
        
        System.out.println();
        
        return game;        
    }
    
    public static void saveGame(Game game, String filePath) throws GameControlException {
        if (game == null || filePath == null || filePath.length() < 1 ) {
            throw new GameControlException ("Something went wrong saving the game.");
        }
        
        try (BufferedOutputStream outputFileStream = 
                new BufferedOutputStream(new FileOutputStream(filePath));
            ObjectOutputStream objectStream =
                new ObjectOutputStream(new FileOutputStream(filePath))) {
            
            objectStream.writeObject(game);
            
        } catch (IOException ex) {
            System.out.println("I/O Error:" + ex.getMessage());
        }
        
    }
}