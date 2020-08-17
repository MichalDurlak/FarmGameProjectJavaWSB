package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BuildBuildings {

    private static boolean AlreadyOpenBuildBuildings = false;

    static int small1CowshedBUY = 0;
    static int MAXsmall1CowshedBUY = 0;
    static int Sizesmall1CowshedBUY = 0;

    static int small2CowshedBUY = 0;
    static int MAXsmall2CowshedBUY = 0;
    static int Sizesmall2CowshedBUY = 0;


    static int small3CowshedBUY = 0;
    static int MAXsmall3CowshedBUY = 0;
    static int Sizesmall3CowshedBUY = 0;


    static int medium1CowshedBUY = 0;
    static int MAXmedium1CowshedBUY = 0;
    static int Sizemedium1CowshedBUY = 0;


    static int medium2CowshedBUY = 0;
    static int MAXmedium2CowshedBUY = 0;
    static int Sizemedium2CowshedBUY = 0;


    static int big1CowshedBUY = 0;
    static int MAXbig1CowshedBUY = 0;
    static int Sizebig1CowshedBUY = 0;


    static int big2CowshedBUY = 0;
    static int MAXbig2CowshedBUY = 0;
    static int Sizebig2CowshedBUY = 0;




    static int tempMaxSizeBuildings = 0;
    private static int tempPriceBuilding = 0;
    private static int tempSizeofCowshed = 0;

    public static int buildBuildings(int cash, int tempPlayerMaxSizeBuildings){

        tempPriceBuilding = 0;
        tempSizeofCowshed = 0;
        tempMaxSizeBuildings = 0;

            if (getAlreadyOpenBuildBuildings() == true){
                System.out.println("You saw these prices: ");
                System.out.println("    Build Price:  ");

                System.out.println("1. Small Cowshed: " + small1CowshedBUY + ". Max animal: " + MAXsmall1CowshedBUY + ". Size needed: "+Sizesmall1CowshedBUY);
                System.out.println("2. Small Cowshed: " + small2CowshedBUY + ". Max animal: " + MAXsmall2CowshedBUY + ". Size needed: "+Sizesmall2CowshedBUY);
                System.out.println("3. Small Cowshed: " + small3CowshedBUY + ". Max animal: " + MAXsmall3CowshedBUY + ". Size needed: "+Sizesmall3CowshedBUY);
                System.out.println("4. Medium Cowshed: " + medium1CowshedBUY + ". Max animal: " + MAXmedium1CowshedBUY + ". Size needed: "+Sizemedium1CowshedBUY);
                System.out.println("5. Medium Cowshed: " + medium2CowshedBUY + ". Max animal: " + MAXmedium2CowshedBUY + ". Size needed: "+Sizemedium2CowshedBUY);
                System.out.println("6. Big Cowshed: " + big1CowshedBUY + ". Max animal: " + MAXbig1CowshedBUY + ". Size needed: "+Sizebig1CowshedBUY);
                System.out.println("7. Big Cowshed: " + big2CowshedBUY + ". Max animal: " + MAXbig2CowshedBUY + ". Size needed: "+Sizebig2CowshedBUY);
                System.out.println("0. Exit");


                System.out.println("I chose number: ");
                Scanner in = new Scanner(System.in);
                int choose = in.nextInt();

                if (choose == 1) {

                    if (cash > small1CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizesmall1CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += small1CowshedBUY;
                            tempSizeofCowshed += MAXsmall1CowshedBUY;
                            tempMaxSizeBuildings +=Sizesmall1CowshedBUY;

                            small1CowshedBUY = 0;
                            MAXsmall1CowshedBUY = 0;
                            Sizesmall1CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 2) {

                    if (cash > small2CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizesmall2CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += small2CowshedBUY;
                            tempSizeofCowshed += MAXsmall2CowshedBUY;
                            tempMaxSizeBuildings +=Sizesmall2CowshedBUY;

                            small2CowshedBUY = 0;
                            MAXsmall2CowshedBUY = 0;
                            Sizesmall2CowshedBUY= 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 3) {

                    if (cash > small3CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizesmall3CowshedBUY){
                            System.out.println("You build cowshed");
                            tempPriceBuilding += small3CowshedBUY;
                            tempSizeofCowshed += MAXsmall3CowshedBUY;
                            tempMaxSizeBuildings +=Sizesmall3CowshedBUY;

                            small3CowshedBUY = 0;
                            MAXsmall3CowshedBUY = 0;
                            Sizesmall3CowshedBUY= 0;
                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");

                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 4) {

                    if (cash > medium1CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizemedium1CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += medium1CowshedBUY;
                            tempSizeofCowshed += MAXmedium1CowshedBUY;
                            tempMaxSizeBuildings +=Sizemedium1CowshedBUY;

                            medium1CowshedBUY = 0;
                            MAXmedium1CowshedBUY = 0;
                            Sizemedium1CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 5) {

                    if (cash > medium2CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizemedium2CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += medium2CowshedBUY;
                            tempSizeofCowshed += MAXmedium2CowshedBUY;
                            tempMaxSizeBuildings +=Sizemedium2CowshedBUY;

                            medium2CowshedBUY = 0;
                            MAXmedium2CowshedBUY = 0;
                            Sizemedium2CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 6) {

                    if (cash > big1CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizebig1CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += big1CowshedBUY;
                            tempSizeofCowshed += MAXbig1CowshedBUY;
                            tempMaxSizeBuildings +=Sizebig1CowshedBUY;

                            big1CowshedBUY = 0;
                            MAXbig1CowshedBUY = 0;
                            Sizebig1CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 7) {

                    if (cash > big2CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizebig2CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += big2CowshedBUY;
                            tempSizeofCowshed += MAXbig2CowshedBUY;
                            tempMaxSizeBuildings +=Sizebig2CowshedBUY;

                            big2CowshedBUY = 0;
                            MAXbig2CowshedBUY = 0;
                            Sizebig2CowshedBUY= 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 0) { return choose; }
                else { System.out.println("Please dont brake the game."); }



            } else if (getAlreadyOpenBuildBuildings() == false) {

                tempPriceBuilding = 0;
                tempSizeofCowshed = 0;
                tempMaxSizeBuildings = 0;

                AlreadyOpenBuildBuildings = true;
                System.out.println("New prices: ");
                ThreadLocalRandom random = ThreadLocalRandom.current();

                small1CowshedBUY = random.nextInt(100, 300);
                small1CowshedBUY = Math.round(small1CowshedBUY * 100);
                small1CowshedBUY = small1CowshedBUY / 100;
                MAXsmall1CowshedBUY = random.nextInt(1, 2);
                MAXsmall1CowshedBUY = Math.round(MAXsmall1CowshedBUY * 100);
                MAXsmall1CowshedBUY = MAXsmall1CowshedBUY / 100;
                Sizesmall1CowshedBUY = random.nextInt(1, 3);
                Sizesmall1CowshedBUY = Math.round(Sizesmall1CowshedBUY * 100);
                Sizesmall1CowshedBUY = Sizesmall1CowshedBUY / 100;

                small2CowshedBUY = random.nextInt(50, 300);
                small2CowshedBUY = Math.round(small2CowshedBUY * 100);
                small2CowshedBUY = small2CowshedBUY / 100;
                MAXsmall2CowshedBUY = random.nextInt(1, 2);
                MAXsmall2CowshedBUY = Math.round(MAXsmall2CowshedBUY * 100);
                MAXsmall2CowshedBUY = MAXsmall2CowshedBUY / 100;
                Sizesmall2CowshedBUY = random.nextInt(1, 3);
                Sizesmall2CowshedBUY = Math.round(Sizesmall2CowshedBUY * 100);
                Sizesmall2CowshedBUY = Sizesmall2CowshedBUY / 100;

                small3CowshedBUY = random.nextInt(100, 250);
                small3CowshedBUY = Math.round(small3CowshedBUY * 100);
                small3CowshedBUY = small3CowshedBUY / 100;
                MAXsmall3CowshedBUY = random.nextInt(1, 2);
                MAXsmall3CowshedBUY = Math.round(MAXsmall3CowshedBUY * 100);
                MAXsmall3CowshedBUY = MAXsmall3CowshedBUY / 100;
                Sizesmall3CowshedBUY = random.nextInt(1, 3);
                Sizesmall3CowshedBUY = Math.round(Sizesmall3CowshedBUY * 100);
                Sizesmall3CowshedBUY = Sizesmall3CowshedBUY / 100;

                medium1CowshedBUY = random.nextInt(300, 550);
                medium1CowshedBUY = Math.round(medium1CowshedBUY * 100);
                medium1CowshedBUY = medium1CowshedBUY / 100;
                MAXmedium1CowshedBUY = random.nextInt(3, 5);
                MAXmedium1CowshedBUY = Math.round(MAXmedium1CowshedBUY * 100);
                MAXmedium1CowshedBUY = MAXmedium1CowshedBUY / 100;
                Sizemedium1CowshedBUY = random.nextInt(2, 6);
                Sizemedium1CowshedBUY = Math.round(Sizemedium1CowshedBUY * 100);
                Sizemedium1CowshedBUY = Sizemedium1CowshedBUY / 100;

                medium2CowshedBUY = random.nextInt(350, 450);
                medium2CowshedBUY = Math.round(medium2CowshedBUY * 100);
                medium2CowshedBUY = medium2CowshedBUY / 100;
                MAXmedium2CowshedBUY = random.nextInt(3, 5);
                MAXmedium2CowshedBUY = Math.round(MAXmedium2CowshedBUY * 100);
                MAXmedium2CowshedBUY = MAXmedium2CowshedBUY / 100;
                Sizemedium2CowshedBUY = random.nextInt(2, 6);
                Sizemedium2CowshedBUY = Math.round(Sizemedium2CowshedBUY * 100);
                Sizemedium2CowshedBUY = Sizemedium2CowshedBUY / 100;

                big1CowshedBUY = random.nextInt(600, 1000);
                big1CowshedBUY = Math.round(big1CowshedBUY * 100);
                big1CowshedBUY = big1CowshedBUY / 100;
                MAXbig1CowshedBUY = random.nextInt(6, 12);
                MAXbig1CowshedBUY = Math.round(MAXbig1CowshedBUY * 100);
                MAXbig1CowshedBUY = MAXbig1CowshedBUY / 100;
                Sizebig1CowshedBUY = random.nextInt(4, 8);
                Sizebig1CowshedBUY = Math.round(Sizebig1CowshedBUY * 100);
                Sizebig1CowshedBUY = Sizebig1CowshedBUY / 100;

                big2CowshedBUY = random.nextInt(700, 800);
                big2CowshedBUY = Math.round(big2CowshedBUY * 100);
                big2CowshedBUY = big2CowshedBUY / 100;
                MAXbig2CowshedBUY = random.nextInt(6, 12);
                MAXbig2CowshedBUY = Math.round(MAXbig2CowshedBUY * 100);
                MAXbig2CowshedBUY = MAXbig2CowshedBUY / 100;
                Sizebig2CowshedBUY = random.nextInt(4, 8);
                Sizebig2CowshedBUY = Math.round(Sizebig2CowshedBUY * 100);
                Sizebig2CowshedBUY = Sizebig2CowshedBUY / 100;


                System.out.println("1. Small Cowshed: " + small1CowshedBUY + ". Max animal: " + MAXsmall1CowshedBUY + ". Size needed: "+Sizesmall1CowshedBUY);
                System.out.println("2. Small Cowshed: " + small2CowshedBUY + ". Max animal: " + MAXsmall2CowshedBUY + ". Size needed: "+Sizesmall2CowshedBUY);
                System.out.println("3. Small Cowshed: " + small3CowshedBUY + ". Max animal: " + MAXsmall3CowshedBUY + ". Size needed: "+Sizesmall3CowshedBUY);
                System.out.println("4. Medium Cowshed: " + medium1CowshedBUY + ". Max animal: " + MAXmedium1CowshedBUY + ". Size needed: "+Sizemedium1CowshedBUY);
                System.out.println("5. Medium Cowshed: " + medium2CowshedBUY + ". Max animal: " + MAXmedium2CowshedBUY + ". Size needed: "+Sizemedium2CowshedBUY);
                System.out.println("6. Big Cowshed: " + big1CowshedBUY + ". Max animal: " + MAXbig1CowshedBUY + ". Size needed: "+Sizebig1CowshedBUY);
                System.out.println("7. Big Cowshed: " + big2CowshedBUY + ". Max animal: " + MAXbig2CowshedBUY + ". Size needed: "+Sizebig2CowshedBUY);
                System.out.println("0. Exit");

                System.out.println("I chose number: ");
                Scanner in = new Scanner(System.in);
                int choose = in.nextInt();


                if (choose == 1) {

                    if (cash > small1CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizesmall1CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += small1CowshedBUY;
                            tempSizeofCowshed += MAXsmall1CowshedBUY;
                            tempMaxSizeBuildings +=Sizesmall1CowshedBUY;

                            small1CowshedBUY = 0;
                            MAXsmall1CowshedBUY = 0;
                            Sizesmall1CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 2) {

                    if (cash > small2CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizesmall2CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += small2CowshedBUY;
                            tempSizeofCowshed += MAXsmall2CowshedBUY;
                            tempMaxSizeBuildings +=Sizesmall2CowshedBUY;

                            small2CowshedBUY = 0;
                            MAXsmall2CowshedBUY = 0;
                            Sizesmall2CowshedBUY= 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 3) {

                    if (cash > small3CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizesmall3CowshedBUY){
                            System.out.println("You build cowshed");
                            tempPriceBuilding += small3CowshedBUY;
                            tempSizeofCowshed += MAXsmall3CowshedBUY;
                            tempMaxSizeBuildings +=Sizesmall3CowshedBUY;

                            small3CowshedBUY = 0;
                            MAXsmall3CowshedBUY = 0;
                            Sizesmall3CowshedBUY= 0;
                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");

                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 4) {

                    if (cash > medium1CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizemedium1CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += medium1CowshedBUY;
                            tempSizeofCowshed += MAXmedium1CowshedBUY;
                            tempMaxSizeBuildings +=Sizemedium1CowshedBUY;

                            medium1CowshedBUY = 0;
                            MAXmedium1CowshedBUY = 0;
                            Sizemedium1CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 5) {

                    if (cash > medium2CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizemedium2CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += medium2CowshedBUY;
                            tempSizeofCowshed += MAXmedium2CowshedBUY;
                            tempMaxSizeBuildings +=Sizemedium2CowshedBUY;

                            medium2CowshedBUY = 0;
                            MAXmedium2CowshedBUY = 0;
                            Sizemedium2CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 6) {

                    if (cash > big1CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizebig1CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += big1CowshedBUY;
                            tempSizeofCowshed += MAXbig1CowshedBUY;
                            tempMaxSizeBuildings +=Sizebig1CowshedBUY;

                            big1CowshedBUY = 0;
                            MAXbig1CowshedBUY = 0;
                            Sizebig1CowshedBUY = 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 7) {

                    if (cash > big2CowshedBUY){
                        if (tempPlayerMaxSizeBuildings >= Sizebig2CowshedBUY){
                            System.out.println("You build it.");
                            tempPriceBuilding += big2CowshedBUY;
                            tempSizeofCowshed += MAXbig2CowshedBUY;
                            tempMaxSizeBuildings +=Sizebig2CowshedBUY;

                            big2CowshedBUY = 0;
                            MAXbig2CowshedBUY = 0;
                            Sizebig2CowshedBUY= 0;

                        } else {
                            System.out.println("You cant build, because you dont have enough place for this.");
                        }

                    } else {
                        System.out.println("Not enough money. Check your balance.");
                    }

                }

                else if (choose == 0) { return choose; }
                else { System.out.println("Please dont brake the game."); }





            }

        return cash;
    }


    public static boolean getAlreadyOpenBuildBuildings() {
        return AlreadyOpenBuildBuildings;
    }

    public static void setAlreadyOpenBuildBuildings() {
        AlreadyOpenBuildBuildings = false;
    }


    public static int getTempPriceBuilding(){
        return tempPriceBuilding;
    }

    public static int getTempSizeofCowshed(){
        return tempSizeofCowshed;
    }
    public static int getTempMaxSizeBuildings(){
        return tempMaxSizeBuildings;
    }



}
