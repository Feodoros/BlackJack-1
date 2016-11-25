package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new LinkedList<>();
        players.add(new Computer("компуктер1", new LimitIntellect(19)));
        players.add(new Computer("компуктер2", new LimitIntellect(16)));
        players.add(new Human("Pidor"));
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
                System.out.println(player.hand.getScore()
                        +": "+
                        player.hand);
                Command command = player.decision();
                if (command==Command.STAND)
                    break;
                if (command==Command.HIT)
                    dealer.deal(player);

            }
        }
    }
}
