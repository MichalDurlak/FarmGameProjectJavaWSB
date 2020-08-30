package com.company;

public class TestNotes {
    /*
                    case 7:
                            System.out.println("********************************************************************************");

//                    Player.testclass xyz = new Player.testclass(numberOfWeek,numberOfYear);
//
//                    player.testarray.add(xyz);
//
//                    for ( int j=0; j<player.testarray.size(); j++ ) System.out.println("element " + j + ": " + player.testarray.get(j) );
//
//                    for ( int j=0; j<player.testarray.size(); j++ ){
//
//
//
//                    }
//
//                    for ( int j=0; j<player.testarray.size(); j++ ) System.out.println("element " + j + ": " + player.testarray.get(j) );






    // DODAWANIE +1
//                    for ( int j=0; j<player.testarray2.size(); j++ ) System.out.println("element " + j + ": " + player.testarray2.get(j) );
//                    System.out.println("AFTER: ");
//                    for ( int j=0; j<player.testarray2.size(); j++ ){
//
//                        int temp = player.testarray2.get(j);
//                        System.out.println("temp"+temp);
//                        temp += 1;
//                        player.testarray2.remove(j);
//                        player.testarray2.add(j,temp);
//
//                     }
//
//                    for ( int j=0; j<player.testarray2.size(); j++ ) System.out.println("element " + j + ": " + player.testarray2.get(j) );

                    for ( int j=0; j<player.testarray2.size(); j++ ) System.out.println("element " + j + ": " + player.testarray2.get(j) );
                    System.out.println("-----------------");

//                     ODEJMOWANIE -1
                    for ( int j=0; j<player.testarray2.size(); j++ ){

        int temp = player.testarray2.get(j);
        System.out.println("temp"+temp);
        temp -= 1;
        player.testarray2.remove(j);
        player.testarray2.add(j,temp);

    }

                    for ( int j=0; j<player.testarray2.size(); j++ ) System.out.println("element " + j + ": " + player.testarray2.get(j) );


                    for ( int j=0; j<player.testarray2.size(); j++ ){


        if(player.testarray2.get(j) == 0){
            System.out.println("Zwierzak grow up! :D" + j);


        } else {
            player.testarray2.get(j);
            System.out.println("zwierzak need to grow up still!" + j);
        }

    }

                    for ( int j=0; j<player.testarray2.size(); j++ ) {
        if (player.testarray2.get(j) == 0) {
            player.testarray2.remove(j);
        }

    }
                        System.out.println("-----------------");
                        for (int j = 0; j < player.testarray2.size(); j++)
            System.out.println("element " + j + ": " + player.testarray2.get(j));
                        System.out.println("********************************************************************************");


                    break;





*/







    //                    int sellTempPlusCash = getPriceTempSell();
//                    int buyTempMinusCash = getpriceTempBuy();
//
//                    int toChangePlayerCashPlus = player.getCash()+sellTempPlusCash;
//                    int toChangePlayerCashMinus = player.getCash()-buyTempMinusCash;
//
//                    System.out.println("Player cash: "+player.getCash());
//
//                    player.setCash(toChangePlayerCashMinus);
//                    System.out.println("Player to change: "+toChangePlayerCashPlus);
//                    player.setCash(toChangePlayerCashPlus);
//
//
//                    System.out.println("Player cash: "+player.getCash());


// title = stage 22 - end for 27.08 // 15:30



