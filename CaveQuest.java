/*
 *  Name: CaveQuest
 *  Date: 9/22/2019
 *  Author: Sean Filer
 *  Purpose: Another toy program to play with multithreading.  This class will provide a gui to display the progress of the quest.
 */
package cavequest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CaveQuest extends JFrame implements ActionListener{

    private GridBagConstraints gbc = new GridBagConstraints();
    private Quest quest;

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
        /*
         * Display a starting screen with a button that initializes the quest
         */
        JLabel startLabel = new JLabel("CAVEQUEST: the ultimate challenge."); // replace with an image of the title logo?
        JButton startButton = new JButton("Begin questing...");
        startButton.setActionCommand("begin");
        startButton.addActionListener(this);
        JPanel startPanel = new JPanel();
        startPanel.setLayout(new GridBagLayout());
        gbc.gridy = 0;
        startPanel.add(startLabel, gbc);
        gbc.gridy = 1;
        startPanel.add(startButton, gbc);

        this.getContentPane().add(startPanel);
        this.pack();
    }

    public void displayQuestScreen(){
        this.getContentPane().removeAll();
        /*
         * Display the quest screen that lists the party members and cave features after initializing the quest.
         */
        quest = new Quest();

        JTextArea questTextArea = new JTextArea();
        JPanel questPanel = new JPanel();
        questPanel.setLayout(new GridBagLayout());
        questPanel.add(questTextArea);

        questTextArea.setText(quest.scenario());

        this.getContentPane().add(questPanel);
        this.pack();
    }

    public void actionPerformed(ActionEvent e){
        /*What to do when an action is performed*/

        String command = e.getActionCommand();

        switch(command){
            case "begin":
                displayQuestScreen();
                break;
        }
    }
}