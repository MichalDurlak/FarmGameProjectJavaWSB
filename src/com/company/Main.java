package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.BuildBuildings.*;
import static com.company.Farmland.*;
import static com.company.Market.*;
import static com.company.UseSeeds.*;


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
        System.out.println("Your storage size: "+player.foodForAnimals+" "+ "(Free size:  "+player.maxStorageFoodForAnimals+") "+"(You need: "+player.getfoodForWeek()+" food for this week.)");
        System.out.println("     ****************************************");

        int playerChose = menu(numberOfWeek,numberOfYear);


        while(playerChose!=0){
            switch(playerChose){
                case 1:
                    player.setFoodForWeek(player.smallChickenAnimal.size(),player.smallDogAnimal.size(),player.smallCowAnimal.size(),player.smallHorseAnimal.size(),player.smallRabbitAnimal.size(),player.bigChickenAnimal.size(),player.bigDogAnimal.size(),player.bigCowAnimal.size(),player.bigHorseAnimal.size(),player.bigRabbitAnimal.size());
                    player.countAnimals();
                    System.out.println("     ****************************************");
                    System.out.println("Your balance: "+ player.getCash()+"$");
                    System.out.println("Your farmland: "+ player.getFarmland()+" hectare");

                    System.out.println("Your animals: "+player.animals + "(Free slots:  "+player.animalsMaxSize+") ");
                    System.out.println("Your buildings: "+player.buildings+ "(Free slots:  "+player.buildingsMaxSize+") ");
                    System.out.println("Your seeds: "+player.seeds+" "+ "(Free slots:  "+player.seedsMaxSize+") ");
                    System.out.println("Your storage size: "+player.foodForAnimals+" "+ "(Free size:  "+player.maxStorageFoodForAnimals+") "+"(You need: "+player.getfoodForWeek()+" food for this week.)");
                    System.out.println("     ****************************************");
                    System.out.println("You have: "+player.smallChickenAnimal.size()+" small chickens");
                    System.out.println("You have: "+player.smallDogAnimal.size()+" small dogs");
                    System.out.println("You have: "+player.smallCowAnimal.size()+" small cows");
                    System.out.println("You have: "+player.smallHorseAnimal.size()+" small horses");
                    System.out.println("You have: "+player.smallRabbitAnimal.size()+" small rabbits");

                    System.out.println("You have: "+player.bigChickenAnimal.size()+" big chickens");
                    System.out.println("You have: "+player.bigDogAnimal.size()+" big dogs");
                    System.out.println("You have: "+player.bigCowAnimal.size()+" big cows");
                    System.out.println("You have: "+player.bigHorseAnimal.size()+" big horses");
                    System.out.println("You have: "+player.bigRabbitAnimal.size()+" big rabbits");

                    System.out.println("     ****************************************");
                    break;

                case 2:

                    int maxSeedsThatCanBuy = player.seedsMaxSize-player.seeds;
                    int maxAnimalsThatCanBuy = player.animalsMaxSize;

                    int sizesmallChickenAnimal = player.smallChickenAnimal.size();
                    int sizesmallDogAnimal = player.smallDogAnimal.size();
                    int sizesmallCowAnimal = player.smallCowAnimal.size();
                    int sizesmallHorseAnimal = player.smallHorseAnimal.size();
                    int sizesmallRabbitAnimal = player.smallRabbitAnimal.size();
                    int sizebigChickenAnimal = player.bigChickenAnimal.size();
                    int sizebigDogAnimal = player.bigDogAnimal.size();
                    int sizebigCowAnimal = player.bigCowAnimal.size();
                    int sizebigHorseAnimal = player.bigHorseAnimal.size();
                    int sizebigRabbitsAnimal = player.bigRabbitAnimal.size();




                    Market.Marketplace(player.getCash(),maxAnimalsThatCanBuy,sizesmallChickenAnimal,sizesmallDogAnimal,sizesmallCowAnimal,sizesmallHorseAnimal,sizebigChickenAnimal,sizebigDogAnimal,sizebigCowAnimal,sizebigHorseAnimal,player.wheatSeedsPlayer,player.oatSeedsPlayer,player.cornSeedsPlayer,player.potatoSeedsPlayer,player.appleTreeSeedsPlayer,sizesmallRabbitAnimal,sizebigRabbitsAnimal,player.maxStorageFoodForAnimals,player.foodForAnimals);

                  if(getPriceTempSell()>0){
                      System.out.println("SELL: ");
                      System.out.println(player.getCash());
                      player.setCash(player.getCash()+getPriceTempSell());
                      System.out.println(player.getCash());
                 } else if (getpriceTempBuy()>0){
                      System.out.println("BUY: ");
                      System.out.println(player.getCash());
                     player.setCash(player.getCash()-getpriceTempBuy());
                     System.out.println(player.getCash());
                 }



                    int numberAnimalTemp = getAnimalTempNumber();
                    player.animals = player.animals+numberAnimalTemp;

                    int numberSeedsTemp = getseedsTempNumber();
                    player.seeds = player.seeds + numberSeedsTemp;



//buy
                    if(gettempsmallCowAnimal()==1){
                        int smallCowTimeGrowUp = 25;
                        player.smallCowAnimal.add(smallCowTimeGrowUp);
                        player.animalsMaxSize -=1;
//                        for ( int j=0; j<player.smallCowAnimal.size(); j++ ) System.out.println("element " + j + ": " + player.smallCowAnimal.get(j) );

                    }
                    else if(gettempsmallChickenAnimal()==1){
                        int smallChickenTimeGrowUp = 20;
                        player.smallChickenAnimal.add(smallChickenTimeGrowUp);
                        player.animalsMaxSize -=1;

                    }
                    else if(gettempsmallHorseAnimal()==1){
                        int smallHorseTimeGrowUp = 15;
                        player.smallHorseAnimal.add(smallHorseTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempsmallDogAnimal()==1){
                        int smallDogTimeGrowUp = 10;
                        player.smallDogAnimal.add(smallDogTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempsmallRabbitAnimal()==1){
                        int smallRabbitTimeGrowUp = 13;
                        player.smallRabbitAnimal.add(smallRabbitTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigChickenAnimal()==1){
                        int bigChickenTimeGrowUp = 20;
                        player.bigChickenAnimal.add(bigChickenTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigDogAnimal()==1){
                        int bigDogTimeGrowUp = 10;
                        player.bigDogAnimal.add(bigDogTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigCowAnimal()==1){
                        int bigCowTimeGrowUp = 25;
                        player.bigCowAnimal.add(bigCowTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigHorseAnimal()==1){
                        int bigHorseTimeGrowUp = 15;
                        player.bigHorseAnimal.add(bigHorseTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempbigRabbitsAnimal()==1){
                        int bigRabbitsTimeGrowUp = 13;
                        player.bigRabbitAnimal.add(bigRabbitsTimeGrowUp);
                        player.animalsMaxSize -=1;
                    }
                    else if(gettempWheatSeed()==1){
                        player.wheatSeedsPlayer +=1;
                    }
                    else if(gettempOatSeed()==1){
                        player.oatSeedsPlayer +=1;
                    }
                    else if(gettempCornSeed()==1){
                        player.cornSeedsPlayer +=1;
                    }
                    else if(gettempPotatoSeed()==1){
                        player.potatoSeedsPlayer +=1;
                    }
                    else if(gettempAppleTreeSeed()==1){
                        player.appleTreeSeedsPlayer +=1;
                    }
                    else if(gettempFoodForAnimal()==1){
                        player.maxStorageFoodForAnimals -=1;
                        player.foodForAnimals +=1;

                    }


//sell
                    else if(gettempsmallCowAnimal()==-1){
                        player.smallCowAnimal.remove(player.smallCowAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
//                        for ( int j=0; j<player.smallCowAnimal.size(); j++ ) System.out.println("element " + j + ": " + player.smallCowAnimal.get(j) );

                    }
                    else if(gettempsmallChickenAnimal()==-1){
                        player.smallChickenAnimal.remove(player.smallChickenAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;

                    }
                    else if(gettempsmallHorseAnimal()==-1){
                        player.smallHorseAnimal.remove(player.smallHorseAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }
                    else if(gettempsmallDogAnimal()==-1){
                        player.smallDogAnimal.remove(player.smallDogAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }
                    else if(gettempsmallRabbitAnimal()==-1){

                        player.smallRabbitAnimal.remove(player.smallRabbitAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }

                    else if(gettempbigChickenAnimal()==-1){
                        player.bigChickenAnimal.remove(player.bigChickenAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }
                    else if(gettempbigDogAnimal()==-1){
                        player.bigDogAnimal.remove(player.bigDogAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }
                    else if(gettempbigCowAnimal()==-1){
                        player.bigCowAnimal.remove(player.bigCowAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }
                    else if(gettempbigHorseAnimal()==-1){
                        player.bigHorseAnimal.remove(player.bigHorseAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }
                    else if(gettempbigRabbitsAnimal()==-1){
                        player.bigRabbitAnimal.remove(player.bigRabbitAnimal.size()-1);
                        player.animalsMaxSize +=1;

                        player.animals -=1;
                    }
                    else if(gettempFoodForAnimal()==-1){
                        player.maxStorageFoodForAnimals +=1;
                        player.foodForAnimals -=1;

                    }

                    player.setFoodForWeek(player.smallChickenAnimal.size(),player.smallDogAnimal.size(),player.smallCowAnimal.size(),player.smallHorseAnimal.size(),player.smallRabbitAnimal.size(),player.bigChickenAnimal.size(),player.bigDogAnimal.size(),player.bigCowAnimal.size(),player.bigHorseAnimal.size(),player.bigRabbitAnimal.size());
                    player.countAnimals();
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


                    int tempSizeOfStorage = getTempSizeofStorage();


                    player.setCash(player.getCash()-tempPriceOfCowshed);
                    player.buildings += tempMaxSizeOfBuildings;
                    player.buildingsMaxSize -= tempMaxSizeOfBuildings;
                    player.animalsMaxSize += tempSizeOfCowshed;
                    player.maxStorageFoodForAnimals += tempSizeOfStorage;


                    break;
                case 5:

                    useSeeds(player.wheatSeedsPlayer,player.oatSeedsPlayer,player.cornSeedsPlayer,player.potatoSeedsPlayer,player.appleTreeSeedsPlayer,player.getCash(),player.getFarmland());

                    int getHowManySeeds = getHowManySeeds();
                    double getHowManyHectaresUsed = getHowManyHectaresUsed();
                    int getFinalPrice = getFinalPrice();

                    int getWheatSeedsPlant=getWheatSeedsPlant();
                    int getOatSeedPlant=getOatSeedPlant();
                    int getCornSeedPlant=getCornSeedPlant();
                    int getPotatoSeedPlant=getPotatoSeedPlant();
                    int getAppleTreeSeedPlant=getAppleTreeSeedPlant();


                    player.setCash(player.getCash()-getFinalPrice);
                    player.MaxHectaresUsed +=getHowManyHectaresUsed;

                    player.wheatSeedsPlayer -= getHowManySeeds*getWheatSeedsPlant;
                    player.oatSeedsPlayer -= getHowManySeeds*getOatSeedPlant;
                    player.cornSeedsPlayer -=getHowManySeeds *getCornSeedPlant;
                    player.potatoSeedsPlayer -= getHowManySeeds*getPotatoSeedPlant;
                    player.appleTreeSeedsPlayer -= getHowManySeeds *getAppleTreeSeedPlant;


                    if(getWheatSeedsPlant==1){
                        for (int j=0;j>=getHowManySeeds;j++){
                            int timeGrowingUpWheat = 40;

                            player.wheatNeedGrowUp.add(timeGrowingUpWheat);

                        }

                    }
                    else if(getOatSeedPlant==1){
                        for (int j=0;j>=getHowManySeeds;j++){
                            int timeGrowingUpOat = 25;

                            player.oatNeedGrowUp.add(timeGrowingUpOat);

                        }

                    }
                    else if(getCornSeedPlant==1){
                        for (int j=0;j>=getHowManySeeds;j++){
                            int timeGrowingUpCorn = 60;

                            player.cornNeedGrowUp.add(timeGrowingUpCorn);

                        }

                    }
                    else if(getPotatoSeedPlant==1){
                        for (int j=0;j>=getHowManySeeds;j++){
                            int timeGrowingUpPotato = 80;

                            player.potatoNeedGrowUp.add(timeGrowingUpPotato);

                        }

                    }
                    else if(getAppleTreeSeedPlant==1){
                        for (int j=0;j>=getHowManySeeds;j++){
                            int timeGrowingUpAppleTree = 120;

                            player.appleNeedGrowUp.add(timeGrowingUpAppleTree);

                        }


                    }


                    break;


                case 8:
                    System.out.println("  YOUR BACKPACK   ****************************************");
                    System.out.println("Actual Wheat Seeds: "+ player.wheatSeedsPlayer);
                    System.out.println("Actual Oat Seeds: "+ player.oatSeedsPlayer);

                    System.out.println("Actual Oat Seeds: "+ player.cornSeedsPlayer);
                    System.out.println("Actual Oat Seeds: "+ player.potatoSeedsPlayer);
                    System.out.println("Actual Apple tree Seeds: "+ player.appleTreeSeedsPlayer);

                    System.out.println("     ****************************************");


                    break;

                case 9:
                    player.setFoodForWeek(player.smallChickenAnimal.size(),player.smallDogAnimal.size(),player.smallCowAnimal.size(),player.smallHorseAnimal.size(),player.smallRabbitAnimal.size(),player.bigChickenAnimal.size(),player.bigDogAnimal.size(),player.bigCowAnimal.size(),player.bigHorseAnimal.size(),player.bigRabbitAnimal.size());
                    // zabieranie jedzenia
                    player.animalsEatFood(player.getfoodForWeek());

                    if (numberOfWeek >= 52){
                        numberOfWeek = 1;
                        numberOfYear = numberOfYear +1;
                    } else{
                        numberOfWeek = numberOfWeek+1;
                    }

           // END GAME
                    // title = stage 15 - ending 2/3 resolved problem with animals size after selling / adding another end counting + add foodforanimalsYEAR

                    int endAnimalNumber =0;
                    player.countAnimals();


                    endAnimalNumber = player.rabbitEndSize+player.horseEndSize+player.cowEndSize+player.dogEndSize+player.chickenEndSize;
//                    System.out.println(endAnimalNumber);
                    Player.checkEndGame(player.getFarmland(),endAnimalNumber,player.getFoodForYear(),player.foodForAnimals);




                    Farmland.setAlreadyOpenShopFarmland();
                    Market.setAlreadyOpenShop();
                    BuildBuildings.setAlreadyOpenBuildBuildings();

            // Dodawanie dla gracza $$
                    ThreadLocalRandom random = ThreadLocalRandom.current();
                    int additionalToPlayerCash = 0;
                    additionalToPlayerCash = random.nextInt(1, 300);
                    additionalToPlayerCash += player.getCash();
                    player.setCash(additionalToPlayerCash);

            // Dodawanie dla gracza $$ za jajka i mleko

                    if (player.bigChickenAnimal.size()>0||player.bigCowAnimal.size()>0){
                        int tempmoneyformilk =0;
                        tempmoneyformilk += player.bigCowAnimal.size();

                        int tempmoneyformilkprice = 0;
                        tempmoneyformilkprice = random.nextInt(1, 10);
                        tempmoneyformilk *= tempmoneyformilkprice;

                        int tempmoneyforegg =0;
                        tempmoneyforegg += player.bigChickenAnimal.size();

                        int tempmoneyforeggsell = 0;
                        tempmoneyforeggsell = random.nextInt(3, 12);
                        tempmoneyforegg *= tempmoneyforeggsell;


                        player.setCash(player.getCash()+tempmoneyformilk+tempmoneyforegg);

            // rozmnazanie zwierzat
                        if (player.bigChickenAnimal.size()>=2){
                            int chanceForduplicateAnimal = 0;
                            chanceForduplicateAnimal = random.nextInt(1, 10);
                            if (chanceForduplicateAnimal<=4){
                                player.bigChickenAnimal.add(player.bigChickenAnimal.size()+1);
                            }
                        }
                        if (player.bigDogAnimal.size()>=2){
                            int chanceForduplicateAnimal = 0;
                            chanceForduplicateAnimal = random.nextInt(1, 10);
                            if (chanceForduplicateAnimal<=4){
                                player.bigDogAnimal.add(player.bigDogAnimal.size()+1);
                            }
                        }
                        if (player.bigCowAnimal.size()>=2){
                            int chanceForduplicateAnimal = 0;
                            chanceForduplicateAnimal = random.nextInt(1, 10);
                            if (chanceForduplicateAnimal<=3){
                                player.bigCowAnimal.add(player.bigCowAnimal.size()+1);
                            }
                        }
                        if (player.bigRabbitAnimal.size()>=2){
                            int chanceForduplicateAnimal = 0;
                            chanceForduplicateAnimal = random.nextInt(1, 10);
                            if (chanceForduplicateAnimal<=6){
                                player.bigRabbitAnimal.add(player.bigRabbitAnimal.size()+1);
                            }
                        }
                        if (player.bigHorseAnimal.size()>=2){
                            int chanceForduplicateAnimal = 0;
                            chanceForduplicateAnimal = random.nextInt(1, 10);
                            if (chanceForduplicateAnimal<=2){
                                player.bigHorseAnimal.add(player.bigHorseAnimal.size()+1);
                            }
                        }
                    }



// MINUS -1 do wieku
                    for ( int j=0; j<player.smallChickenAnimal.size(); j++ ){

                        int temp = player.smallChickenAnimal.get(j);

                        temp -= 1;
                        player.smallChickenAnimal.remove(j);
                        player.smallChickenAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.smallRabbitAnimal.size(); j++ ){

                        int temp = player.smallRabbitAnimal.get(j);

                        temp -= 1;
                        player.smallRabbitAnimal.remove(j);
                        player.smallRabbitAnimal.add(j,temp);

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



// DODAWANIE +1 do wieku

                    for ( int j=0; j<player.bigChickenAnimal.size(); j++ ){

                        int temp = player.bigChickenAnimal.get(j);

                        temp += 1;
                        player.bigChickenAnimal.remove(j);
                        player.bigChickenAnimal.add(j,temp);

                    }
                    for ( int j=0; j<player.bigRabbitAnimal.size(); j++ ){

                        int temp = player.bigRabbitAnimal.get(j);

                        temp += 1;
                        player.bigRabbitAnimal.remove(j);
                        player.bigRabbitAnimal.add(j,temp);

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
                    for ( int j=0; j<player.smallChickenAnimal.size(); j++ ){if(player.smallChickenAnimal.get(j) == 0){player.bigChickenAnimal.add(20);}}
                    for ( int j=0; j<player.smallDogAnimal.size(); j++ ){if(player.smallDogAnimal.get(j) == 0){player.bigDogAnimal.add(10);}}
                    for ( int j=0; j<player.smallCowAnimal.size(); j++ ){if(player.smallCowAnimal.get(j) == 0){player.bigCowAnimal.add(25);}}
                    for ( int j=0; j<player.smallHorseAnimal.size(); j++ ){if(player.smallHorseAnimal.get(j) == 0){player.bigHorseAnimal.add(15);}}
                    for ( int j=0; j<player.smallRabbitAnimal.size(); j++ ){if(player.smallRabbitAnimal.get(j) == 0){player.bigRabbitAnimal.add(13);}}
// jesli 0 usun z array
                    for ( int j=0; j<player.smallChickenAnimal.size(); j++ ){if (player.smallChickenAnimal.get(j) == 0) {player.smallChickenAnimal.remove(j);}}
                    for ( int j=0; j<player.smallDogAnimal.size(); j++ ){if (player.smallDogAnimal.get(j) == 0) {player.smallDogAnimal.remove(j);}}
                    for ( int j=0; j<player.smallCowAnimal.size(); j++ ){if (player.smallCowAnimal.get(j) == 0) {player.smallCowAnimal.remove(j);}}
                    for ( int j=0; j<player.smallHorseAnimal.size(); j++ ){if (player.smallHorseAnimal.get(j) == 0) {player.smallHorseAnimal.remove(j);}}
                    for ( int j=0; j<player.smallRabbitAnimal.size(); j++ ){if(player.smallRabbitAnimal.get(j) == 0){player.smallRabbitAnimal.remove(j);}}






                    break;




                case 10:
                    player.countAnimals();
                    player.setFoodForWeek(player.smallChickenAnimal.size(),player.smallDogAnimal.size(),player.smallCowAnimal.size(),player.smallHorseAnimal.size(),player.smallRabbitAnimal.size(),player.bigChickenAnimal.size(),player.bigDogAnimal.size(),player.bigCowAnimal.size(),player.bigHorseAnimal.size(),player.bigRabbitAnimal.size());
                    int endAnimalNumber1 = player.rabbitEndSize+player.horseEndSize+player.cowEndSize+player.dogEndSize+player.chickenEndSize;
                    System.out.println("     ****************************************");
                    System.out.println("To end game you need to collect these things: ");
                    System.out.println("Farmland size: " +player.endFarmlandSize+" (You have "+player.getFarmland()+" at this moment)");
                    System.out.println("Animal size: " +player.endAnimalsSize+" (You have "+endAnimalNumber1+" at this moment)");
                    System.out.println("Food for your animals: " +player.getFoodForYear()+" (You have "+player.foodForAnimals+" at this moment)");
                    System.out.println("XXXXXX Seeds size: " +player.endSeedsSize+" (You have "+player.getFarmland()+" at this moment) XXXXXX");

                    System.out.println("     ****************************************");
                    System.out.println();
                    break;
                case 98:
                    System.out.println(player.noFoodNoAnimal);
                    player.foodForAnimals = 10000;

                    break;
                case 99:
                    System.out.println("new stats");
                    player.setCash(100000000);
                    player.maxStorageFoodForAnimals = 10000;
                    player.buildingsMaxSize = 1000;
                    player.animalsMaxSize = 1000;

                    //
                    player.foodForAnimals = 5;

                    //
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
        System.out.println("     5. Plant seeds. ");
        System.out.println("     8. Check backpack. ");
        System.out.println("     9. Next week.");
        System.out.println("     10. End game tasks.");
        System.out.println("     99. Add ultra bonus stats.");
        System.out.println("     98. Add food for animals.");
        System.out.println("     0. Exit Game.");
        System.out.println("My Choice: ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();

        return choose;

    }




}
