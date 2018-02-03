/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Christopher
 */
public class Livestock extends Item implements Serializable{
    
    //Variables
    private Integer health;
  
    
    //Constructor
    public Livestock() {
    }

    
    //getters and setters

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
    
    
    
    //
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.health);
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
        final Livestock other = (Livestock) obj;
        if (!Objects.equals(this.health, other.health)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livestock{" + "health=" + health + '}';
    }


    
    
}
