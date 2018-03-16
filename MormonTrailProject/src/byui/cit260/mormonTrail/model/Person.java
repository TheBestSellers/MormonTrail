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
    private double health;
    private double startingMoney;
    private int huntingSkill;
    private int gatheringSkill;
    private int stamina;
    private boolean available;
    private int dailyProteinDraw;
    private int dailyVeggieDraw;
    
    public static Person[] createPersons(){
        Person[] persons = new Person[10];
        
        Person person1 = persons[PersonType.Benjamin.ordinal()];
        Person person2 = persons[PersonType.Peter.ordinal()];
        Person person3 = persons[PersonType.Sarah.ordinal()];
        Person person4 = persons[PersonType.Daniel.ordinal()];
        Person person5 = persons[PersonType.Alexander.ordinal()];
        Person person6 = persons[PersonType.Mary.ordinal()];
        Person person7 = persons[PersonType.Beth.ordinal()];
        Person person8 = persons[PersonType.Joseph.ordinal()];
        Person person9 = persons[PersonType.Harriett.ordinal()];
        Person person10 = persons[PersonType.George.ordinal()];
        
  
        
        return items;
    } 
    
    
    public Person() {
    }
    
    

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
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

   

    @Override
    public String toString() {
        return "Person{" + "health=" + health + ", startingMoney=" + startingMoney + ", huntingSkill=" + huntingSkill + ", gatherhingSkill=" + gatheringSkill + ", stamina=" + stamina + ", available=" + available + '}';
    }
    
//this is a test to see if commit will work .... ::::
  


    
    
}
