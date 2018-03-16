/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;

import byui.cit260.mormonTrail.model.Item;
import byui.cit260.mormonTrail.model.Location;
import byui.cit260.mormonTrail.model.LocationType;
import byui.cit260.mormonTrail.model.Map;

/**
 *
 * @author alyssahundley, Christopher, Sariah
 */
public class MapControl {
     
    public static Map createMap(int miles){
        if (miles < 0) {return null;};
       // if (items == null || items.length < 0) { return null;}
        
        Map map = new Map();
        
//        save the noOfRows in the map
//        save the noOfColumns in the map
//        locations = createLocations(noOfRows, noOfColumns)
//        Assign the locations array to the map
//        scenes = createScenes()
//        questions = createQuestions()
//        assignQuestionsToScenes()
//        assignItemsToScenes()
//        assignScenesToLocations() 
        
        return map;
    }
    
    public static Location[] createLocations(){
        Location[] locations = new Location[11];
        Location GardenGrove = new Location("GardenGrove", "Town", 15);
        locations[LocationType.GardenGrove.ordinal()] = GardenGrove;
        Location MountPisgah = new Location("MountPisgah", "Town", 30);
        locations[LocationType.MountPisgah.ordinal()] = MountPisgah;
        Location Kanesville = new Location("Kanesville", "Town", 45);
        locations[LocationType.Kanesville.ordinal()] = Kanesville;
        Location WinterQuarters = new Location("WinterQuarters", "Town", 60);
        locations[LocationType.WinterQuarters.ordinal()] = WinterQuarters;
        Location FortKearny = new Location("FortKearny", "Fort", 100);
        locations[LocationType.FortKearny.ordinal()] = FortKearny;
        Location ChimneyRock = new Location("ChimneyRock", "Landmark", 115);
        locations[LocationType.ChimneyRock.ordinal()] = ChimneyRock;
        Location FortLaramie = new Location("FortLaramie", "Fort", 130);
        locations[LocationType.FortLaramie.ordinal()] = FortLaramie;
        Location IndependenceRock = new Location("IndependenceRock", "Landmark", 200);
        locations[LocationType.IndependenceRock.ordinal()] = IndependenceRock;
        Location MartinsCove = new Location("MartinsCove", "Landmark", 215);
        locations[LocationType.MartinsCove.ordinal()] = MartinsCove;
        Location FortBridger = new Location("FortBridger", "Fort", 230);
        locations[LocationType.FortBridger.ordinal()] = FortBridger;
        Location SaltLake = new Location("SaltLake", "Town", 275);
        locations[LocationType.SaltLake.ordinal()] = SaltLake;
        
        return locations;
        
//        
//        locations = new two-dimensional Location array
//        FOR every row in the locations array
//        FOR every column in the locations array
//        location = create a new Location object
//        set the row, and column attributes in the location
//        set visited attribute to false
//        Assign location to the row, and column in array
//        ENDFOR
//        RETURN locations 
    }
    
    private static Scene[] createScenes(){
        System.out.println("called createScenes");
        return scene;
    }
    
    
    private static void assignItemsToScene(Item[] items, Scene[] scenes){
        System.out.println("called assignItemsToScene");
    }
    
    private static void assignScenesToLocations(Scene[] scenes, Location[] locations){
        System.out.println("called assignScenesToLocations");
    }
}
