/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;

/**
 *
 * @author saria
 */
public class GeneralStoreScene extends Scene implements Serializable{
    
    //class instance variables
    private int availableItems;
    private int locationDistance;

    public GeneralStoreScene() {
    }

    public int getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(int availableItems) {
        this.availableItems = availableItems;
    }

    public int getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(int locationDistance) {
        this.locationDistance = locationDistance;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.availableItems;
        hash = 41 * hash + this.locationDistance;
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
        final GeneralStoreScene other = (GeneralStoreScene) obj;
        if (this.availableItems != other.availableItems) {
            return false;
        }
        if (this.locationDistance != other.locationDistance) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GeneralStoreScene{" + "availableItems=" + availableItems + ", locationDistance=" + locationDistance + '}';
    }

    
}
