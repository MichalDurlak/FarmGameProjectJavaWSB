package com.company;

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

        System.out.println("Your animals: "+player.animals + "(Max. "+player.animalsMaxSize+") ");
        System.out.println("Your buildings: "+player.buildings+ "(Max. "+player.buildingsMaxSize+") ");
        System.out.println("Your seeds: "+player.seeds+". "+ "(Max. "+player.seedsMaxSize+") ");
        System.out.println("     ****************************************");

        int playerChose = menu(numberOfWeek,numberOfYear);

        while(playerChose!=0){
            switch(playerChose){
                case 1:

                    System.out.println("     ****************************************");
                    System.out.println("Your balance: "+ player.getCash()+"$");
                    System.out.println("Your farmland: "+ player.getFarmland()+" hectare");

                    System.out.println("Your animals: "+player.animals + "(Max. "+player.animalsMaxSize+") ");
                    System.out.println("Your buildings: "+player.buildings+ "(Max. "+player.buildingsMaxSize+") ");
                    System.out.println("Your seeds: "+player.seeds+". "+ "(Max. "+player.seedsMaxSize+") ");
                    System.out.println("     ****************************************");
                    break;

                case 2:

                    int maxSeedsThatCanBuy = player.seedsMaxSize-player.seeds;

                    Market.Marketplace(player.getCash(),maxSeedsThatCanBuy);


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
                        player.smallCowAnimal.add(tempnumberOfWeeknumberOfYear);
//                        for ( int j=0; j<player.smallCowAnimal.size(); j++ ) System.out.println("element " + j + ": " + player.smallCowAnimal.get(j) );

                    } else if(gettempsmallChickenAnimal()==1){
                        player.smallChickenAnimal.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempsmallHorseAnimal()==1){
                        player.smallHorseAnimal.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempsmallDogAnimal()==1){
                        player.smallDogAnimal.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempbigChickenAnimal()==1){
                        player.bigChickenAnimal.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempbigDogAnimal()==1){
                        player.bigDogAnimal.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempbigCowAnimal()==1){
                        player.bigCowAnimal.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempbigHorseAnimal()==1){
                        player.bigHorseAnimal.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempWheatSeed()==1){
                        player.WheatSeed.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempOatSeed()==1){
                        player.OatSeed.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempCornSeed()==1){
                        player.CornSeed.add(tempnumberOfWeeknumberOfYear);
                    }else if(gettempPotatoSeed()==1){
                        player.PotatoSeed.add(tempnumberOfWeeknumberOfYear);
                    }else {
                        System.out.println("Please dont do that...");
                    }

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
                    System.out.println("Actual Wheat Seeds: "+ player.getWheatSeedsPlayer()+" (Max: "+ player.getMaxWheatSeedsPlayer()+")");
                    System.out.println("Actual Oat Seeds: "+ player.getOatSeedsPlayer()+" (Max: "+ player.getMaxOatSeedsPlayer()+")");

                    System.out.println("Actual Oat Seeds: "+ player.getCornSeedsPlayer()+" (Max: "+ player.getMaxCornSeedsPlayer()+")");
                    System.out.println("Actual Oat Seeds: "+ player.getPotatoSeedsPlayer()+" (Max: "+ player.getMaxPotatoSeedsPlayer()+")");


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
