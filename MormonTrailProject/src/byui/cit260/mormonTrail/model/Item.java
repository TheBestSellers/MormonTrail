/*
 * License Info
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Christopher
 */
public class Item implements Serializable{
    
    //variables
    private String name;
    private int cost;
    private int weight;
    private int qty;


    //constructor
    public Item() {
    }
    
    public Item(String name, int cost, int weight, int qty) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.qty = qty;
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    
    //
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.cost);
        hash = 79 * hash + Objects.hashCode(this.weight);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", cost=" + cost + ", weight=" + weight + ", qty=" + qty + '}';
    }
    
    
    
}
