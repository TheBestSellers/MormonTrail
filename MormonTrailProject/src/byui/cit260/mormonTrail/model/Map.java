/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import byui.cit260.mormonTrail.control.MapControl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author alyssahundley
 */
public class Map implements Serializable{
    
    private Location currentLocation;
    private int currentMileMarker;
    public Location[] locations = MapControl.createLocations();

    public Map() {
        
    }
    public Location[] getLocations(){
        return locations;
    }

    public int getCurrentMileMarker() {
        return currentMileMarker;
    }

    public void setCurrentMileMarker(int currentMileMarker) {
        this.currentMileMarker = currentMileMarker;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
    
    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.currentLocation);
        hash = 73 * hash + this.currentMileMarker;
        hash = 73 * hash + Arrays.deepHashCode(this.locations);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.currentLocation != other.currentLocation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "currentLocation=" + currentLocation + '}';
    }
    
    
}
