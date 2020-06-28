package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Player {


    String name;
    public int buildings, animals,seeds;
    private double farmland;
    private int cash;

    private int wheatSeedsPlayer, oatSeedsPlayer, cornSeedsPlayer, potatoSeedsPlayer;
    private int MaxWheatSeedsPlayer, MaxOatSeedsPlayer, MaxCornSeedsPlayer, MaxPotatoSeedsPlayer;


    public int buildingsMaxSize,animalsMaxSize,seedsMaxSize;



    public Player(String name){
        this.name = name; // wprowadzenie imienia gracza

        ThreadLocalRandom random = ThreadLocalRandom.current();

        this.cash = random.nextInt(1000,5000);
        this.farmland = 0;
        this.animals = 0;
        this.buildings = 0;
        this.seeds = 0;
        this.seedsMaxSize = 0;
        this.buildingsMaxSize = 0;
        this.animalsMaxSize = 0;
        this.wheatSeedsPlayer=0;
        this.potatoSeedsPlayer=0;
        this.cornSeedsPlayer = 0;
        this.potatoSeedsPlayer = 0;


    }


public int getCash(){
        return cash;
}


    static int endFarmlandSize = 20;
    static int endAnimalsSize = 5;
    static int endSeedsSize = 5;
    static int endFoodForAnimals = 0; // do poprawy

public static void checkEndGame(double FarmlandSize, int AnimalsSize, int SeedsSize){


    if (FarmlandSize == endFarmlandSize){
        if (AnimalsSize == endAnimalsSize){
            if (SeedsSize == endSeedsSize){
                System.out.println("     ****************************************");
                System.out.println("!!!Congratulations you won the game!!!");
                System.out.println("     ****************************************");
                System.exit(0);
            }

        }


    }


}


    public void setFarmland(double farmland) {
        this.farmland = farmland;
    }

    public void setAnimals(int animals) {
        this.animals = animals;
    }

    public void buildings(int buildings) {
        this.buildings = buildings;
    }

    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }

    public void setCash(int cash){
        this.cash=cash;
    }

    public double getFarmland() {
        this.farmland = this.farmland*100;
        this.farmland = this.farmland/100;
        return this.farmland;
    }

    public int getWheatSeedsPlayer() {
        return wheatSeedsPlayer;
    }

    public void setWheatSeedsPlayer(int wheatSeedsPlayer) {
        this.wheatSeedsPlayer = wheatSeedsPlayer;
    }

    public int getOatSeedsPlayer() {
        return oatSeedsPlayer;
    }

    public void setOatSeedsPlayer(int oatSeedsPlayer) {
        this.oatSeedsPlayer = oatSeedsPlayer;
    }

    public int getCornSeedsPlayer() {
        return cornSeedsPlayer;
    }

    public void setCornSeedsPlayer(int cornSeedsPlayer) {
        this.cornSeedsPlayer = cornSeedsPlayer;
    }

    public int getPotatoSeedsPlayer() {
        return potatoSeedsPlayer;
    }

    public void setPotatoSeedsPlayer(int potatoSeedsPlayer) {
        this.potatoSeedsPlayer = potatoSeedsPlayer;
    }
}
