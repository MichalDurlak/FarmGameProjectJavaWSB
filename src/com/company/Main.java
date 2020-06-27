package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfWeek = 1;
        int numberOfYear = 2020;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of player: ");
        String namePlayerScan = scanner.next();
        Player player = new Player(namePlayerScan);


        System.out.println("Hello "+ namePlayerScan);
        System.out.println("Let the game begins");
        System.out.println("------------------------");
        System.out.println("Your balance: "+ player.getCash());
        System.out.println("Your farmland: "+ player.farmland);
        System.out.println("Your buildings: "+player.buildings);
        System.out.println("Your animals: "+player.animals);
        System.out.println("Your seeds: "+player.seeds);
        System.out.println("------------------------");

        int playerChose = menu(numberOfWeek,numberOfYear);

        while(playerChose!=0){
            switch(playerChose){
                case 9:
                    if (numberOfWeek >= 52){
                        numberOfWeek = 1;
                        numberOfYear = numberOfYear +1;
                    } else{
                        numberOfWeek = numberOfWeek+1;
                    }

                break;
            }

            playerChose = menu(numberOfWeek,numberOfYear);

        }

        System.out.println("     ****************************************");
        System.out.println("\n Good bye "+ namePlayerScan +".");

    }



    public static int menu(int numberOfWeek, int numberOfYear){
        System.out.println();
        System.out.println("Actual Date: "+numberOfWeek+" week. Year "+numberOfYear);
        System.out.println("*                 MENU                 *");
        System.out.println("     1. ");
        System.out.println("     2. ");
        System.out.println("     3. ");
        System.out.println("     9. Next week.");
        System.out.println("     0. Exit Game.");
        System.out.println("My Choice: ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();

        return choose;

    }


}
