/*
 *  Name: Monster
 *  Date: 9/25/2019
 *  Author: Sean Filer
 *  Purpose: An entity within the program that inherits from Character.  Has an inventory with items that give bonuses to offense or defense.  Can engage a monster and attack it until it's dead.
 */
package cavequest;

import java.util.ArrayList;

public class Adventurer extends Character{
    private ArrayList<String> inventory;
    private double gold;
    private String job;

    public Adventurer(String job){
        super();
        inventory = new ArrayList<>();
        gold = 0;
        this.job = job;
    }


    public void addToInventory(String item){
        inventory.add(item);
    }

    public void addGold(double addedGold){
        gold += addedGold;
    }

    public double getGold(){
        return gold;
    }

    public String getJob(){
        return job;
    }
}
