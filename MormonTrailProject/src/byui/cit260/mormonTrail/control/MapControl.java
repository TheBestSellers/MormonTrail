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
}
