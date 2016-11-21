package com.company;

import java.util.LinkedList;

/**
 * Created by student1 on 14.11.16.
 */
public class Hand extends LinkedList<Card> {
    public int getScore() {
        int sum=0;
        for(Card c: this)
            sum += c.getScore();
        return sum;
    }

}
