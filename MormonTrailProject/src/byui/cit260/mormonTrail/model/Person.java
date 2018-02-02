/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;

/**
 *
 * @author alyssahundley
 */
public class Person implements Serializable {
    
    //class instance varables
    private int health;
    private double startingMoney;
    private int huntingSkill;
    private int gatherhingSkill;
    private int stamina;
    private boolean available;
    
    
    public Person() {
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(double startingMoney) {
        this.startingMoney = startingMoney;
    }

    public int getHuntingSkill() {
        return huntingSkill;
    }

    public void setHuntingSkill(int huntingSkill) {
        this.huntingSkill = huntingSkill;
    }

    public int getGatherhingSkill() {
        return gatherhingSkill;
    }

    public void setGatherhingSkill(int gatherhingSkill) {
        this.gatherhingSkill = gatherhingSkill;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.health;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.startingMoney) ^ (Double.doubleToLongBits(this.startingMoney) >>> 32));
        hash = 53 * hash + this.huntingSkill;
        hash = 53 * hash + this.gatherhingSkill;
        hash = 53 * hash + this.stamina;
        hash = 53 * hash + (this.available ? 1 : 0);
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
        final Person other = (Person) obj;
        if (this.health != other.health) {
            return false;
        }
        if (Double.doubleToLongBits(this.startingMoney) != Double.doubleToLongBits(other.startingMoney)) {
            return false;
        }
        if (this.huntingSkill != other.huntingSkill) {
            return false;
        }
        if (this.gatherhingSkill != other.gatherhingSkill) {
            return false;
        }
        if (this.stamina != other.stamina) {
            return false;
        }
        if (this.available != other.available) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "health=" + health + ", startingMoney=" + startingMoney + ", huntingSkill=" + huntingSkill + ", gatherhingSkill=" + gatherhingSkill + ", stamina=" + stamina + ", available=" + available + '}';
    }
    
//this is a test to see if commit will work .... ::::
  


    
    
}
