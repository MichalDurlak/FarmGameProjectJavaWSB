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
}
