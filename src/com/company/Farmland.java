package com.company;

public class Farmland {

    private static boolean alreadyOpenShopFarmland = false;
    static int placeForAnimals;
    static int placeForSeeds;
    static int placeForBuildings;

    public static void buyFarmland(int cash){

        if (getAlreadyOpenShopFarmland() == true) {
            System.out.println("You saw these prices: ");
            System.out.println("SELL: ");
        } else if (getAlreadyOpenShopFarmland() == false){
            System.out.println("New prices: ");
            System.out.println("SELL: ");

            alreadyOpenShopFarmland = true;
        }


    }

    public static boolean getAlreadyOpenShopFarmland(){
        return alreadyOpenShopFarmland;
    }

    public static void setAlreadyOpenShopFarmland(){
        alreadyOpenShopFarmland = false;
    }

}
