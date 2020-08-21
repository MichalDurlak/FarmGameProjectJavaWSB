package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static com.company.BuildBuildings.*;
import static com.company.Farmland.*;
import static com.company.Market.*;

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
        System.out.println("     ****************************************");
        System.out.println("Your balance: "+ player.getCash()+"$");
        System.out.println("Your farmland: "+ player.getFarmland()+" hectare");

        System.out.println("Your animals: "+player.animals + "(Free slots: "+player.animalsMaxSize+") ");
        System.out.println("Your buildings: "+player.buildings+ "(Free slots: "+player.buildingsMaxSize+") ");
        System.out.println("Your seeds: "+player.seeds+". "+ "(Free slots:  "+player.seedsMaxSize+") ");
        System.out.println("     ****************************************");

        int playerChose = menu(numberOfWeek,numberOfYear);


        while(playerChose!=0){
            switch(playerChose){
                case 1:

                    System.out.println("     ****************************************");
                    System.out.println("Your balance: "+ player.getCash()+"$");
                    System.out.println("Your farmland: "+ player.getFarmland()+" hectare");

                    System.out.println("Your animals: "+player.animals + "(Free slots:  "+player.animalsMaxSize+") ");
                    System.out.println("Your buildings: "+player.buildings+ "(Free slots:  "+player.buildingsMaxSize+") ");
                    System.out.println("Your seeds: "+player.seeds+". "+ "(Free slots:  "+player.seedsMaxSize+") ");
                    System.out.println("     ****************************************");
                    System.out.println("You have: "+player.smallChickenAnimal.size()+" small chickens");
                    System.out.println("You have: "+player.smallDogAnimal.size()+" small dogs");
                    System.out.println("You have: "+player.smallCowAnimal.size()+" small cows");
                    System.out.println("You have: "+player.smallHorseAnimal.size()+" small horses");

                    System.out.println("You have: "+player.bigChickenAnimal.size()+" big chickens");
                    System.out.println("You have: "+player.bigDogAnimal.size()+" big dogs");
                    System.out.println("You have: "+player.bigCowAnimal.size()+" big cows");
                    System.out.println("You have: "+player.bigHorseAnimal.size()+" big horses");


                    System.out.println("     ****************************************");
                    break;

                case 2:

                    int maxSeedsThatCanBuy = player.seedsMaxSize-player.seeds;
                    int maxAnimalsThatCanBuy = player.animalsMaxSize;
                    Market.Marketplace(player.getCash(),maxSeedsThatCanBuy,maxAnimalsThatCanBuy);


                    int sellTempPlusCash = getPriceTempSell();
                    int buyTempMinusCash = getpriceTempBuy();

                    int toChangePlayerCashPlus = player.getCash()+sellTempPlusCash;
                    int toChangePlayerCashMinus = player.getCash()-buyTempMinusCash;

                    player.setCash(toChangePlayerCashPlus);
                    player.setCash(toChangePlayerCashMinus);

                    int numberAnimalTemp = getAnimalTempNumber();
                    player.animals = player.animals+numberAnimalTemp;

                    int numberSeedsTemp = getseedsTempNumber();
                    player.seeds = player.seeds + numberSeedsTemp;

                    String tempnumberOfWeeknumberOfYear = numberOfWeek + ", "+numberOfYear;


                    if(gettempsmallCowAnimal()==1){
                        int smallCowTimeGrowUp = 2;
                        player.smallCowAnimal.add(smallCowTimeGrowUp);
                        player.animalsMaxSize -=1;
//                        for ( int j=0; j<player.smallCowAnimal.size(); j++ ) System.out.println("element " + j + ": " + player.smallCowAnimal.get(j) );

                    }
                    else if(gettempsmallChickenAnimal()==1){
                        int smallChickenTimeGrowUp = 2;
                        player.smallChickenAnimal.add(smallChickenTimeGrowUp);
                        player.animalsMaxSize -=1;

                    }
                    else if(gettempsmallHorseAnimal()==1){
                        int smallHorseTimeGrowUp = 2;
                        player.smallHorseAnimal.add(smallHorseTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempsmallDogAnimal()==1){
                        int smallDogTimeGrowUp = 2;
                        player.smallDogAnimal.add(smallDogTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigChickenAnimal()==1){
                        int bigChickenTimeGrowUp = 2;
                        player.bigChickenAnimal.add(bigChickenTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigDogAnimal()==1){
                        int bigDogTimeGrowUp = 2;
                        player.bigDogAnimal.add(bigDogTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigCowAnimal()==1){
                        int bigCowTimeGrowUp = 2;
                        player.bigCowAnimal.add(bigCowTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigHorseAnimal()==1){
                        int bigHorseTimeGrowUp = 2;
                        player.bigHorseAnimal.add(bigHorseTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempWheatSeed()==1){
                        int WheatTimeGrowUp = 2;
                        player.WheatSeed.add(WheatTimeGrowUp);
                    }
                    else if(gettempOatSeed()==1){
                        int OatTimeGrowUp = 2;
                        player.OatSeed.add(OatTimeGrowUp);
                    }
                    else if(gettempCornSeed()==1){
                        int CornTimeGrowUp = 2;
                        player.CornSeed.add(CornTimeGrowUp);
                    }
                    else if(gettempPotatoSeed()==1){
                        int PotatoTimeGrowUp = 2;
                        player.PotatoSeed.add(PotatoTimeGrowUp);
                    }
//                    else {
//                        System.out.println("Please dont do that...");
//                    }

                    break;

                case 3:
                    Farmland.buyFarmland(player.getCash());

                    player.setCash(player.getCash()-placePriceTemp);
                    player.setFarmland(player.getFarmland()+placeSizeTemp);

                    player.seedsMaxSize = player.seedsMaxSize+placeForSeedsTemp;
                    player.buildingsMaxSize = player.buildingsMaxSize+placeForBuildingsTemp;
//                    player.animalsMaxSize = player.animalsMaxSize +placeForAnimalTemp;


                    break;

                case 4:

                    buildBuildings(player.getCash(),player.buildingsMaxSize);

                    int tempPriceOfCowshed = getTempPriceBuilding();
                    int tempSizeOfCowshed = getTempSizeofCowshed();
                    int tempMaxSizeOfBuildings = getTempMaxSizeBuildings();

                    player.setCash(player.getCash()-tempPriceOfCowshed);
                    player.buildings += tempMaxSizeOfBuildings;
                    player.buildingsMaxSize -= tempMaxSizeOfBuildings;
                    player.animalsMaxSize += tempSizeOfCowshed;
                    break;



                case 8:
                    System.out.println("  YOUR BACKPACK   ****************************************");
                    System.out.println("Actual Wheat Seeds: "+ player.WheatSeed.size()+" (Max: "+ player.getMaxWheatSeedsPlayer()+")");
                    System.out.println("Actual Oat Seeds: "+ player.OatSeed.size()+" (Max: "+ player.getMaxOatSeedsPlayer()+")");

                    System.out.println("Actual Oat Seeds: "+ player.CornSeed.size()+" (Max: "+ player.getMaxCornSeedsPlayer()+")");
                    System.out.println("Actual Oat Seeds: "+ player.PotatoSeed.size()+" (Max: "+ player.getMaxPotatoSeedsPlayer()+")");

                    System.out.println("     ****************************************");


                    break;

                case 9:
                    if (numberOfWeek >= 52){
                        numberOfWeek = 1;
                        numberOfYear = numberOfYear +1;
                    } else{
                        numberOfWeek = numberOfWeek+1;
                    }

           // END GAME  Player.checkEndGame(player.getFarmland(),player.animals,player.seeds);
                    Farmland.setAlreadyOpenShopFarmland();
                    Market.setAlreadyOpenShop();
                    BuildBuildings.setAlreadyOpenBuildBuildings();

// MINUS -1 do wieku
                    for ( int j=0; j<player.smallChickenAnimal.size(); j++ ){

                        int temp = player.smallChickenAnimal.get(j);

                        temp -= 1;
                        player.smallChickenAnimal.remove(j);
                        player.smallChickenAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.smallDogAnimal.size(); j++ ){

                        int temp = player.smallDogAnimal.get(j);

                        temp -= 1;
                        player.smallDogAnimal.remove(j);
                        player.smallDogAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.smallCowAnimal.size(); j++ ){

                        int temp = player.smallCowAnimal.get(j);

                        temp -= 1;
                        player.smallCowAnimal.remove(j);
                        player.smallCowAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.smallHorseAnimal.size(); j++ ){

                        int temp = player.smallHorseAnimal.get(j);

                        temp -= 1;
                        player.smallHorseAnimal.remove(j);
                        player.smallHorseAnimal.add(j,temp);

                    }

                    for ( int j=0; j<player.WheatSeed.size(); j++ ){

                        int temp = player.WheatSeed.get(j);

                        temp -= 1;
                        player.WheatSeed.remove(j);
                        player.WheatSeed.add(j,temp);

                    }
                    for ( int j=0; j<player.OatSeed.size(); j++ ){

                        int temp = player.OatSeed.get(j);

                        temp -= 1;
                        player.OatSeed.remove(j);
                        player.OatSeed.add(j,temp);

                    }
                    for ( int j=0; j<player.CornSeed.size(); j++ ){

                        int temp = player.CornSeed.get(j);

                        temp -= 1;
                        player.CornSeed.remove(j);
                        player.CornSeed.add(j,temp);

                    }
                    for ( int j=0; j<player.PotatoSeed.size(); j++ ){

                        int temp = player.PotatoSeed.get(j);

                        temp -= 1;
                        player.PotatoSeed.remove(j);
                        player.PotatoSeed.add(j,temp);

                    }

// DODAWANIE +1 do wieku

                    for ( int j=0; j<player.bigChickenAnimal.size(); j++ ){

                        int temp = player.bigChickenAnimal.get(j);

                        temp += 1;
                        player.bigChickenAnimal.remove(j);
                        player.bigChickenAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.bigDogAnimal.size(); j++ ){

                        int temp = player.bigDogAnimal.get(j);

                        temp += 1;
                        player.bigDogAnimal.remove(j);
                        player.bigDogAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.bigCowAnimal.size(); j++ ){

                        int temp = player.bigCowAnimal.get(j);

                        temp += 1;
                        player.bigCowAnimal.remove(j);
                        player.bigCowAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.bigHorseAnimal.size(); j++ ){

                        int temp = player.bigHorseAnimal.get(j);

                        temp += 1;
                        player.bigHorseAnimal.remove(j);
                        player.bigHorseAnimal.add(j,temp);

                    }


 // Check wieku jesli 0 to dopisz do bigcowanimal
                    for ( int j=0; j<player.smallChickenAnimal.size(); j++ ){if(player.smallChickenAnimal.get(j) == 0){player.bigChickenAnimal.add(2);}}
                    for ( int j=0; j<player.smallDogAnimal.size(); j++ ){if(player.smallDogAnimal.get(j) == 0){player.bigDogAnimal.add(2);}}
                    for ( int j=0; j<player.smallCowAnimal.size(); j++ ){if(player.smallCowAnimal.get(j) == 0){player.bigCowAnimal.add(2);}}
                    for ( int j=0; j<player.smallHorseAnimal.size(); j++ ){if(player.smallHorseAnimal.get(j) == 0){player.bigHorseAnimal.add(2);}}

// jesli 0 usun z array
                    for ( int j=0; j<player.smallChickenAnimal.size(); j++ ){if (player.smallChickenAnimal.get(j) == 0) {player.smallChickenAnimal.remove(j);}}
                    for ( int j=0; j<player.smallDogAnimal.size(); j++ ){if (player.smallDogAnimal.get(j) == 0) {player.smallDogAnimal.remove(j);}}
                    for ( int j=0; j<player.smallCowAnimal.size(); j++ ){if (player.smallCowAnimal.get(j) == 0) {player.smallCowAnimal.remove(j);}}
                    for ( int j=0; j<player.smallHorseAnimal.size(); j++ ){if (player.smallHorseAnimal.get(j) == 0) {player.smallHorseAnimal.remove(j);}}

                    break;

            }

            playerChose = menu(numberOfWeek,numberOfYear);

        }

        System.out.println("     ****************************************");
        System.out.println("\n Good bye "+ namePlayerScan +".");
        System.out.println("     ****************************************");



    }



    public static int menu(int numberOfWeek, int numberOfYear){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("Actual Date: "+numberOfWeek+" week. Year "+numberOfYear);
        System.out.println("*                 MENU                 *");
        System.out.println("     1. Check stats.");
        System.out.println("     2. Go to marketplace. ");
        System.out.println("     3. Buy farmland. ");
        System.out.println("     4. Build buildings. ");
        System.out.println("     8. Check backpack. ");
        System.out.println("     9. Next week.");
        System.out.println("     0. Exit Game.");
        System.out.println("My Choice: ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();

        return choose;

    }




}
