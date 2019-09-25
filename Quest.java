/*
 *  Name: Quest
 *  Date: 9/25/2019
 *  Author: Sean Filer
 *  Purpose: Contains the party and cave that will be involved in the quest.  Controls how they interact and sends the results to CaveQuest for display in the GUI.
 */
package cavequest;

import java.util.ArrayList;

public class Quest {
    private ArrayList<Adventurer> party = new ArrayList<>();
    private Cave cave;

    public Quest(){
        cave = new Cave();
        party.add(new Adventurer("warrior"));
    }

    public String scenario(){
        String result = "Here is the quest!\n";
        result = result + "Party Members: ";
        for(Adventurer currentAdv: party){
            result = result + "\n   " + currentAdv.getJob();
        }
        return result;
    }
}
