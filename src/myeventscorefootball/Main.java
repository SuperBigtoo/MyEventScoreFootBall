/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myeventscorefootball;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        SubscriberOne subOne = new SubscriberOne();
        SubscriberTwo subTwo = new SubscriberTwo();
        source.addScoreListener(subOne);
        source.addScoreListener(subTwo);
        
        Scanner sn = new Scanner(System.in);
        String score = "NULL";
        
        while(!score.equals("")) {
            System.out.print("Enter Score : ");
            score = sn.nextLine();
            
            if (!score.equals(""))
                source.setScoreLine(score);
        }
        System.out.print("... END :) ...");
    }
}
