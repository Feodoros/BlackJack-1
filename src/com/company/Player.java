package com.company;

/**
 * Created by student1 on 14.11.16.
 */
public abstract class Player  {
    public Hand hand = new Hand();

    public void take(Card current) {
        hand.add(current);


    }

    public Command decision() {
        return intellect.decide();

    }
}
