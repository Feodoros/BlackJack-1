package com.company;

/**
 * Created by student1 on 14.11.16.
 */
public class Computer extends Player {
    static String[] names = {"Снежана","Ондрей","Ортем","Дониил","Некита", "Ульяна", "Мофиози"};
    public Computer(Intellect intellect) {
        super(intellect, "");
        String name = names[(int)(Math.random()*names.length)];
        this.name=name;
    }
}