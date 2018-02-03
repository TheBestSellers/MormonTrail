/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author alyssahundley
 */
public class Game implements Serializable{
    
    private int locationOfParty;
    private int distanceFromNauvoo;
    private int distanceFromSLC;
    private int date;
    private String dayOfWeek;
    private String weather;
    

    public Game() {
        
    }

    public int getLocationOfParty() {
        return locationOfParty;
    }

    public void setLocationOfParty(int locationOfParty) {
        this.locationOfParty = locationOfParty;
    }

    public int getDistanceFromNauvoo() {
        return distanceFromNauvoo;
    }

    public void setDistanceFromNauvoo(int distanceFromNauvoo) {
        this.distanceFromNauvoo = distanceFromNauvoo;
    }

    public int getDistanceFromSLC() {
        return distanceFromSLC;
    }

    public void setDistanceFromSLC(int distanceFromSLC) {
        this.distanceFromSLC = distanceFromSLC;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    
    }

    @Override
    public int hashCode() {
        int hash = 6;
        hash = 53 * hash + this.locationOfParty;
        hash = 53 * hash + this.distanceFromNauvoo;
        hash = 53 * hash + this.distanceFromSLC;
        hash = 53 * hash + this.date;
        hash = 53 * hash + Objects.hashCode(this.dayOfWeek);
        hash = 53 * hash + Objects.hashCode(this.weather);
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
        final Game other = (Game) obj;
        if (this.locationOfParty != other.locationOfParty) {
            return false;
        }
        if (this.distanceFromNauvoo != other.distanceFromNauvoo) {
            return false;
        }
        if (this.distanceFromSLC != other.distanceFromSLC) {
            return false;
        }
        if (this.date != other.date) {
            return false;
        }
        if (!Objects.equals(this.dayOfWeek, other.dayOfWeek)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "locationOfParty=" + locationOfParty + ", distanceFromNauvoo=" + distanceFromNauvoo + ", distanceFromSLC=" + distanceFromSLC + ", date=" + date + ", dayOfWeek=" + dayOfWeek + ", weather=" + weather + '}';
    }

}

    
