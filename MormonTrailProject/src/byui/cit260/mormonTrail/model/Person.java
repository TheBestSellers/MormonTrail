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
    public String name;
    private int health;
    private int startingMoney;
    private int huntingSkill;
    private int gatheringSkill;
    private int stamina;
    private boolean available;
    private int dailyProteinDraw;
    private int dailyVeggieDraw;

    public Person(String name, int health, int startingMoney, int huntingSkill, int gatheringSkill, int stamina, int dailyProteinDraw, int dailyVeggieDraw, boolean available){
        this.name = name;
        this.health = health;
        this.startingMoney = startingMoney;
        this.huntingSkill = huntingSkill;
        this.gatheringSkill = gatheringSkill;
        this.stamina = stamina;
        this.dailyProteinDraw = dailyProteinDraw;
        this.dailyVeggieDraw = dailyVeggieDraw;
        this.available = available; 

    }
    
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

    public int getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(int startingMoney) {
        this.startingMoney = startingMoney;
    }

    public int getHuntingSkill() {
        return huntingSkill;
    }

    public void setHuntingSkill(int huntingSkill) {
        this.huntingSkill = huntingSkill;
    }

    public int getGatherhingSkill() {
        return gatheringSkill;
    }

    public void setGatherhingSkill(int gatherhingSkill) {
        this.gatheringSkill = gatherhingSkill;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getDailyProteinDraw() {
        return dailyProteinDraw;
    }

    public void setDailyProteinDraw(int dailyProteinDraw) {
        this.dailyProteinDraw = dailyProteinDraw;
    }

    public int getDailyVeggieDraw() {
        return dailyVeggieDraw;
    }

    public void setDailyVeggieDraw(int dailyVeggieDraw) {
        this.dailyVeggieDraw = dailyVeggieDraw;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.startingMoney) ^ (Double.doubleToLongBits(this.startingMoney) >>> 32));
        hash = 83 * hash + this.huntingSkill;
        hash = 83 * hash + this.gatheringSkill;
        hash = 83 * hash + this.stamina;
        hash = 83 * hash + (this.available ? 1 : 0);
        hash = 83 * hash + this.dailyProteinDraw;
        hash = 83 * hash + this.dailyVeggieDraw;
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
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.startingMoney) != Double.doubleToLongBits(other.startingMoney)) {
            return false;
        }
        if (this.huntingSkill != other.huntingSkill) {
            return false;
        }
        if (this.gatheringSkill != other.gatheringSkill) {
            return false;
        }
        if (this.stamina != other.stamina) {
            return false;
        }
        if (this.available != other.available) {
            return false;
        }
        if (this.dailyProteinDraw != other.dailyProteinDraw) {
            return false;
        }
        if (this.dailyVeggieDraw != other.dailyVeggieDraw) {
            return false;
        }
        return true;
    }

   

    
    
//this is a test to see if commit will work .... ::::

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", health=" + health + ", startingMoney=" + startingMoney + ", huntingSkill=" + huntingSkill + ", gatheringSkill=" + gatheringSkill + ", stamina=" + stamina + ", available=" + available + ", dailyProteinDraw=" + dailyProteinDraw + ", dailyVeggieDraw=" + dailyVeggieDraw + '}';
    }
  


    
    
}
