/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myeventscorefootball;

import java.util.ArrayList;

/**
 *
 * @author Jason
 */
public class ScoreSource {
    private ArrayList<ScoreListener> mySubscriber;
    
    public ScoreSource() {
        mySubscriber = new ArrayList<>();
    }
    
    public void addScoreListener(ScoreListener sl) {
        mySubscriber.add(sl);
    }
    
    public void setScoreLine(String score) {
        fireScoreEvent(new ScoreEvent(this, score));
    }
    
    public void fireScoreEvent(ScoreEvent evt) {
        mySubscriber.forEach(sl -> {
            sl.scoreChange(evt);
        });
    }
}
