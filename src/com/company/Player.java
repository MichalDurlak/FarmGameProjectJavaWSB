package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Player {

    String name;
    int farmland,buildings, animals,seeds;
    private int cash;
    private int tempSeeds;
    int buildingsTemp,animalsTemp;



    public Player(String name){
        this.name = name; // wprowadzenie imienia gracza

        ThreadLocalRandom random = ThreadLocalRandom.current();

        this.cash = random.nextInt(1000,5000);
        this.farmland = 0;
        this.animals = 0;
        this.buildings = 0;
        this.seeds = 0;
        this.tempSeeds = 0;
        this.buildingsTemp = 0;
        this.animalsTemp = 0;


    }


public int getCash(){
        return cash;
}

public void setTempSeeds(){
    if (buildings == 0){
        this.tempSeeds = 0;
    } else if (buildings == 1){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 2){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 3){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 4){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 5){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 6){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 7){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 8){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 9){
        this.tempSeeds = 10*buildings;
    } else if (buildings == 100){
        this.tempSeeds = 10*buildings;
    }

}
public int getTempSeeds() {return tempSeeds;}

    static int endFarmlandSize = 20;
    static int endAnimalsSize = 5;
    static int endSeedsSize = 5;
    static int endFoodForAnimals = 0; // do poprawy

public static void checkEndGame(int FarmlandSize, int AnimalsSize, int SeedsSize){


    if (FarmlandSize == endFarmlandSize){

    } else if (AnimalsSize == endAnimalsSize){

    } else if (SeedsSize == endSeedsSize) {

    }

    System.out.println("     ****************************************");
    System.out.println("!!!Congratulations you won the game!!!");
    System.out.println("     ****************************************");
    System.exit(0);
}

}
