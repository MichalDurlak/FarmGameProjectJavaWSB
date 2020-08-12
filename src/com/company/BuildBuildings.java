package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BuildBuildings {

    private static boolean AlreadyOpenBuildBuildings = false;
    static int small1CowshedBUY = 0;
    static int MAXsmall1CowshedBUY = 0;
    static int small2CowshedBUY = 0;
    static int MAXsmall2CowshedBUY = 0;
    static int small3CowshedBUY = 0;
    static int MAXsmall3CowshedBUY = 0;
    static int medium1CowshedBUY = 0;
    static int MAXmedium1CowshedBUY = 0;
    static int medium2CowshedBUY = 0;
    static int MAXmedium2CowshedBUY = 0;
    static int big1CowshedBUY = 0;
    static int MAXbig1CowshedBUY = 0;
    static int big2CowshedBUY = 0;
    static int MAXbig2CowshedBUY = 0;
    int tempMaxSizeBuildings = 0;


    public static int buildBuildings(int cash, int tempMaxSizeBuildings){

            if (getAlreadyOpenBuildBuildings() == true){
                System.out.println("You saw these prices: ");
                System.out.println("    Build Price:  ");

                System.out.println("1. Small Cowshed: " + small1CowshedBUY + ". Max animal in this cowshed: " + MAXsmall1CowshedBUY);
                System.out.println("2. Small Cowshed: " + small2CowshedBUY + ". Max animal in this cowshed: " + MAXsmall2CowshedBUY);
                System.out.println("3. Small Cowshed: " + small3CowshedBUY + ". Max animal in this cowshed: " + MAXsmall3CowshedBUY);
                System.out.println("4. Medium Cowshed: " + medium1CowshedBUY + ". Max animal in this cowshed: " + MAXmedium1CowshedBUY);
                System.out.println("5. Medium Cowshed: " + medium2CowshedBUY + ". Max animal in this cowshed: " + MAXmedium2CowshedBUY);
                System.out.println("6. Big Cowshed: " + big1CowshedBUY + ". Max animal in this cowshed: " + MAXbig1CowshedBUY);
                System.out.println("7. Big Cowshed: " + big2CowshedBUY + ". Max animal in this cowshed: " + MAXbig2CowshedBUY);
                System.out.println("0. Exit");


                System.out.println("I chose number: ");
                Scanner in = new Scanner(System.in);
                int choose = in.nextInt();

                if (choose == 1) {
                    System.out.println("Congratulations you bought it!");

                } else if (choose == 2) {

                } else if (choose == 0) {
                    return choose;

                }

                else {
                    System.out.println("Please dont brake the game.");
                }


            } else if (getAlreadyOpenBuildBuildings() == false) {
                AlreadyOpenBuildBuildings = true;
                System.out.println("New prices: ");
                ThreadLocalRandom random = ThreadLocalRandom.current();

                small1CowshedBUY = random.nextInt(100, 300);
                small1CowshedBUY = Math.round(small1CowshedBUY * 100);
                small1CowshedBUY = small1CowshedBUY / 100;
                MAXsmall1CowshedBUY = random.nextInt(1, 2);
                MAXsmall1CowshedBUY = Math.round(MAXsmall1CowshedBUY * 100);
                MAXsmall1CowshedBUY = MAXsmall1CowshedBUY / 100;

                small2CowshedBUY = random.nextInt(50, 300);
                small2CowshedBUY = Math.round(small2CowshedBUY * 100);
                small2CowshedBUY = small2CowshedBUY / 100;
                MAXsmall2CowshedBUY = random.nextInt(1, 2);
                MAXsmall2CowshedBUY = Math.round(MAXsmall2CowshedBUY * 100);
                MAXsmall2CowshedBUY = MAXsmall2CowshedBUY / 100;

                small3CowshedBUY = random.nextInt(100, 250);
                small3CowshedBUY = Math.round(small3CowshedBUY * 100);
                small3CowshedBUY = small3CowshedBUY / 100;
                MAXsmall3CowshedBUY = random.nextInt(1, 2);
                MAXsmall3CowshedBUY = Math.round(MAXsmall3CowshedBUY * 100);
                MAXsmall3CowshedBUY = MAXsmall3CowshedBUY / 100;

                medium1CowshedBUY = random.nextInt(300, 550);
                medium1CowshedBUY = Math.round(medium1CowshedBUY * 100);
                medium1CowshedBUY = medium1CowshedBUY / 100;
                MAXmedium1CowshedBUY = random.nextInt(3, 5);
                MAXmedium1CowshedBUY = Math.round(MAXmedium1CowshedBUY * 100);
                MAXmedium1CowshedBUY = MAXmedium1CowshedBUY / 100;

                medium2CowshedBUY = random.nextInt(350, 450);
                medium2CowshedBUY = Math.round(medium2CowshedBUY * 100);
                medium2CowshedBUY = medium2CowshedBUY / 100;
                MAXmedium2CowshedBUY = random.nextInt(3, 5);
                MAXmedium2CowshedBUY = Math.round(MAXmedium2CowshedBUY * 100);
                MAXmedium2CowshedBUY = MAXmedium2CowshedBUY / 100;

                big1CowshedBUY = random.nextInt(600, 1000);
                big1CowshedBUY = Math.round(big1CowshedBUY * 100);
                big1CowshedBUY = big1CowshedBUY / 100;
                MAXbig1CowshedBUY = random.nextInt(6, 12);
                MAXbig1CowshedBUY = Math.round(MAXbig1CowshedBUY * 100);
                MAXbig1CowshedBUY = MAXbig1CowshedBUY / 100;

                big2CowshedBUY = random.nextInt(700, 800);
                big2CowshedBUY = Math.round(big2CowshedBUY * 100);
                big2CowshedBUY = big2CowshedBUY / 100;
                MAXbig2CowshedBUY = random.nextInt(6, 12);
                MAXbig2CowshedBUY = Math.round(MAXbig2CowshedBUY * 100);
                MAXbig2CowshedBUY = MAXbig2CowshedBUY / 100;


                System.out.println("1. Small Cowshed: " + small1CowshedBUY + ". Max animal in this cowshed: " + MAXsmall1CowshedBUY);
                System.out.println("2. Small Cowshed: " + small2CowshedBUY + ". Max animal in this cowshed: " + MAXsmall2CowshedBUY);
                System.out.println("3. Small Cowshed: " + small3CowshedBUY + ". Max animal in this cowshed: " + MAXsmall3CowshedBUY);
                System.out.println("4. Medium Cowshed: " + medium1CowshedBUY + ". Max animal in this cowshed: " + MAXmedium1CowshedBUY);
                System.out.println("5. Medium Cowshed: " + medium2CowshedBUY + ". Max animal in this cowshed: " + MAXmedium2CowshedBUY);
                System.out.println("6. Big Cowshed: " + big1CowshedBUY + ". Max animal in this cowshed: " + MAXbig1CowshedBUY);
                System.out.println("7. Big Cowshed: " + big2CowshedBUY + ". Max animal in this cowshed: " + MAXbig2CowshedBUY);
                System.out.println("0. Exit");

                System.out.println("I chose number: ");
                Scanner in = new Scanner(System.in);
                int choose = in.nextInt();



                if (choose == 1) {
                    System.out.println("Congratulations you bought it!");

                } else if (choose == 2) {

                } else if (choose == 0) {
                    return choose;

                }

                else {
                    System.out.println("Please dont brake the game.");
                }




            }

        return cash;
    }


    public static boolean getAlreadyOpenBuildBuildings() {
        return AlreadyOpenBuildBuildings;
    }

    public static void setAlreadyOpenBuildBuildings() {
        AlreadyOpenBuildBuildings = false;
    }


}
