package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.BuildBuildings.*;
import static com.company.Farmland.*;
import static com.company.HarvestCrops.*;
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
        System.out.println("Your farmland: "+ player.getFarmland()+" hectare" + "("+ player.MaxHectaresUsed + " hectares used)");

        System.out.println("Your animals: "+player.animals + "(Free slots: "+player.animalsMaxSize+") ");
        System.out.println("Your buildings: "+player.buildings+ "(Free slots: "+player.buildingsMaxSize+") ");
        System.out.println("Your seeds: "+player.seeds+". ");
        System.out.println("Your storage size: "+player.foodForAnimals+" "+ "(Free size:  "+player.maxStorageFoodForAnimals+") "+"(You need: "+player.getfoodForWeek()+" food for this week.)");
        System.out.println("     ****************************************");

        int playerChose = menu(numberOfWeek,numberOfYear);


        while(playerChose!=0){
            switch(playerChose){
                case 1:
                    player.setFoodForWeek(player.smallChickenAnimal.size(),player.smallDogAnimal.size(),player.smallCowAnimal.size(),player.smallHorseAnimal.size(),player.smallRabbitAnimal.size(),player.bigChickenAnimal.size(),player.bigDogAnimal.size(),player.bigCowAnimal.size(),player.bigHorseAnimal.size(),player.bigRabbitAnimal.size());
                    player.countAnimals();
                    //set price defense
                    player.setpriceForDefenseHectares(player.MaxHectaresUsed);


                    double tempToChange = player.getFarmland();
                    tempToChange = Math.round(tempToChange * 100);
                    tempToChange = tempToChange/100;
                    player.setFarmland(tempToChange);


                    System.out.println("     ****************************************");
                    System.out.println("Your balance: "+ player.getCash()+"$");
                    System.out.println("Your farmland: "+ player.getFarmland()+" hectare" + "("+ player.MaxHectaresUsed + " hectares used)");

                    System.out.println("Your animals: "+player.animals + "(Free slots:  "+player.animalsMaxSize+") ");
                    System.out.println("Your buildings: "+player.buildings+ "(Free slots:  "+player.buildingsMaxSize+") ");
                    System.out.println("Your seeds: "+player.seeds+". ");
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
                    System.out.println("Price for defense your farmland "+player.getPriceForDefenseHectares()+" (We will take it automatically to protect your farmland.)");
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




                    Market.Marketplace(player.getCash(),maxAnimalsThatCanBuy,sizesmallChickenAnimal,sizesmallDogAnimal,sizesmallCowAnimal,sizesmallHorseAnimal,sizebigChickenAnimal,sizebigDogAnimal,sizebigCowAnimal,sizebigHorseAnimal,player.wheatSeedsPlayer,player.oatSeedsPlayer,player.cornSeedsPlayer,player.potatoSeedsPlayer,player.appleTreeSeedsPlayer,sizesmallRabbitAnimal,sizebigRabbitsAnimal,player.maxStorageFoodForAnimals,player.foodForAnimals,player.potatoPlayer, player.applePlayer);

                  if(getPriceTempSell()>0){
//                      System.out.println("SELL: ");
//                      System.out.println(player.getCash());
                      player.setCash(player.getCash()+getPriceTempSell());
//                      System.out.println(player.getCash());
                 } else if (getpriceTempBuy()>0){
//                      System.out.println("BUY: ");
//                      System.out.println(player.getCash());
                     player.setCash(player.getCash()-getpriceTempBuy());
//                     System.out.println(player.getCash());
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
                    else if(gettempPotato()==1){
                        player.potatoPlayer +=1;

                    }
                    else if(gettempApple()==1){
                        player.applePlayer += 1;

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

                    else if(gettempPotato()==-1){
                        player.potatoPlayer -=1;

                    }
                    else if(gettempApple()==-1){
                        player.applePlayer -= 1;


                    }
                    else if(gettempWheatSeed()==-1){
                        player.wheatSeedsPlayer -=1;
                        player.seeds -=1;

                    }
                    else if(gettempOatSeed()==-1){
                        player.oatSeedsPlayer -=1;
                        player.seeds -=1;

                    }
                    else if(gettempCornSeed()==-1){
                        player.cornSeedsPlayer -=1;
                        player.seeds -=1;

                    }
                    else if(gettempPotatoSeed()==-1){
                        player.potatoSeedsPlayer -=1;
                        player.seeds -=1;
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


                    //set price defense
                    player.setpriceForDefenseHectares(player.MaxHectaresUsed);



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

                    player.seeds = player.wheatSeedsPlayer+player.oatSeedsPlayer+player.cornSeedsPlayer+player.potatoSeedsPlayer+player.appleTreeSeedsPlayer;

                    if(getWheatSeedsPlant==1){

                        for (int j=0;j<=getHowManySeeds-1;j++){
                            int timeGrowingUpWheat = 40;
                            player.wheatNeedGrowUp.add(timeGrowingUpWheat);


                        }

                    }
                    else if(getOatSeedPlant==1){

                        for (int j=0;j<=getHowManySeeds-1;j++){
                            int timeGrowingUpOat = 25;
                            player.oatNeedGrowUp.add(timeGrowingUpOat);

                        }

                    }
                    else if(getCornSeedPlant==1){

                        for (int j=0;j<=getHowManySeeds-1;j++){
                            int timeGrowingUpCorn = 60;

                            player.cornNeedGrowUp.add(timeGrowingUpCorn);

                        }

                    }
                    else if(getPotatoSeedPlant==1){

                        for (int j=0;j<=getHowManySeeds-1;j++){
                            int timeGrowingUpPotato = 80;

                            player.potatoNeedGrowUp.add(timeGrowingUpPotato);

                        }

                    }
                    else if(getAppleTreeSeedPlant==1){

                        for (int j=0;j<=getHowManySeeds-1;j++){
                            int timeGrowingUpAppleTree = 120;

                            player.appleNeedGrowUp.add(timeGrowingUpAppleTree);

                        }


                    }


                    break;

                case 6:

                    harvestCrops(player.wheatGrowedUp.size(),player.oatGrowedUp.size(),player.cornGrowedUp.size(),player.potatoGrowedUp.size(),player.appleGrowedUp.size());

                    int getHowManyToHarvest = getHowManyToHarvest();
                    int getfinalPriceforHarvest = getfinalPriceforHarvest();

                    player.setCash(player.getCash()-getfinalPriceforHarvest);
                    int getisitWheat = getisitWheat();
                    int getisitOat = getisitOat();
                    int getisitCorn = getisitCorn();
                    int getisitPotato = getisitPotato();
                    int getisitApple = getisitApple();

                    if (getisitWheat == 1){
                        int tempFoodForAnimal = getHowManyToHarvest*8;
                        player.foodForAnimals += tempFoodForAnimal;
                        double tempHectaresForThis = getHowManyToHarvest*0.18;
                        player.MaxHectaresUsed -=  tempHectaresForThis;
                    }

                    if (getisitOat == 1){
                        int tempFoodForAnimal = getHowManyToHarvest*15;
                        player.foodForAnimals += tempFoodForAnimal;

                        double tempHectaresForThis = getHowManyToHarvest*0.25;
                        player.MaxHectaresUsed -=  tempHectaresForThis;
                    }

                    if (getisitCorn == 1){
                        int tempFoodForAnimal = getHowManyToHarvest*12;
                        player.foodForAnimals += tempFoodForAnimal;

                        double tempHectaresForThis = getHowManyToHarvest*0.39;
                        player.MaxHectaresUsed -=  tempHectaresForThis;
                    }

                    if (getisitPotato == 1){
                        int tempPotato = getHowManyToHarvest*4;
                        player.potatoPlayer += tempPotato;

                        double tempHectaresForThis = getHowManyToHarvest*0.15;
                        player.MaxHectaresUsed -=  tempHectaresForThis;
                    }

                    if (getisitApple == 1){
                        int tempApple = getHowManyToHarvest*15;
                        player.applePlayer += tempApple;

                        double tempHectaresForThis = getHowManyToHarvest*0.54;
                        player.MaxHectaresUsed -=  tempHectaresForThis;
                    }

                    break;

                case 7:

                    player.checkHarvest();



                    break;
                case 8:
                    System.out.println("  YOUR BACKPACK   ****************************************");
                    System.out.println("Actual Wheat Seeds: "+ player.wheatSeedsPlayer);
                    System.out.println("Actual Oat Seeds: "+ player.oatSeedsPlayer);

                    System.out.println("Actual Corn Seeds: "+ player.cornSeedsPlayer);
                    System.out.println("Actual Potato Seeds: "+ player.potatoSeedsPlayer);
                    System.out.println("Actual Apple tree Seeds: "+ player.appleTreeSeedsPlayer);

                    System.out.println();
                    System.out.println("You have: "+ player.potatoPlayer + " potato.");
                    System.out.println("You have: "+ player.applePlayer + " apple.");
                    System.out.println("     ****************************************");


                    break;

                case 9:
                    player.setFoodForWeek(player.smallChickenAnimal.size(),player.smallDogAnimal.size(),player.smallCowAnimal.size(),player.smallHorseAnimal.size(),player.smallRabbitAnimal.size(),player.bigChickenAnimal.size(),player.bigDogAnimal.size(),player.bigCowAnimal.size(),player.bigHorseAnimal.size(),player.bigRabbitAnimal.size());
                    // zabieranie jedzenia
                    player.animalsEatFood(player.getfoodForWeek());
                    //set price defense
                    player.setpriceForDefenseHectares(player.MaxHectaresUsed);
                    if (numberOfWeek >= 52){
                        numberOfWeek = 1;
                        numberOfYear = numberOfYear +1;
                    } else{
                        numberOfWeek = numberOfWeek+1;
                    }

           // END GAME
                    // title = stage 15 - ending 2/3 resolved problem with animals size after selling / adding another end counting + add foodforanimalsYEAR

                    int endAnimalNumber,endSeedsNumber =0;
                    player.countAnimals();
                    player.countSeeds();


                    endAnimalNumber = player.rabbitEndSize+player.horseEndSize+player.cowEndSize+player.dogEndSize+player.chickenEndSize;
                    endSeedsNumber = player.wheatEndSize + player.oatEndSize + player.cornEndSize + player.potatoEndSize + player.appleEndSize;
//                    System.out.println(endAnimalNumber);
                    Player.checkEndGame(player.getFarmland(),endAnimalNumber,player.getFoodForYear(),player.foodForAnimals,endSeedsNumber);


                    //defense
                    player.defenseHectares(player.getCash(),player.getPriceForDefenseHectares());
                    if(player.defenseHectaresonoff == 1){
                        player.setCash(player.getCash()-player.getPriceForDefenseHectares());
                    }

                    int getwheatNeedGrowUpAttack = 0;
                    int getoatNeedGrowUpAttack = 0;
                    int getcornNeedGrowUpAttack = 0;
                    int getpotatoNeedGrowUpAttack = 0;
                    int getappleNeedGrowUpAttack = 0;

                    int getwheatGrowedUpAttack = 0;
                    int getoatGrowedUpAttack = 0;
                    int getcornGrowedUpAttack = 0;
                    int getpotatoGrowedUpAttack = 0;
                    int getappleGrowedUpAttack = 0;

                    // attack

if (player.defenseHectaresonoff ==1){
} else if (player.defenseHectaresonoff == 0){
    player.attackHectares(player.wheatNeedGrowUp.size(),player.oatNeedGrowUp.size(),player.cornNeedGrowUp.size(),player.potatoNeedGrowUp.size(),player.appleNeedGrowUp.size(),player.wheatGrowedUp.size(),player.oatGrowedUp.size(),player.cornGrowedUp.size(),player.potatoGrowedUp.size(),player.appleGrowedUp.size());




                    getwheatNeedGrowUpAttack = player.getwheatNeedGrowUpAttack();
                    getoatNeedGrowUpAttack = player.getoatNeedGrowUpAttack();
                    getcornNeedGrowUpAttack = player.getcornNeedGrowUpAttack();
                    getpotatoNeedGrowUpAttack = player.getpotatoNeedGrowUpAttack();
                    getappleNeedGrowUpAttack = player.getappleNeedGrowUpAttack();

                    getwheatGrowedUpAttack = player.getwheatGrowedUpAttack();
                    getoatGrowedUpAttack = player.getoatGrowedUpAttack();
                    getcornGrowedUpAttack = player.getcornGrowedUpAttack();
                    getpotatoGrowedUpAttack = player.getpotatoGrowedUpAttack();
                    getappleGrowedUpAttack = player.getappleGrowedUpAttack();
                    System.out.println("MAIN - getwheatNeedGrowUpAttack" + getwheatNeedGrowUpAttack);
                    if (getappleGrowedUpAttack>0){
                        for ( int j=0; j<getappleGrowedUpAttack; j++ ){player.appleGrowedUp.remove(j);}
                        player.MaxHectaresUsed -= getappleGrowedUpAttack*0.54;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getappleGrowedUpAttack=0;

                    } else {

}
                    if (getpotatoGrowedUpAttack>0){
                        for ( int j=0; j<getpotatoGrowedUpAttack; j++ ){player.potatoGrowedUp.remove(j);}
                        player.MaxHectaresUsed -= getpotatoGrowedUpAttack*0.15;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getpotatoGrowedUpAttack=0;
                    } else {


                    }

                    if (getcornGrowedUpAttack>0){
                        for ( int j=0; j<getcornGrowedUpAttack; j++ ){player.cornGrowedUp.remove(j);}
                        player.MaxHectaresUsed -= getcornGrowedUpAttack*0.39;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getcornGrowedUpAttack=0;
                    } else {


                    }
                    if (getoatGrowedUpAttack>0){
                        for ( int j=0; j<getoatGrowedUpAttack; j++ ){player.oatGrowedUp.remove(j);}
                        player.MaxHectaresUsed -= getoatGrowedUpAttack*0.25;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getoatGrowedUpAttack=0;
                    } else {



                    }
                    if (getwheatGrowedUpAttack>0){
                        for ( int j=0; j<getwheatGrowedUpAttack; j++ ){player.wheatGrowedUp.remove(j);}
                        player.MaxHectaresUsed -= getwheatGrowedUpAttack*0.18;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getwheatGrowedUpAttack=0;
                    } else {



                    }

                    if (getappleNeedGrowUpAttack>0){
                        for ( int j=0; j<getappleNeedGrowUpAttack; j++ ){player.appleNeedGrowUp.remove(j);}
                        player.MaxHectaresUsed -= getappleNeedGrowUpAttack*0.54;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getappleNeedGrowUpAttack=0;
                    } else {



                    }
                    if (getpotatoNeedGrowUpAttack>0){
                        for ( int j=0; j<getpotatoNeedGrowUpAttack; j++ ){player.potatoNeedGrowUp.remove(j);}
                        player.MaxHectaresUsed -= getpotatoNeedGrowUpAttack*0.15;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getpotatoNeedGrowUpAttack=0;
                    } else {



                    }
                    if (getcornNeedGrowUpAttack>0){
                        for ( int j=0; j<getcornNeedGrowUpAttack; j++ ){player.cornNeedGrowUp.remove(j);}
                        player.MaxHectaresUsed -= getcornNeedGrowUpAttack*0.39;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getcornNeedGrowUpAttack=0;
                    } else {



                    }
                    if (getoatNeedGrowUpAttack>0){
                        for ( int j=0; j<getoatNeedGrowUpAttack; j++ ){player.oatNeedGrowUp.remove(j);}
                        player.MaxHectaresUsed -= getoatNeedGrowUpAttack*0.25;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getoatNeedGrowUpAttack=0;
                    } else {



                    }
                    if (getwheatNeedGrowUpAttack>0){
                        for ( int j=0; j<getwheatNeedGrowUpAttack; j++ ){player.wheatNeedGrowUp.remove(j);}
                        player.MaxHectaresUsed -= getwheatNeedGrowUpAttack*0.18;
                        player.MaxHectaresUsed = Math.round(player.MaxHectaresUsed * 100);
                        player.MaxHectaresUsed = player.MaxHectaresUsed/100;
                        getwheatNeedGrowUpAttack=0;
                    } else {




                    }



}










                    Farmland.setAlreadyOpenShopFarmland();
                    Market.setAlreadyOpenShop();
                    BuildBuildings.setAlreadyOpenBuildBuildings();

                    ThreadLocalRandom random = ThreadLocalRandom.current();


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

                    for ( int j=0; j<player.wheatNeedGrowUp.size(); j++ ){

                        int temp = player.wheatNeedGrowUp.get(j);

                        temp -= 1;
                        player.wheatNeedGrowUp.remove(j);
                        player.wheatNeedGrowUp.add(j,temp);

                    }
                    for ( int j=0; j<player.oatNeedGrowUp.size(); j++ ){

                        int temp = player.oatNeedGrowUp.get(j);

                        temp -= 1;
                        player.oatNeedGrowUp.remove(j);
                        player.oatNeedGrowUp.add(j,temp);

                    }
                    for ( int j=0; j<player.cornNeedGrowUp.size(); j++ ){

                        int temp = player.cornNeedGrowUp.get(j);

                        temp -= 1;
                        player.cornNeedGrowUp.remove(j);
                        player.cornNeedGrowUp.add(j,temp);

                    }
                    for ( int j=0; j<player.potatoNeedGrowUp.size(); j++ ){

                        int temp = player.potatoNeedGrowUp.get(j);

                        temp -= 1;
                        player.potatoNeedGrowUp.remove(j);
                        player.potatoNeedGrowUp.add(j,temp);

                    }
                    for ( int j=0; j<player.appleNeedGrowUp.size(); j++ ){

                        int temp = player.appleNeedGrowUp.get(j);

                        temp -= 1;
                        player.appleNeedGrowUp.remove(j);
                        player.appleNeedGrowUp.add(j,temp);

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


// jesli 0 usun z array + dodaj do biganimal i growedup

                    int tempToMinusFromLastchicken = player.smallChickenAnimal.size();
                    int tempOatNeedGrowUpNumberchicken = player.smallChickenAnimal.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumberchicken;j++ ){
                        tempToMinusFromLastchicken -=1;
                        if(player.smallChickenAnimal.get(tempToMinusFromLastchicken) == 0){
                            player.smallChickenAnimal.remove(tempToMinusFromLastchicken);
                            player.bigChickenAnimal.add(1);

                        }

                    }

                    int tempToMinusFromLastdog = player.smallDogAnimal.size();
                    int tempOatNeedGrowUpNumberdog = player.smallDogAnimal.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumberdog;j++ ){
                        tempToMinusFromLastdog -=1;
                        if(player.smallDogAnimal.get(tempToMinusFromLastdog) == 0){
                            player.smallDogAnimal.remove(tempToMinusFromLastdog);
                            player.bigDogAnimal.add(1);

                        }

                    }


                    int tempToMinusFromLastcow = player.smallCowAnimal.size();
                    int tempOatNeedGrowUpNumbercow = player.smallCowAnimal.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumbercow;j++ ){
                        tempToMinusFromLastcow -=1;
                        if(player.smallCowAnimal.get(tempToMinusFromLastcow) == 0){
                            player.smallCowAnimal.remove(tempToMinusFromLastcow);
                            player.bigCowAnimal.add(1);

                        }

                    }



                    int tempToMinusFromLasthorse = player.smallHorseAnimal.size();
                    int tempOatNeedGrowUpNumberhorse = player.smallHorseAnimal.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumberhorse;j++ ){
                        tempToMinusFromLasthorse -=1;
                        if(player.smallHorseAnimal.get(tempToMinusFromLasthorse) == 0){
                            player.smallHorseAnimal.remove(tempToMinusFromLasthorse);
                            player.bigHorseAnimal.add(1);

                        }

                    }

                    int tempToMinusFromLastrabbit = player.smallRabbitAnimal.size();
                    int tempOatNeedGrowUpNumberrabbit = player.smallRabbitAnimal.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumberrabbit;j++ ){
                        tempToMinusFromLastrabbit -=1;
                        if(player.smallRabbitAnimal.get(tempToMinusFromLastrabbit) == 0){
                            player.smallRabbitAnimal.remove(tempToMinusFromLastrabbit);
                            player.bigRabbitAnimal.add(1);

                        }

                    }


                    int tempToMinusFromLastwheat = player.wheatNeedGrowUp.size();
                    int tempOatNeedGrowUpNumberwheat = player.wheatNeedGrowUp.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumberwheat;j++ ){
                        tempToMinusFromLastwheat -=1;
                        if(player.wheatNeedGrowUp.get(tempToMinusFromLastwheat) == 0){
                            player.wheatNeedGrowUp.remove(tempToMinusFromLastwheat);
                            player.wheatGrowedUp.add(1);

                        }

                    }

                    int tempToMinusFromLast = player.oatNeedGrowUp.size();
                    int tempOatNeedGrowUpNumber = player.oatNeedGrowUp.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumber;j++ ){
                        tempToMinusFromLast -=1;
                        if(player.oatNeedGrowUp.get(tempToMinusFromLast) == 0){
                            player.oatNeedGrowUp.remove(tempToMinusFromLast);
                            player.oatGrowedUp.add(1);

                        }

                    }



                    int tempToMinusFromLastcorn = player.cornNeedGrowUp.size();
                    int tempOatNeedGrowUpNumbercorn = player.cornNeedGrowUp.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumbercorn;j++ ){
                        tempToMinusFromLastcorn -=1;
                        if(player.cornNeedGrowUp.get(tempToMinusFromLastcorn) == 0){
                            player.cornNeedGrowUp.remove(tempToMinusFromLastcorn);
                            player.cornGrowedUp.add(1);

                        }

                    }


                    int tempToMinusFromLastpotato = player.potatoNeedGrowUp.size();
                    int tempOatNeedGrowUpNumberpotato = player.potatoNeedGrowUp.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumberpotato;j++ ){
                        tempToMinusFromLastpotato -=1;
                        if(player.potatoNeedGrowUp.get(tempToMinusFromLastpotato) == 0){
                            player.potatoNeedGrowUp.remove(tempToMinusFromLastpotato);
                            player.potatoGrowedUp.add(1);

                        }

                    }


                    int tempToMinusFromLastapple = player.appleNeedGrowUp.size();
                    int tempOatNeedGrowUpNumberapple = player.appleNeedGrowUp.size();
                    for ( int j=0;j<tempOatNeedGrowUpNumberapple;j++ ){
                        tempToMinusFromLastapple -=1;
                        if(player.appleNeedGrowUp.get(tempToMinusFromLastapple) == 0){
                            player.appleNeedGrowUp.remove(tempToMinusFromLastapple);
                            player.appleGrowedUp.add(1);

                        }

                    }






                    break;




                case 10:
                    player.countAnimals();
                    player.countSeeds();
                    player.setFoodForWeek(player.smallChickenAnimal.size(),player.smallDogAnimal.size(),player.smallCowAnimal.size(),player.smallHorseAnimal.size(),player.smallRabbitAnimal.size(),player.bigChickenAnimal.size(),player.bigDogAnimal.size(),player.bigCowAnimal.size(),player.bigHorseAnimal.size(),player.bigRabbitAnimal.size());
                    int endAnimalNumber1 = player.rabbitEndSize+player.horseEndSize+player.cowEndSize+player.dogEndSize+player.chickenEndSize;
                    int endSeedsNumber1 = player.wheatEndSize + player.oatEndSize + player.cornEndSize + player.potatoEndSize + player.appleEndSize;
                    System.out.println("     ****************************************");
                    System.out.println("To end game you need to collect these things: ");
                    System.out.println("Farmland size: " +player.endFarmlandSize+" (You have "+player.getFarmland()+" at this moment)");
                    System.out.println("Animal size: " +player.endAnimalsSize+" (You have "+endAnimalNumber1+" at this moment)");
                    System.out.println("Food for your animals: " +player.getFoodForYear()+" (You have "+player.foodForAnimals+" at this moment)");
                    System.out.println("Seeds size: " +player.endSeedsSize+" (You have "+endSeedsNumber1+" at this moment)");

                    System.out.println("     ****************************************");

                    System.out.println();
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
        System.out.println("     6. Harvest crops. ");
        System.out.println("     7. Check Harvests. ");
        System.out.println("     8. Check backpack. ");
        System.out.println("     9. Next week.");
        System.out.println("     10. End game tasks.");
        System.out.println("     0. Exit Game.");
        System.out.println("My Choice: ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();

        return choose;

    }




}
