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
    private String status;
    private int dailyProteinDraw;
    private int dailyVeggieDraw;

    public Person(String name, int health, int startingMoney, int huntingSkill, 
            int gatheringSkill, int stamina, int dailyProteinDraw, 
            int dailyVeggieDraw, String status){
        this.name = name;
        this.health = health;
        this.startingMoney = startingMoney;
        this.huntingSkill = huntingSkill;
        this.gatheringSkill = gatheringSkill;
        this.stamina = stamina;
        this.dailyProteinDraw = dailyProteinDraw;
        this.dailyVeggieDraw = dailyVeggieDraw;
        this.status = status; 

    }
    
    public Person() {
    }
    
    

    public String getStatus() {
        return status;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public int getGatheringSkill() {
        return gatheringSkill;
    }

    public void setGatheringSkill(int gatherhingSkill) {
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
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.health;
        hash = 37 * hash + this.startingMoney;
        hash = 37 * hash + this.huntingSkill;
        hash = 37 * hash + this.gatheringSkill;
        hash = 37 * hash + this.stamina;
        hash = 37 * hash + Objects.hashCode(this.status);
        hash = 37 * hash + this.dailyProteinDraw;
        hash = 37 * hash + this.dailyVeggieDraw;
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
        if (this.startingMoney != other.startingMoney) {
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
        if (this.dailyProteinDraw != other.dailyProteinDraw) {
            return false;
        }
        if (this.dailyVeggieDraw != other.dailyVeggieDraw) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }
    
}
