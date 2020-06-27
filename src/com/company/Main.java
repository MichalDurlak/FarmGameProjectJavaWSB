package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of player: ");
        String namePlayerScan = scanner.next();
        startGame(namePlayerScan);
    }


    public static void startGame(String namePlayerScan){
        int numberOfWeek = 52;
        int numberOfYear = 2020;

        Player player = new Player(namePlayerScan);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello "+ namePlayerScan);

        System.out.println("Let the game begins");
        System.out.println("------------------------");
        System.out.println("Your balance: "+ player.getCash());
        System.out.println("Your farmland: "+ player.farmland);
        System.out.println("Your buildings: "+player.buildings);
        System.out.println("Your animals: "+player.animals);
        System.out.println("Your seeds: "+player.seeds);
        System.out.println("------------------------");


        System.out.println("Actual Date: "+numberOfWeek+" week. Year "+numberOfYear);
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("2. ");
        System.out.println("2. ");
        System.out.println("2. ");
        System.out.println("2. ");
        System.out.println("9. Go to next week.");

        System.out.println("My Choice: ");
        int choose = scanner.nextInt();




        if (choose == 9){
            if (numberOfWeek >= 52){
                numberOfWeek = 1;
                numberOfYear = numberOfYear +1;
            } else{
                numberOfWeek = numberOfWeek+1;
            }
        }


    }



}
