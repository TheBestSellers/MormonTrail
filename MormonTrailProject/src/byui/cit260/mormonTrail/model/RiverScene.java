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
public class RiverScene implements Serializable {
    
    //class instance variables
    private int locationDistance;
    private int depth;

    public RiverScene() {
    }
    
    public int getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(int locationDistance) {
        this.locationDistance = locationDistance;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.locationDistance;
        hash = 17 * hash + this.depth;
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
        final RiverScene other = (RiverScene) obj;
        if (this.locationDistance != other.locationDistance) {
            return false;
        }
        if (this.depth != other.depth) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "locationDistance=" + locationDistance + ", depth=" + depth + '}';
    }
    
}
