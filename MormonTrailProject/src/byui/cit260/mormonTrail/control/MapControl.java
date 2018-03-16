/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.control;

import byui.cit260.mormonTrail.model.Item;
import byui.cit260.mormonTrail.model.Map;

/**
 *
 * @author alyssahundley
 */
public class MapControl {
     
    public static Map createMap(int miles, Item[] items){
        if (miles < 0) {return null;};
        if (items == null || items.length < 0) { return null;}
        
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
    
    private static Location[] createLocations(int miles){
        if (miles < 0) {return null;};
        //if (items == null || items.length < 0) { return null;}
        
        
        return location;
        
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
