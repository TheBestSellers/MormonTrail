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
import byui.cit260.mormonTrail.model.Scene;
import byui.cit260.mormonTrail.model.SceneType;

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
        Scene[] scenes = createScenes();
//        questions = createQuestions()
//        assignQuestionsToScenes()
//        assignItemsToScenes()
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public static Location[] createLocations(){
        Location[] locations = new Location[11];
        Location GardenGrove = new Location("GardenGrove", SceneType.TownScene.ordinal(), 15);
        locations[LocationType.GardenGrove.ordinal()] = GardenGrove;
        Location MountPisgah = new Location("MountPisgah", SceneType.TownScene.ordinal(), 30);
        locations[LocationType.MountPisgah.ordinal()] = MountPisgah;
        Location Kanesville = new Location("Kanesville", SceneType.TownScene.ordinal(), 45);
        locations[LocationType.Kanesville.ordinal()] = Kanesville;
        Location WinterQuarters = new Location("WinterQuarters", SceneType.TownScene.ordinal(), 60);
        locations[LocationType.WinterQuarters.ordinal()] = WinterQuarters;
        Location FortKearny = new Location("FortKearny", SceneType.FortScene.ordinal(), 100);
        locations[LocationType.FortKearny.ordinal()] = FortKearny;
        Location ChimneyRock = new Location("ChimneyRock", SceneType.DailyStopScene.ordinal(), 115);
        locations[LocationType.ChimneyRock.ordinal()] = ChimneyRock;
        Location FortLaramie = new Location("FortLaramie", SceneType.FortScene.ordinal(), 130);
        locations[LocationType.FortLaramie.ordinal()] = FortLaramie;
        Location IndependenceRock = new Location("IndependenceRock", SceneType.DailyStopScene.ordinal(), 200);
        locations[LocationType.IndependenceRock.ordinal()] = IndependenceRock;
        Location MartinsCove = new Location("MartinsCove", SceneType.DailyStopScene.ordinal(), 215);
        locations[LocationType.MartinsCove.ordinal()] = MartinsCove;
        Location FortBridger = new Location("FortBridger", SceneType.FortScene.ordinal(), 230);
        locations[LocationType.FortBridger.ordinal()] = FortBridger;
        Location SaltLake = new Location("SaltLake", SceneType.TownScene.ordinal(), 275);
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
    
    public static Scene[] createScenes(){
        Scene[] scenes = new Scene[4];
  
        Scene DailyStopScene = new Scene("DailyStopScene");
        scenes[SceneType.DailyStopScene.ordinal()] = DailyStopScene;
        Scene FortScene = new Scene("FortScene");
        scenes[SceneType.FortScene.ordinal()] = FortScene;
        Scene TownScene = new Scene("TownScene");
        scenes[SceneType.TownScene.ordinal()] = TownScene;
        Scene RiverScene = new Scene("RiverScene");
        scenes[SceneType.RiverScene.ordinal()] = RiverScene;
       
        return scenes;
    }
    
    
//    private static void assignItemsToScene(Item[] items, Scene[] scenes){
//        System.out.println("called assignItemsToScene");
//    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[] locations = map.getLocations();
        
        locations[0].setType(SceneType.DailyStopScene.ordinal());
        locations[0].setType(SceneType.FortScene.ordinal());
        locations[0].setType(SceneType.TownScene.ordinal());
        locations[0].setType(SceneType.RiverScene.ordinal());
 
    }
}
