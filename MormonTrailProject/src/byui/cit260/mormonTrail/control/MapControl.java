/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;

import byui.cit260.mormonTrail.model.Location;
import byui.cit260.mormonTrail.model.LocationType;
import byui.cit260.mormonTrail.model.Map;
import byui.cit260.mormonTrail.model.Scene;
import byui.cit260.mormonTrail.model.SceneType;
import mormontrailproject.MormonTrailProject;

/**
 *
 * @author alyssahundley, Christopher, Sariah
 */
public class MapControl {
     
    public static Map createMap(int miles){
        if (miles < 0) {return null;};
        // if (items == null || items.length < 0) { return null;}

        Scene[] scenes = createScenes();
        Map map = new Map();
        MormonTrailProject.setMap(map);

        return map;
    }
    
    public static Location[] createLocations(){
        Location[] locations = new Location[11];
        Location GardenGrove = new Location("GardenGrove", SceneType.TownScene.ordinal(), 15, 'T', null);
        locations[LocationType.GardenGrove.ordinal()] = GardenGrove;
        Location MountPisgah = new Location("MountPisgah", SceneType.TownScene.ordinal(), 30, 'T', null);
        locations[LocationType.MountPisgah.ordinal()] = MountPisgah;
        Location Kanesville = new Location("Kanesville", SceneType.TownScene.ordinal(), 45, 'T', null);
        locations[LocationType.Kanesville.ordinal()] = Kanesville;
        Location WinterQuarters = new Location("WinterQuarters", SceneType.TownScene.ordinal(), 60, 'T', null);
        locations[LocationType.WinterQuarters.ordinal()] = WinterQuarters;
        Location FortKearny = new Location("FortKearny", SceneType.FortScene.ordinal(), 100, 'F', null);
        locations[LocationType.FortKearny.ordinal()] = FortKearny;
        Location ChimneyRock = new Location("ChimneyRock", SceneType.DailyStopScene.ordinal(), 115, '^', null);
        locations[LocationType.ChimneyRock.ordinal()] = ChimneyRock;
        Location FortLaramie = new Location("FortLaramie", SceneType.FortScene.ordinal(), 130, 'F', null);
        locations[LocationType.FortLaramie.ordinal()] = FortLaramie;
        Location IndependenceRock = new Location("IndependenceRock", SceneType.DailyStopScene.ordinal(), 200, '^', null);
        locations[LocationType.IndependenceRock.ordinal()] = IndependenceRock;
        Location MartinsCove = new Location("MartinsCove", SceneType.DailyStopScene.ordinal(), 215, '^', null);
        locations[LocationType.MartinsCove.ordinal()] = MartinsCove;
        Location FortBridger = new Location("FortBridger", SceneType.FortScene.ordinal(), 230, 'F', null);
        locations[LocationType.FortBridger.ordinal()] = FortBridger;
        Location SaltLake = new Location("SaltLake", SceneType.TownScene.ordinal(), 275, 'T', null);
        locations[LocationType.SaltLake.ordinal()] = SaltLake;
        
        return locations;
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
    
//    public static void assignScenesToLocations(Map map, Scene[] scenes){
//        Location[] locations = map.getLocations();
//        
//        locations[0].setType(SceneType.DailyStopScene.ordinal());
//        locations[1].setType(SceneType.FortScene.ordinal());
//        locations[2].setType(SceneType.TownScene.ordinal());
//        locations[3].setType(SceneType.RiverScene.ordinal());
// 
//    }
    
}
