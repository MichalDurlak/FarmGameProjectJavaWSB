package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Market {

    private static boolean alreadyOpenShop = false;

    static int dogPriceBuy = 0;
    static int seedPriceBuy = 0;
    static int dogPriceSell = 0;
    static int seedPriceSell = 0;

    public static void Marketplace() {



        if (getAlreadyOpenShop() == true) {
            System.out.println("You saw these prices: ");
            System.out.println("BUY: ");
            System.out.println("Dog price: "+ dogPriceBuy);
            System.out.println("Seed price: "+ seedPriceBuy);
            System.out.println("SELL: ");
            System.out.println("Dog price: "+ dogPriceSell);
            System.out.println("Seed price: "+ seedPriceSell);


            alreadyOpenShop = true;
        }
        else if (getAlreadyOpenShop() == false) {
            System.out.println("Look there are new prices: ");


            ThreadLocalRandom random = ThreadLocalRandom.current();
            dogPriceBuy = random.nextInt(20,50);
            seedPriceBuy = random.nextInt(5,10);

            dogPriceSell = random.nextInt(2,5);
            seedPriceSell = random.nextInt(1,5);


            System.out.println("BUY: ");
            System.out.println("Dog price: "+ dogPriceBuy);
            System.out.println("Seed price: "+seedPriceBuy);
            System.out.println("SELL: ");
            System.out.println("Dog price: "+ dogPriceSell);
            System.out.println("Seed price: "+seedPriceSell);


            alreadyOpenShop = true;
        }



}

public static boolean getAlreadyOpenShop(){
        return alreadyOpenShop;
}

public static void setAlreadyOpenShop(){
        alreadyOpenShop = false;
}

}