    /*
smallChickenAnimal.size()
smallDogAnimal.size()
smallCowAnimal.size()
smallHorseAnimal.size()
smallRabbitAnimal.size()

bigChickenAnimal.size()
bigDogAnimal.size()
bigCowAnimal.size()
bigHorseAnimal.size()
bigRabbitAnimal.size()




                if (noFoodNoAnimal > tempsizeofanimals) {
                noFoodNoAnimaltemp = tempsizeofanimals;

                if (noFoodNoAnimaltemp > 0) {
                    if (smallChickenAnimal.size() > 0 || bigChickenAnimal.size() > 0) {
                        smallChickenAnimal.remove(smallChickenAnimal.size() - 1);
                        noFoodNoAnimaltemp -= 1;
                        animals -= 1;
                        animalsMaxSize += 1;
                    } else {

                        if (smallDogAnimal.size() > 0 || bigDogAnimal.size() > 0) {
                            smallDogAnimal.remove(smallDogAnimal.size() - 1);
                            noFoodNoAnimaltemp -= 1;
                            animals -= 1;
                            animalsMaxSize += 1;

                        } else {

                            if (smallCowAnimal.size() >= 0 || bigCowAnimal.size() >= 0) {
                                smallCowAnimal.remove(smallCowAnimal.size() - 1);
                                noFoodNoAnimaltemp -= 1;
                                animals -= 1;
                                animalsMaxSize += 1;

                            } else {

                                if (smallRabbitAnimal.size() >= 0 || bigRabbitAnimal.size() >= 0) {
                                    smallRabbitAnimal.remove(smallRabbitAnimal.size() - 1);
                                    noFoodNoAnimaltemp -= 1;
                                    animals -= 1;
                                    animalsMaxSize += 1;

                                } else {
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }

                } else {
                    return;

                }

            } else {
                this.noFoodNoAnimaltemp = noFoodNoAnimal;
                if (noFoodNoAnimaltemp > 0) {
                    if (smallChickenAnimal.size() > 0 || bigChickenAnimal.size() > 0) {
                        smallChickenAnimal.remove(smallChickenAnimal.size() - 1);
                        noFoodNoAnimaltemp -= 1;
                        animals -= 1;
                        animalsMaxSize += 1;

                    } else {

                        if (smallDogAnimal.size() > 0 || bigDogAnimal.size() > 0) {
                            smallDogAnimal.remove(smallDogAnimal.size() - 1);
                            noFoodNoAnimaltemp -= 1;
                            animals -= 1;
                            animalsMaxSize += 1;

                        } else {

                            if (smallCowAnimal.size() >= 0 || bigCowAnimal.size() >= 0) {
                                smallCowAnimal.remove(smallCowAnimal.size() - 1);
                                noFoodNoAnimaltemp -= 1;
                                animals -= 1;
                                animalsMaxSize += 1;

                            } else {

                                if (smallRabbitAnimal.size() >= 0 || bigRabbitAnimal.size() >= 0) {
                                    smallRabbitAnimal.remove(smallRabbitAnimal.size() - 1);
                                    noFoodNoAnimaltemp -= 1;
                                    animals -= 1;
                                    animalsMaxSize += 1;

                                } else {
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }

                } else {
                    return;


                }

            }


//
            //noFoodNoAnimaltemp
            //noFoodNoAnimal


        } else {
            foodForAnimals -=foodUsage;
        }






     */




    // BACKUP MARKET //

