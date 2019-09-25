/*
 *  Name: Cave
 *  Date: 9/25/2019
 *  Author: Sean Filer
 *  Purpose: Contains a list of monsters.  When all the monsters are killed the cave is considered "cleared out".
 */
package cavequest;

import java.util.ArrayList;

public class Cave {
    private boolean clearedOut;
    private ArrayList<Monster> monsterList = new ArrayList<>();
}
