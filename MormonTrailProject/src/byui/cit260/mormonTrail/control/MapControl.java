/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;

import byui.cit260.mormonTrail.exceptions.MapControlException;
import byui.cit260.mormonTrail.model.Game;
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
     
    public static Map createMap(int miles)throws MapControlException{
        if (miles < 0) {
            throw new MapControlException("Problem creating map. Miles cannot"
                    + " be less than 0.");
        };

        Map map = new Map();
        MormonTrailProject.setMap(map);

        return map;
    }
    
    public static Location moveTeam (int milesTraveled) 
            throws MapControlException {
        
        if (milesTraveled == 0) {
            throw new MapControlException("miles traveled cannot equal 0");
        }
        Game game = MormonTrailProject.getCurrentGame();
        Map map = MormonTrailProject.getMap();
        Location[] locations = MormonTrailProject.getMap().locations;
        
        //get current miles
        int currentMileMarker = MormonTrailProject.getMap().getCurrentMileMarker();
        
        //divide miles by ten to find the corresponding location
        int newLocationIndex = Math.round(currentMileMarker / 10);
        Location newLocation = locations[newLocationIndex];
        
        return newLocation;
    }    
    
    public static Location[] createLocations(){
        Location[] locations = new Location[25];
        Location GardenGrove = new Location("GardenGrove", SceneType.TownScene.ordinal(), 15, 'T', null);
        locations[LocationType.GardenGrove.ordinal()] = GardenGrove;
        Location OpenMeadow = new Location("OpenMeadow", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.OpenMeadow.ordinal()] = OpenMeadow;
        Location DenseWoods = new Location("DenseWoods", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.DenseWoods.ordinal()] = DenseWoods;
        Location MapleValley = new Location("MapleValley", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.MapleValley.ordinal()] = MapleValley;
        Location MountPisgah = new Location("MountPisgah", SceneType.TownScene.ordinal(), 30, 'T', null);
        locations[LocationType.MountPisgah.ordinal()] = MountPisgah;
        Location GrassyKnoll = new Location("GrassyKnoll", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.GrassyKnoll.ordinal()] = GrassyKnoll;
        Location MinerPark = new Location("MinerPark", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.MinerPark.ordinal()] = MinerPark;
        Location Kanesville = new Location("Kanesville", SceneType.TownScene.ordinal(), 45, 'T', null);
        locations[LocationType.Kanesville.ordinal()] = Kanesville;
        Location AlcoveSpring = new Location("AlcoveSpring", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.AlcoveSpring.ordinal()] = AlcoveSpring;
        Location CourthouseRock = new Location("CourthouseRock", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.CourthouseRock.ordinal()] = CourthouseRock;
        Location WinterQuarters = new Location("WinterQuarters", SceneType.TownScene.ordinal(), 60, 'T', null);
        locations[LocationType.WinterQuarters.ordinal()] = WinterQuarters;
        Location JailRock = new Location("JailRock", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.JailRock.ordinal()] = JailRock;
        Location SodaSprings = new Location("SodaSprings", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.SodaSprings.ordinal()] = SodaSprings;
        Location FortKearny = new Location("FortKearny", SceneType.FortScene.ordinal(), 100, 'F', null);
        locations[LocationType.FortKearny.ordinal()] = FortKearny;
        Location ChimneyRock = new Location("ChimneyRock", SceneType.DailyStopScene.ordinal(), 115, '^', null);
        locations[LocationType.ChimneyRock.ordinal()] = ChimneyRock;
        Location CoolBrook = new Location("CoolBrook", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.CoolBrook.ordinal()] = CoolBrook;
        Location IndependenceRock = new Location("IndependenceRock", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.IndependenceRock.ordinal()] = IndependenceRock;
        Location FortLaramie = new Location("FortLaramie", SceneType.FortScene.ordinal(), 130, 'F', null);
        locations[LocationType.FortLaramie.ordinal()] = FortLaramie;
        Location OpenField = new Location("OpenField", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.OpenField.ordinal()] = OpenField;
        Location ThickUnderbrush = new Location("ThickUnderbrush", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.ThickUnderbrush.ordinal()] = ThickUnderbrush;
        Location GreenMeadow = new Location("GreenMeadow", SceneType.DailyStopScene.ordinal(), 15, '^', null);
        locations[LocationType.GreenMeadow.ordinal()] = GreenMeadow;
        Location MartinsCove = new Location("MartinsCove", SceneType.DailyStopScene.ordinal(), 215, '^', null);
        locations[LocationType.MartinsCove.ordinal()] = MartinsCove;
        Location FortBridger = new Location("FortBridger", SceneType.FortScene.ordinal(), 230, 'F', null);
        locations[LocationType.FortBridger.ordinal()] = FortBridger;
        Location PeacefulLake = new Location("PeacefulLake", SceneType.FortScene.ordinal(), 230, 'F', null);
        locations[LocationType.PeacefulLake.ordinal()] = PeacefulLake;
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
}
