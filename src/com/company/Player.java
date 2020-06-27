package com.company;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Player {

    String name;
    int farmland,buildings, animals,seeds;
    private int cash;

    public Player(String name){
        this.name = name; // wprowadzenie imienia gracza

        ThreadLocalRandom random = ThreadLocalRandom.current();
        int rand = random.nextInt(1000,5000);

        this.cash = rand;


        this.farmland = 0;
        this.buildings = 0;
        this.animals = 0;
        this.seeds = 0;
    }


public int getCash(){
        return cash;
}





}
