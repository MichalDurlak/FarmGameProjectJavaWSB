package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of player: ");
        String namePlayerScan = scanner.next();

        Player player = new Player(namePlayerScan);

        System.out.println("Hello "+ namePlayerScan);
        System.out.println("Let the game begins");
        System.out.println("------------------------");
        System.out.println("Your balance: "+ player.getCash());
        System.out.println("Your place: "+ player.farmland);
        System.out.println("Your buildings: "+player.buildings);
        System.out.println("Your animals: "+player.animals);
        System.out.println("Your seeds: "+player.seeds);
        System.out.println("------------------------");


    }
}
