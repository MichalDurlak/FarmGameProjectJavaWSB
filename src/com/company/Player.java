package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Player {


    String name;
    public int buildings, animals, seeds;
    private double farmland;
    private int cash;

    private int wheatSeedsPlayer, oatSeedsPlayer, cornSeedsPlayer, potatoSeedsPlayer;
    private int MaxWheatSeedsPlayer, MaxOatSeedsPlayer, MaxCornSeedsPlayer, MaxPotatoSeedsPlayer;

    public int maxStorageFoodForAnimals, foodForAnimals;
    private int foodForWeek, foodForYear;

    public int buildingsMaxSize, animalsMaxSize, seedsMaxSize;


    public List<Integer> smallChickenAnimal = new ArrayList<>();
    public List<Integer> smallDogAnimal = new ArrayList<>();
    public List<Integer> smallCowAnimal = new ArrayList<>();
    public List<Integer> smallHorseAnimal = new ArrayList<>();
    public List<Integer> smallRabbitAnimal = new ArrayList<>();

    public List<Integer> bigChickenAnimal = new ArrayList<>();
    public List<Integer> bigDogAnimal = new ArrayList<>();
    public List<Integer> bigCowAnimal = new ArrayList<>();
    public List<Integer> bigHorseAnimal = new ArrayList<>();
    public List<Integer> bigRabbitAnimal = new ArrayList<>();

    public List<Integer> WheatSeed = new ArrayList<>();
    public List<Integer> OatSeed = new ArrayList<>();
    public List<Integer> CornSeed = new ArrayList<>();
    public List<Integer> PotatoSeed = new ArrayList<>();


    public Player(String name) {
        this.name = name; // wprowadzenie imienia gracza

        ThreadLocalRandom random = ThreadLocalRandom.current();

        this.cash = random.nextInt(1000, 5000);
        this.farmland = 0;
        this.animals = 0;
        this.buildings = 0;
        this.seeds = 0;
        this.seedsMaxSize = 0;
        this.buildingsMaxSize = 0;
        this.animalsMaxSize = 0;
        this.wheatSeedsPlayer = 0;
        this.potatoSeedsPlayer = 0;
        this.cornSeedsPlayer = 0;
        this.potatoSeedsPlayer = 0;


    }


    public int getCash() {
        return cash;
    }


    static double endFarmlandSize = 20.0;
    static int endAnimalsSize = 5;

    static int endSeedsSize = 5;
    static int endFoodForAnimals = 0; // do poprawy

    public static void checkEndGame(double FarmlandSize, int fullAnimals) {


        if (FarmlandSize == endFarmlandSize) {
            if (fullAnimals == endAnimalsSize) {

                System.out.println("     ****************************************");
                System.out.println("!!!Congratulations you won the game!!!");
                System.out.println("     ****************************************");
                System.exit(0);


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

    public void setCash(int cash) {
        this.cash = cash;
    }

    public double getFarmland() {
        this.farmland = this.farmland * 100;
        this.farmland = this.farmland / 100;
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

    public int getMaxWheatSeedsPlayer() {
        return MaxWheatSeedsPlayer;
    }

    public void setMaxWheatSeedsPlayer(int maxWheatSeedsPlayer) {
        MaxWheatSeedsPlayer = maxWheatSeedsPlayer;
    }

    public int getMaxOatSeedsPlayer() {
        return MaxOatSeedsPlayer;
    }

    public void setMaxOatSeedsPlayer(int maxOatSeedsPlayer) {
        MaxOatSeedsPlayer = maxOatSeedsPlayer;
    }

    public int getMaxCornSeedsPlayer() {
        return MaxCornSeedsPlayer;
    }

    public void setMaxCornSeedsPlayer(int maxCornSeedsPlayer) {
        MaxCornSeedsPlayer = maxCornSeedsPlayer;
    }

    public int getMaxPotatoSeedsPlayer() {
        return MaxPotatoSeedsPlayer;
    }

    public void setMaxPotatoSeedsPlayer(int maxPotatoSeedsPlayer) {
        MaxPotatoSeedsPlayer = maxPotatoSeedsPlayer;
    }


    // food for animals


    public void setFoodForWeek(int foodsmallChickenAnimal, int foodsmallDogAnimal, int foodsmallCowAnimal, int foodsmallHorseAnimal, int foodsmallRabbitAnimal, int foodbigChickenAnimal, int foodbigDogAnimal, int foodbigCowAnimal, int foodbigHorseAnimal, int foodbigRabbitsAnimal) {
        int finalFoodForWeek =0;
        int finalFoodForYear =0;

        int foodForsmallchickens = 5*foodsmallChickenAnimal;
        int foodForsmalldogs = 5*foodsmallDogAnimal;
        int foodForsmallcows = 5*foodsmallCowAnimal;
        int foodForsmallhorses = 5*foodsmallHorseAnimal;
        int foodForsmallrabbits = 5*foodsmallRabbitAnimal;
        int foodForbigchickens = 5*foodbigChickenAnimal;
        int foodForbigdogs = 5*foodbigDogAnimal;
        int foodForbigcows =5*foodbigCowAnimal;
        int foodForbighorses = 5*foodbigHorseAnimal;
        int foodForbigrabbits = 5*foodbigRabbitsAnimal;

        finalFoodForWeek = foodForsmallchickens+foodForsmalldogs+foodForsmallcows+foodForsmallhorses+foodForsmallrabbits+foodForbigchickens+foodForbigdogs+foodForbigcows+foodForbighorses+foodForbigrabbits;

        this.foodForWeek = finalFoodForWeek;

        finalFoodForYear = finalFoodForWeek*52;
        this.foodForYear = finalFoodForYear;


    }

    public int getfoodForWeek() { return foodForWeek; }


    public int getFoodForYear() { return foodForYear; }


}


