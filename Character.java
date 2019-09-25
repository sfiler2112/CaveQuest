/*
 *  Name: Character
 *  Date: 9/25/2019
 *  Author: Sean Filer
 *  Purpose: An entity within the program.  Has life points and damage output.
 */
package cavequest;

public class Character {
    private double lifePoints;
    private double maxLife = 100;
    private double damageOutput;

    public Character(){
        lifePoints = maxLife;
        damageOutput = 10;
    }

    public double getLifePoints(){
        return lifePoints;
    }

    public void setLifePoints(double argLifePoints){
        lifePoints = argLifePoints;
    }


    protected void setMaxLife(Double extraLifePoints){
        maxLife += extraLifePoints;
        lifePoints = maxLife;
    }
}
