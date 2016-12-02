package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new LinkedList<>();
        players.add(new Computer(new LimitIntellect(19)));
        players.add(new Computer (new LimitIntellect(16)));
        players.add(new Human("Я"));
        Dealer dealer = new Dealer("Dealer");
        players.add(dealer);

        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.print(player.name + ":");
            System.out.println(player.hand);

        }

        for (Player player: players){
            while (true) {
                System.out.println();
                System.out.println(player.name);
                System.out.println(player.hand.getScore()
                        +": "+
                        player.hand);
                Command command = player.decision();
                if (command==Command.STAND)
                    break;
                if (command==Command.HIT)
                    dealer.deal(player);

                if (player.hand.getScore() > 21) {
                    System.out.println(player.name + "Проиграл лол))");
                }
                if (dealer.hand.getScore() > 21) {
                    System.out.println(dealer.name + "Проиграл лол))");;
                }
                if (dealer.hand.getScore() > player.hand.getScore() && dealer.hand.getScore() < 21){
                    System.out.println(dealer.name + " Проиграл лол))");
                }
            }
      }
    }
}
