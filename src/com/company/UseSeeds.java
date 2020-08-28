package com.company;

import java.util.Scanner;

public class UseSeeds {

static int howManySeeds;
static double howManyHectaresUsed;
static int finalPrice;
static int WheatSeedsPlant;
static int OatSeedPlant;
static int CornSeedPlant;
static int PotatoSeedPlant;
static int AppleTreeSeedPlant;


    public static void useSeeds(int WheatSeedsize, int OatSeedsize, int CornSeedsize, int PotatoSeedsize,int AppleTreeSeedsize, int playerCash, double playerHectares) {

        WheatSeedsPlant = 0;
        OatSeedPlant = 0;
        CornSeedPlant =0;
        PotatoSeedPlant= 0;
        AppleTreeSeedPlant =0;
        double oneWheatSeedsPlaceNeeded = 0.5;
        double oneOatSeedPlaceNeeded = 0.5;
        double oneCornSeedPlaceNeeded = 0.5;
        double onePotatoSeedPlaceNeeded = 0.5;
        double oneAppleTreeSeedPlaceNeeded = 0.5;


        int priceoneWheatSeedsPlant = 7;
        int priceoneOatSeedPlant= 14;
        int priceoneCornSeedPlant= 27;
        int priceonePotatoSeedPlant= 18;
        int priceoneAppleTreeSeedPlant= 21;

        System.out.println("Pricing for plant: ");
        System.out.println(priceoneWheatSeedsPlant+"$ for one Wheat Seed");
        System.out.println(priceoneOatSeedPlant+"$ for one Oat Seed");
        System.out.println(priceoneCornSeedPlant+"$ for one Corn Seed");
        System.out.println(priceonePotatoSeedPlant+"$ for one Potato Seed");
        System.out.println(priceoneAppleTreeSeedPlant+"$ for one Apple Tree");
        System.out.println();
        System.out.println();

        System.out.println("What do you want to plant: ");
        System.out.println("1. Wheat Seeds. ("+WheatSeedsize+" - you have) // (One seed needs - "+oneWheatSeedsPlaceNeeded+" place to plant.)"+"/(To plant all seeds you need "+oneWheatSeedsPlaceNeeded*WheatSeedsize+" hectares)");
        System.out.println("2. Oat Seeds. ("+OatSeedsize+" - you have) // (One seed needs - "+oneOatSeedPlaceNeeded+" place to plant.)"+"/(To plant all seeds you need "+oneOatSeedPlaceNeeded*OatSeedsize+" hectares)");
        System.out.println("3. Corn Seeds. ("+CornSeedsize+" - you have) // (One seed needs - "+oneCornSeedPlaceNeeded+" place to plant.)"+"/(To plant all seeds you need "+oneCornSeedPlaceNeeded*CornSeedsize+" hectares)");
        System.out.println("4. Potato Seeds. ("+PotatoSeedsize+" - you have) // (One seed needs - "+onePotatoSeedPlaceNeeded+" place to plant.)"+"/(To plant all seeds you need "+onePotatoSeedPlaceNeeded*PotatoSeedsize+" hectares)");
        System.out.println("5. Apple tree Seeds. ("+AppleTreeSeedsize+" - you have) // (One seed needs - "+oneAppleTreeSeedPlaceNeeded+" place to plant.)"+"/(To plant all seeds you need "+oneAppleTreeSeedPlaceNeeded*AppleTreeSeedsize+" hectares)");

        System.out.println("0. Exit");
        System.out.println();
        System.out.println("I choose number: ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();




        if (choose == 1){
            System.out.println("How many seeds you want to use: ");
            System.out.println("I want to plant: ");
            int choose1 = in.nextInt();

            int tempPriceForPlant = choose1*priceoneWheatSeedsPlant;
            double tempPlaceForPlant = choose1*oneWheatSeedsPlaceNeeded;
            if (playerCash >= tempPriceForPlant){

                if(playerHectares >= tempPlaceForPlant){

//plant
                    WheatSeedsPlant = 1;
                    howManySeeds = choose1;
                    howManyHectaresUsed = tempPlaceForPlant;


                } else {
                    System.out.println("You dont have enough hectares for plant.");
                }

            } else {
                System.out.println("You dont have enough money for plant it.");
            }
        }
        else if (choose == 2){
            System.out.println("How many seeds you want to use: ");
            System.out.println("I want to plant: ");
            int choose1 = in.nextInt();

            int tempPriceForPlant = choose1*priceoneOatSeedPlant;
            double tempPlaceForPlant = choose1*oneOatSeedPlaceNeeded;

            if (playerCash >= tempPriceForPlant){

                if(playerHectares >= tempPlaceForPlant){

                    OatSeedPlant = 1;
                    howManySeeds = choose1;
                    howManyHectaresUsed = tempPlaceForPlant;

                } else {
                    System.out.println("You dont have enough hectares for plant.");
                }

            } else {
                System.out.println("You dont have enough money for plant it.");
            }
        }
        else if (choose == 3){
            System.out.println("How many seeds you want to use: ");
            System.out.println("I want to plant: ");
            int choose1 = in.nextInt();

            int tempPriceForPlant = choose1*priceoneCornSeedPlant;
            double tempPlaceForPlant = choose1*oneCornSeedPlaceNeeded;

            if (playerCash >= tempPriceForPlant){

                if(playerHectares >= tempPlaceForPlant){

                    // plant
                    CornSeedPlant = 1;
                    howManySeeds = choose1;
                    howManyHectaresUsed = tempPlaceForPlant;

                } else {
                    System.out.println("You dont have enough hectares for plant.");
                }

            } else {
                System.out.println("You dont have enough money for plant it.");
            }
        }
        else if (choose == 4){
            System.out.println("How many seeds you want to use: ");
            System.out.println("I want to plant: ");
            int choose1 = in.nextInt();

            int tempPriceForPlant = choose1*priceonePotatoSeedPlant;
            double tempPlaceForPlant = choose1*onePotatoSeedPlaceNeeded;

            if (playerCash >= tempPriceForPlant){

                if(playerHectares >= tempPlaceForPlant){

                    // plant
                    PotatoSeedPlant = 1;
                    howManySeeds = choose1;
                    howManyHectaresUsed = tempPlaceForPlant;

                } else {
                    System.out.println("You dont have enough hectares for plant.");
                }

            } else {
                System.out.println("You dont have enough money for plant it.");
            }
        }
        else if (choose == 5){
            System.out.println("How many seeds you want to use: ");
            System.out.println("I want to plant: ");
            int choose1 = in.nextInt();

            int tempPriceForPlant = choose1*priceoneAppleTreeSeedPlant;
            double tempPlaceForPlant = choose1*oneAppleTreeSeedPlaceNeeded;

            if (playerCash >= tempPriceForPlant){

                if(playerHectares >= tempPlaceForPlant){

                    // plant
                    AppleTreeSeedPlant = 1;
                    howManySeeds = choose1;
                    howManyHectaresUsed = tempPlaceForPlant;

                } else {
                    System.out.println("You dont have enough hectares for plant.");
                }

            } else {
                System.out.println("You dont have enough money for plant it.");
            }
        }




        else if (choose == 0){
            return;
        }
        else {
            System.out.println("Please dont test my app.");
        }
    }


    public static int getHowManySeeds(){ return howManySeeds; }
    public static double getHowManyHectaresUsed() { return howManyHectaresUsed; }
    public static int getFinalPrice() {return finalPrice;}

    public static int getWheatSeedsPlant() {return WheatSeedsPlant;}
    public static int getOatSeedPlant() {return OatSeedPlant;}
    public static int getCornSeedPlant() {return CornSeedPlant;}
    public static int getPotatoSeedPlant() {return PotatoSeedPlant;}
    public static int getAppleTreeSeedPlant() {return AppleTreeSeedPlant;}



}
