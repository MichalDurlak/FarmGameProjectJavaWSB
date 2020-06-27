package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Player {

    String name;
    int farmland,buildings, animals,seeds;
    private int cash;
    private int tempSeeds;

    public Player(String name){
        this.name = name; // wprowadzenie imienia gracza

        ThreadLocalRandom random = ThreadLocalRandom.current();
        int rand = random.nextInt(1000,5000);

        this.cash = rand;
        this.farmland = 0;
        this.animals = 0;
        this.buildings = 0;
        this.seeds = 0;
        this.tempSeeds = 0;



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


}