    /*
        public static int buyFarmland(int cash){
        placeForAnimalTemp = 0;
        placeForSeedsTemp = 0;
        placeForBuildingsTemp = 0;
        placePriceTemp = 0;
        placeSizeTemp = 0;

        if (getAlreadyOpenShopFarmland() == true) {
            System.out.println("You saw these prices: ");
            System.out.println("BUY: ");
            System.out.println("1. Place Size: "+placeSize1 +" Place for buildings: "+placeForBuildings1+" PRICE: "+ place1Price);
            System.out.println("2. Place Size: "+placeSize2 +" Place for buildings: "+placeForBuildings2+" PRICE: "+ place2Price);
            System.out.println("3. Place Size: "+placeSize3 +" Place for buildings: "+placeForBuildings3+" PRICE: "+ place3Price);
            System.out.println("4. Place Size: "+placeSize4 +" Place for buildings: "+placeForBuildings4+" PRICE: "+ place4Price);
            System.out.println("5. Place Size: "+placeSize5 +" Place for buildings: "+placeForBuildings5+" PRICE: "+ place5Price);
            System.out.println("6. Place Size: "+placeSize6 +" Place for buildings: "+placeForBuildings6+" PRICE: "+ place6Price);
            System.out.println("7. Place Size: "+placeSize7 +" Place for buildings: "+placeForBuildings7+" PRICE: "+ place7Price);
            System.out.println("8. Place Size: "+placeSize8 +" Place for buildings: "+placeForBuildings8+" PRICE: "+ place8Price);
            System.out.println("9. Place Size: "+placeSize9 +" Place for buildings: "+placeForBuildings9+" PRICE: "+ place9Price);
            System.out.println("0. Exit.");

            System.out.println("I chose number: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();

            if (choose == 1) {
                if (cash > place1Price) {
                    System.out.println("Congratulations you bought it!");

                    placePriceTemp = place1Price;
                    placeForAnimalTemp = placeForAnimals1;
                    placeForSeedsTemp = placeForSeeds1;
                    placeForBuildingsTemp = placeForBuildings1;
                    placeSizeTemp = placeSize1;

                    place1Price = 0;
                    placeForAnimals1 = 0;
                    placeForSeeds1 = 0;
                    placeForBuildings1 = 0;
                    placeSize1 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 2) {
                if (cash > place2Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place2Price;
                    placeForAnimalTemp = placeForAnimals2;
                    placeForSeedsTemp = placeForSeeds2;
                    placeForBuildingsTemp = placeForBuildings2;
                    placeSizeTemp = placeSize2;

                    place2Price = 0;
                    placeForAnimals2 = 0;
                    placeForSeeds2 = 0;
                    placeForBuildings2 = 0;
                    placeSize2 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 3) {
                if (cash > place3Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place3Price;
                    placeForAnimalTemp = placeForAnimals3;
                    placeForSeedsTemp = placeForSeeds3;
                    placeForBuildingsTemp = placeForBuildings3;
                    placeSizeTemp = placeSize3;

                    place3Price = 0;
                    placeForAnimals3 = 0;
                    placeForSeeds3 = 0;
                    placeForBuildings3 = 0;
                    placeSize3 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 4) {
                if (cash > place4Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place4Price;
                    placeForAnimalTemp = placeForAnimals4;
                    placeForSeedsTemp = placeForSeeds4;
                    placeForBuildingsTemp = placeForBuildings4;
                    placeSizeTemp = placeSize4;

                    place4Price = 0;
                    placeForAnimals4 = 0;
                    placeForSeeds4 = 0;
                    placeForBuildings4 = 0;
                    placeSize4 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 5) {
                if (cash > place5Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place5Price;
                    placeForAnimalTemp = placeForAnimals5;
                    placeForSeedsTemp = placeForSeeds5;
                    placeForBuildingsTemp = placeForBuildings5;
                    placeSizeTemp = placeSize5;

                    place5Price = 0;
                    placeForAnimals5 = 0;
                    placeForSeeds5 = 0;
                    placeForBuildings5 = 0;
                    placeSize5 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 6) {
                if (cash > place6Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place6Price;
                    placeForAnimalTemp = placeForAnimals6;
                    placeForSeedsTemp = placeForSeeds6;
                    placeForBuildingsTemp = placeForBuildings6;
                    placeSizeTemp = placeSize6;

                    place6Price = 0;
                    placeForAnimals6 = 0;
                    placeForSeeds6 = 0;
                    placeForBuildings6 = 0;
                    placeSize6 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 7) {
                if (cash > place7Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place7Price;
                    placeForAnimalTemp = placeForAnimals7;
                    placeForSeedsTemp = placeForSeeds7;
                    placeForBuildingsTemp = placeForBuildings7;
                    placeSizeTemp = placeSize7;

                    place7Price = 0;
                    placeForAnimals7 = 0;
                    placeForSeeds7 = 0;
                    placeForBuildings7 = 0;
                    placeSize7 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 8) {
                if (cash > place1Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place8Price;
                    placeForAnimalTemp = placeForAnimals8;
                    placeForSeedsTemp = placeForSeeds8;
                    placeForBuildingsTemp = placeForBuildings8;
                    placeSizeTemp = placeSize8;

                    place8Price = 0;
                    placeForAnimals8 = 0;
                    placeForSeeds8 = 0;
                    placeForBuildings8 = 0;
                    placeSize8 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 9) {
                if (cash > place9Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place9Price;
                    placeForAnimalTemp = placeForAnimals9;
                    placeForSeedsTemp = placeForSeeds9;
                    placeForBuildingsTemp = placeForBuildings9;
                    placeSizeTemp = placeSize9;

                    place9Price = 0;
                    placeForAnimals9 = 0;
                    placeForSeeds9 = 0;
                    placeForBuildings9 = 0;
                    placeSize9 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }


            else if (choose == 0) {
                return choose;

            }

            else {
                System.out.println("Please dont brake the game.");
            }


        }
        else if (getAlreadyOpenShopFarmland() == false){
            alreadyOpenShopFarmland = true;
            System.out.println("New prices: ");
            System.out.println("BUY: ");
            ThreadLocalRandom random = ThreadLocalRandom.current();

            //place1 - small
            placeSize1 = random.nextDouble(0.1,0.5);
            placeSize1 = Math.round(placeSize1 * 100);
            placeSize1 = placeSize1/100;
            placeForAnimals1 = random.nextInt(0,2);
            placeForSeeds1 = random.nextInt(1,4);
            placeForBuildings1 = 0;
            place1Price = random.nextInt(300,700);


            //place2 - small
            placeSize2 = random.nextDouble(0.1,0.5);
            placeSize2 = Math.round(placeSize2 * 100);
            placeSize2 = placeSize2/100;
            placeForAnimals2 = random.nextInt(0,2);
            placeForSeeds2 = random.nextInt(1,4);
            placeForBuildings2 = 0;
            place2Price = random.nextInt(300,700);

            //place3 - small
            placeSize3 = random.nextDouble(0.1,0.5);
            placeSize3 = Math.round(placeSize3 * 100);
            placeSize3 = placeSize3/100;
            placeForAnimals3 = random.nextInt(0,2);
            placeForSeeds3 = random.nextInt(1,4);
            placeForBuildings3 = 0;
            place3Price = random.nextInt(300,700);

            //place4 - small
            placeSize4 = random.nextDouble(0.1,0.5);
            placeSize4 = Math.round(placeSize4 * 100);
            placeSize4 = placeSize4/100;
            placeForAnimals4 = random.nextInt(0,2);
            placeForSeeds4 = random.nextInt(1,4);
            placeForBuildings4 = 0;
            place4Price = random.nextInt(300,700);

            //place5 - small
            placeSize5 = random.nextDouble(0.1,0.5);
            placeSize5 = Math.round(placeSize5 * 100);
            placeSize5 = placeSize5/100;
            placeForAnimals5 = random.nextInt(0,2);
            placeForSeeds5 = random.nextInt(1,4);
            placeForBuildings5 = 0;
            place5Price = random.nextInt(300,700);

            //place6 - medium
            placeSize6 = random.nextDouble(0.6,1.0);
            placeSize6 = Math.round(placeSize6 * 100);
            placeSize6 = placeSize6/100;
            placeForAnimals6 = random.nextInt(1,3);
            placeForSeeds6 = random.nextInt(2,5);
            placeForBuildings6 = random.nextInt(1,2);
            place6Price = random.nextInt(700,1400);

            //place7 - medium
            placeSize7 = random.nextDouble(0.6,1.0);
            placeSize7 = Math.round(placeSize7 * 100);
            placeSize7 = placeSize7/100;
            placeForAnimals7 = random.nextInt(1,3);
            placeForSeeds7 = random.nextInt(2,5);
            placeForBuildings7 = random.nextInt(1,2);
            place7Price = random.nextInt(700,1400);

            //place8 - large
            placeSize8 = random.nextDouble(1.2,2.0);
            placeSize8 = Math.round(placeSize8 * 100);
            placeSize8 = placeSize8/100;
            placeForAnimals8 = random.nextInt(2,5);
            placeForSeeds8 = random.nextInt(6,13);
            placeForBuildings8 = random.nextInt(2,4);
            place8Price = random.nextInt(2000,3000);

            //place9 - large
            placeSize9 = random.nextDouble(1.1,2.0);
            placeSize9 = Math.round(placeSize9 * 100);
            placeSize9 = placeSize9/100;
            placeForAnimals9 = random.nextInt(2,5);
            placeForSeeds9 = random.nextInt(6,13);
            placeForBuildings9 = random.nextInt(2,4);
            place9Price = random.nextInt(2000,3000);


            System.out.println("1. Place Size: "+placeSize1 +" Place for buildings: "+placeForBuildings1+" PRICE: "+ place1Price);
            System.out.println("2. Place Size: "+placeSize2 +" Place for buildings: "+placeForBuildings2+" PRICE: "+ place2Price);
            System.out.println("3. Place Size: "+placeSize3 +" Place for buildings: "+placeForBuildings3+" PRICE: "+ place3Price);
            System.out.println("4. Place Size: "+placeSize4 +" Place for buildings: "+placeForBuildings4+" PRICE: "+ place4Price);
            System.out.println("5. Place Size: "+placeSize5 +" Place for buildings: "+placeForBuildings5+" PRICE: "+ place5Price);
            System.out.println("6. Place Size: "+placeSize6 +" Place for buildings: "+placeForBuildings6+" PRICE: "+ place6Price);
            System.out.println("7. Place Size: "+placeSize7 +" Place for buildings: "+placeForBuildings7+" PRICE: "+ place7Price);
            System.out.println("8. Place Size: "+placeSize8 +" Place for buildings: "+placeForBuildings8+" PRICE: "+ place8Price);
            System.out.println("9. Place Size: "+placeSize9 +" Place for buildings: "+placeForBuildings9+" PRICE: "+ place9Price);
            System.out.println("0. Exit.");


            System.out.println("I chose number: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();

            if (choose == 1) {
                if (cash > place1Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place1Price;
                    placeForAnimalTemp = placeForAnimals1;
                    placeForSeedsTemp = placeForSeeds1;
                    placeForBuildingsTemp = placeForBuildings1;
                    placeSizeTemp = placeSize1;
                    place1Price = 0;
                    placeForAnimals1 = 0;
                    placeForSeeds1 = 0;
                    placeForBuildings1 = 0;
                    placeSize1 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 2) {
                if (cash > place2Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place2Price;
                    placeForAnimalTemp = placeForAnimals2;
                    placeForSeedsTemp = placeForSeeds2;
                    placeForBuildingsTemp = placeForBuildings2;
                    placeSizeTemp = placeSize2;
                    place2Price = 0;
                    placeForAnimals2 = 0;
                    placeForSeeds2 = 0;
                    placeForBuildings2 = 0;
                    placeSize2 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 3) {
                if (cash > place3Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place3Price;
                    placeForAnimalTemp = placeForAnimals3;
                    placeForSeedsTemp = placeForSeeds3;
                    placeForBuildingsTemp = placeForBuildings3;
                    placeSizeTemp = placeSize3;
                    place3Price = 0;
                    placeForAnimals3 = 0;
                    placeForSeeds3 = 0;
                    placeForBuildings3 = 0;
                    placeSize3 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 4) {
                if (cash > place4Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place4Price;
                    placeForAnimalTemp = placeForAnimals4;
                    placeForSeedsTemp = placeForSeeds4;
                    placeForBuildingsTemp = placeForBuildings4;
                    placeSizeTemp = placeSize4;
                    place4Price = 0;
                    placeForAnimals4 = 0;
                    placeForSeeds4 = 0;
                    placeForBuildings4 = 0;
                    placeSize4 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 5) {
                if (cash > place5Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place5Price;
                    placeForAnimalTemp = placeForAnimals5;
                    placeForSeedsTemp = placeForSeeds5;
                    placeForBuildingsTemp = placeForBuildings5;
                    placeSizeTemp = placeSize5;
                    place5Price = 0;
                    placeForAnimals5 = 0;
                    placeForSeeds5 = 0;
                    placeForBuildings5 = 0;
                    placeSize5 = 0;

                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 6) {
                if (cash > place6Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place6Price;
                    placeForAnimalTemp = placeForAnimals6;
                    placeForSeedsTemp = placeForSeeds6;
                    placeForBuildingsTemp = placeForBuildings6;
                    placeSizeTemp = placeSize6;
                    place6Price = 0;
                    placeForAnimals6 = 0;
                    placeForSeeds6 = 0;
                    placeForBuildings6 = 0;
                    placeSize6 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 7) {
                if (cash > place7Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place7Price;
                    placeForAnimalTemp = placeForAnimals7;
                    placeForSeedsTemp = placeForSeeds7;
                    placeForBuildingsTemp = placeForBuildings7;
                    placeSizeTemp = placeSize7;
                    place7Price = 0;
                    placeForAnimals7 = 0;
                    placeForSeeds7 = 0;
                    placeForBuildings7 = 0;
                    placeSize7 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 8) {
                if (cash > place1Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place8Price;
                    placeForAnimalTemp = placeForAnimals8;
                    placeForSeedsTemp = placeForSeeds8;
                    placeForBuildingsTemp = placeForBuildings8;
                    placeSizeTemp = placeSize8;
                    place8Price = 0;
                    placeForAnimals8 = 0;
                    placeForSeeds8 = 0;
                    placeForBuildings8 = 0;
                    placeSize8 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }

            else if (choose == 9) {
                if (cash > place9Price) {
                    System.out.println("Congratulations you bought it!");
                    placePriceTemp = place9Price;
                    placeForAnimalTemp = placeForAnimals9;
                    placeForSeedsTemp = placeForSeeds9;
                    placeForBuildingsTemp = placeForBuildings9;
                    placeSizeTemp = placeSize9;
                    place9Price = 0;
                    placeForAnimals9 = 0;
                    placeForSeeds9 = 0;
                    placeForBuildings9 = 0;
                    placeSize9 = 0;
                } else {
                    System.out.println("Sorry check your balance");
                    return choose;
                }


            }


            else if (choose == 0) {
                    return choose;

                }

            else {
                System.out.println("Please dont brake the game.");
            }



        }





        return cash;
    }
*/

}
