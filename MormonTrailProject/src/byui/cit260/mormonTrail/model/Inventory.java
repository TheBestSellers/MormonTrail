///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.mormonTrail.model;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//
///**
// *
// * @author Christopher
// */
//public class Inventory implements Serializable {
//    
//    private int totalWeight;
//    private ArrayList<Item> items = new ArrayList<Item>();
//
//    public Inventory() {
//    }
//    
//    public Inventory() {
//    }
//
//    public void setItems(ArrayList<Item> items) {
//        this.items = items;
//    }
//
//    public int getTotalWeight() {
//        return totalWeight;
//    }
//
//    public void setTotalWeight(int totalWeight) {
//        this.totalWeight = totalWeight;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 29 * hash + this.totalWeight;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Inventory other = (Inventory) obj;
//        if (this.totalWeight != other.totalWeight) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Inventory{" + "totalWeight=" + totalWeight + ", items=" + items + '}';
//    }   
//    
//}
//
