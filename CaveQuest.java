/*
 *  Name: CaveQuest
 *  Date: 9/22/2019
 *  Author: Sean Filer
 *  Purpose: Another toy program to play with multithreading.  This class will provide a gui to display the progress of the quest.
 */
package cavequest;

import javax.swing.*;
import java.awt.event.*;

public class CaveQuest extends JFrame implements ActionListener{


    public static void main(String[] args) {
        CaveQuest mainQuest = new CaveQuest();
    }
    
    public CaveQuest(){
        super("CaveQuest");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayStartingScreen();
    }
    
    public void displayStartingScreen(){ 
        this.getContentPane().removeAll();
        
        JPanel testPanel = new JPanel();
        testPanel.add(new JLabel("hey ;)"));
        this.getContentPane().add(testPanel);
        this.pack();
    }
    
    public void actionPerformed(ActionEvent e){
        /*What to do when an action is performed*/
    }
}
