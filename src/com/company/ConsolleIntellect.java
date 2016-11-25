package com.company;

import java.util.Scanner;

/**
 * Created by student1 on 21.11.16.
 */
public class ConsolleIntellect extends Intellect {
    private Scanner in = new Scanner(System.in);

    @Override
    public Command decide(int score) {
        do {
            System.out.println("HIT/STAND: ");
            String c = in.nextLine();
            if("hit".startsWith(c.toLowerCase()))
            return Command.HIT;
            if("stand".startsWith(c.toLowerCase()))
            return Command.STAND;
            System.out.println("Не могу понять тебя, eblan. Blya, Давай поновой)");
        } while(true);


    }
}


