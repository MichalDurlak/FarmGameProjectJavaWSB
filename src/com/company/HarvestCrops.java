package com.company;

import java.util.Scanner;

public class HarvestCrops {

    static int howManyToHarvest;
    static int finalPriceforHarvest;

    static int isitWheat,isitOat,isitCorn,isitPotato,isitApple;

    public static void harvestCrops(int allWheat, int allOat, int allCorn, int allPotato, int Apple){
        System.out.println();
        howManyToHarvest =0;
        finalPriceforHarvest=0;
        int priceWheatHarvestcrops =4;
        int priceOatHarvestcrops =8;
        int priceCornHarvestcrops =11;
        int pricePotatoHarvestcrops =3;
        int priceAppleHarvestcrops =8;

        isitWheat = 0;
        isitOat =0;
        isitCorn = 0;
        isitPotato = 0;
        isitApple = 0;

        //Harvest crops
        System.out.println("Pricing for Harvest crops: ");
        System.out.println(priceWheatHarvestcrops+"$ - for one Wheat"+" ( "+allWheat*priceWheatHarvestcrops+" $ - for all)");
        System.out.println(priceOatHarvestcrops+"$ - for one Oat"+" ( "+allOat*priceOatHarvestcrops+" $ - for all)");
        System.out.println(priceCornHarvestcrops+"$ - for one Corn"+" ( "+allCorn*priceCornHarvestcrops+" $ - for all)");
        System.out.println(pricePotatoHarvestcrops+"$ - for one Potato"+" ( "+allPotato*pricePotatoHarvestcrops+" $ - for all)");
        System.out.println(priceAppleHarvestcrops+"$ - for one Apple"+" ( "+Apple*priceAppleHarvestcrops+" $ - for all)");
        System.out.println();
        System.out.println();

        System.out.println("What do you want to crop: ");
        System.out.println("1. Wheat");
        System.out.println("2. Oat");
        System.out.println("3. Corn");
        System.out.println("4. Potato");
        System.out.println("5. Apple");

        System.out.println("0. Exit");
        System.out.println();
        System.out.println("I choose number: ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();


        if (choose == 1){
            System.out.println("How many you want to crop.");
            System.out.println("I want crop: ");
            int choose1 = in.nextInt();

            if (allWheat<=choose1){
                System.out.println("Congratulation you have " + choose1*8  + " animal food");
                howManyToHarvest = choose1;
                finalPriceforHarvest = howManyToHarvest*priceWheatHarvestcrops;
                isitWheat = 1;

            } else {
                System.out.println("You dont have enough harvest to crop.");
            }
        }
        else if (choose ==2){
            System.out.println("How many you want to crop.");
            System.out.println("I want crop: ");
            int choose1 = in.nextInt();

            if (allWheat<=choose1){
                System.out.println("Congratulation you have " + choose1*15  + " animal food");
                howManyToHarvest = choose1;
                finalPriceforHarvest = howManyToHarvest*priceOatHarvestcrops;
                isitOat =1;


            } else {
                System.out.println("You dont have enough harvest to crop.");
            }
        }
        else if (choose ==3){
            System.out.println("How many you want to crop.");
            System.out.println("I want crop: ");
            int choose1 = in.nextInt();

            if (allWheat<=choose1){
                System.out.println("Congratulation you have " + choose1*12  + " animal food");
                howManyToHarvest = choose1;
                finalPriceforHarvest = howManyToHarvest*priceCornHarvestcrops;
                isitCorn = 1;


            } else {
                System.out.println("You dont have enough harvest to crop.");
            }
        }
        else if (choose ==4){
            System.out.println("How many you want to crop.");
            System.out.println("I want crop: ");
            int choose1 = in.nextInt();

            if (allWheat<=choose1){
                System.out.println("Congratulation you have " + choose1*4  + " potato");
                howManyToHarvest = choose1;
                finalPriceforHarvest = howManyToHarvest*pricePotatoHarvestcrops;
                isitPotato = 1;


            } else {
                System.out.println("You dont have enough harvest to crop.");
            }
        }

        else if (choose ==5){
            System.out.println("How many you want to crop.");
            System.out.println("I want crop: ");
            int choose1 = in.nextInt();

            if (allWheat<=choose1){
                System.out.println("Congratulation you have " + choose1*15  + " apple");
                howManyToHarvest = choose1;
                finalPriceforHarvest = howManyToHarvest*priceAppleHarvestcrops;
                isitApple = 1;


            } else {
                System.out.println("You dont have enough harvest to crop.");
            }
        }
    }



    static int getHowManyToHarvest(){return howManyToHarvest;}
    static int getfinalPriceforHarvest(){return finalPriceforHarvest;}

    static int getisitWheat(){return isitWheat ;}
    static int getisitOat(){return isitOat ;}
    static int getisitCorn(){return isitCorn ;}
    static int getisitPotato(){return isitPotato ;}
    static int getisitApple(){return isitApple ;}



}
