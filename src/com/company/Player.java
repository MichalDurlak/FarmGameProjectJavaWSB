package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Player {


    String name;
    public int buildings, animals, seeds;
    private double farmland;
    private int cash;

    public int wheatSeedsPlayer, oatSeedsPlayer, cornSeedsPlayer, potatoSeedsPlayer,appleTreeSeedsPlayer;
    public double MaxHectaresUsed;

    public int maxStorageFoodForAnimals, foodForAnimals;
    private int foodForWeek, foodForYear;

    public int buildingsMaxSize, animalsMaxSize, seedsMaxSize;
    public int noFoodNoAnimal, noFoodNoAnimaltemp;

    public int wheatPlayer,oatPlayer,cornPlayer,potatoPlayer,applePlayer;

    int chickenEndSize;
    int dogEndSize;
    int cowEndSize;
    int horseEndSize;
    int rabbitEndSize;

    int wheatEndSize,oatEndSize,cornEndSize,potatoEndSize,appleEndSize;

    public int defenseHectaresonoff;
    public int priceForDefenseHectares;
    public double howManyHectaresItWillTake;


    private double oldhowManyHectaresPlayer;

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

    public List<Integer> wheatNeedGrowUp = new ArrayList<>();
    public List<Integer> oatNeedGrowUp = new ArrayList<>();
    public List<Integer> cornNeedGrowUp = new ArrayList<>();
    public List<Integer> potatoNeedGrowUp = new ArrayList<>();
    public List<Integer> appleNeedGrowUp = new ArrayList<>();

    public List<Integer> wheatGrowedUp = new ArrayList<>();
    public List<Integer> oatGrowedUp = new ArrayList<>();
    public List<Integer> cornGrowedUp = new ArrayList<>();
    public List<Integer> potatoGrowedUp = new ArrayList<>();
    public List<Integer> appleGrowedUp = new ArrayList<>();

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
        this.MaxHectaresUsed =0;

        this.wheatSeedsPlayer = 0;
        this.oatSeedsPlayer = 0;
        this.cornSeedsPlayer = 0;
        this.potatoSeedsPlayer = 0;
        this.appleTreeSeedsPlayer = 0;

        this.wheatPlayer = 0;
        this.oatPlayer = 0;
        this.cornPlayer = 0;
        this.potatoPlayer = 0;
        this.applePlayer = 0;

        this.chickenEndSize = 0;
        this.dogEndSize = 0;
        this.cowEndSize = 0;
        this.horseEndSize = 0;
        this.rabbitEndSize = 0;

        this.wheatEndSize = 0;
        this.oatEndSize = 0;
        this.cornEndSize = 0;
        this.potatoEndSize = 0;
        this.appleEndSize = 0;

        this.noFoodNoAnimal = 0;

        this.defenseHectaresonoff =0;
        this.priceForDefenseHectares =0;
        this.howManyHectaresItWillTake = 0;

        this.oldhowManyHectaresPlayer = 0;
    }


    public int getCash() {
        return cash;
    }


    static double endFarmlandSize = 20.0;
    static int endAnimalsSize = 5;

    static int endSeedsSize = 5;

    public static void checkEndGame(double FarmlandSize, int fullAnimals, int endFoodForAnimals, int foodForAnimalsNOW, int seedsToEnd) {


        if (FarmlandSize >= endFarmlandSize) {
            if (fullAnimals == endAnimalsSize) {
                if (endFoodForAnimals <= foodForAnimalsNOW) {
                    if (seedsToEnd == endSeedsSize){
                        System.out.println("     ****************************************");
                        System.out.println("!!!Congratulations you won the game!!!");
                        System.out.println();
                        System.out.println("     ****************************************");
                        System.exit(0);

                    }


                }

            }


        }


    }


    public void setFarmland(double farmland) {
        this.farmland = farmland;
    }


    public void setCash(int cash) {
        this.cash = cash;
    }

    public double getFarmland() {
        this.farmland = this.farmland * 100;
        this.farmland = this.farmland / 100;
        return this.farmland;
    }



    // food for animals


    public void setFoodForWeek(int foodsmallChickenAnimal, int foodsmallDogAnimal, int foodsmallCowAnimal, int foodsmallHorseAnimal, int foodsmallRabbitAnimal, int foodbigChickenAnimal, int foodbigDogAnimal, int foodbigCowAnimal, int foodbigHorseAnimal, int foodbigRabbitsAnimal) {
        int finalFoodForWeek = 0;
        int finalFoodForYear = 0;

        int foodForsmallchickens = 5 * foodsmallChickenAnimal;
        int foodForsmalldogs = 5 * foodsmallDogAnimal;
        int foodForsmallcows = 5 * foodsmallCowAnimal;
        int foodForsmallhorses = 5 * foodsmallHorseAnimal;
        int foodForsmallrabbits = 5 * foodsmallRabbitAnimal;
        int foodForbigchickens = 5 * foodbigChickenAnimal;
        int foodForbigdogs = 5 * foodbigDogAnimal;
        int foodForbigcows = 5 * foodbigCowAnimal;
        int foodForbighorses = 5 * foodbigHorseAnimal;
        int foodForbigrabbits = 5 * foodbigRabbitsAnimal;

        finalFoodForWeek = foodForsmallchickens + foodForsmalldogs + foodForsmallcows + foodForsmallhorses + foodForsmallrabbits + foodForbigchickens + foodForbigdogs + foodForbigcows + foodForbighorses + foodForbigrabbits;

        this.foodForWeek = finalFoodForWeek;

        finalFoodForYear = finalFoodForWeek * 52;
        this.foodForYear = finalFoodForYear;


    }

    public int getfoodForWeek() {
        return foodForWeek;
    }


    public int getFoodForYear() {
        return foodForYear;
    }


    public void countAnimals() {
        if (this.chickenEndSize == 0) {
            if (smallChickenAnimal.size() > 0 || bigChickenAnimal.size() > 0) {
                this.chickenEndSize += 1;
            }
        } else if (this.chickenEndSize == 1) {
            if (smallChickenAnimal.size() <= 0 && bigChickenAnimal.size() <= 0) {
                this.chickenEndSize -= 1;
            }
        }

        if (this.dogEndSize == 0) {
            if (smallDogAnimal.size() > 0 || bigDogAnimal.size() > 0) {
                this.dogEndSize += 1;
            }
        } else if (this.dogEndSize == 1) {
            if (smallDogAnimal.size() <= 0 && bigDogAnimal.size() <= 0) {
                this.dogEndSize -= 1;
            }
        }

        if (this.cowEndSize == 0) {
            if (smallCowAnimal.size() > 0 || bigCowAnimal.size() > 0) {
                this.cowEndSize += 1;
            }
        } else if (this.cowEndSize == 1) {
            if (smallCowAnimal.size() <= 0 && bigCowAnimal.size() <= 0) {
                this.cowEndSize -= 1;
            }
        }

        if (this.horseEndSize == 0) {
            if (smallHorseAnimal.size() > 0 || bigHorseAnimal.size() > 0) {
                this.horseEndSize += 1;
            }
        } else if (this.horseEndSize == 1) {
            if (smallHorseAnimal.size() <= 0 && bigHorseAnimal.size() <= 0) {
                this.horseEndSize -= 1;
            }
        }

        if (this.rabbitEndSize == 0) {
            if (smallRabbitAnimal.size() > 0 || bigRabbitAnimal.size() > 0) {
                this.rabbitEndSize += 1;
            }
        } else if (this.horseEndSize == 1) {
            if (smallRabbitAnimal.size() <= 0 && bigRabbitAnimal.size() <= 0) {
                this.rabbitEndSize -= 1;
            }
        }
    }

    public void animalsEatFood(int foodUsage) {



        if (foodUsage <= foodForAnimals) {
            foodForAnimals -= foodUsage;

            if (this.noFoodNoAnimal > 0 ){

                this.noFoodNoAnimal -= 1;

            } else {

                return;
            }
        }

        else {

            this.noFoodNoAnimal+=1;
            int tempsizeofanimals = smallCowAnimal.size() + bigChickenAnimal.size() + smallDogAnimal.size() + bigDogAnimal.size() + smallCowAnimal.size() + bigCowAnimal.size() + smallHorseAnimal.size() + bigHorseAnimal.size() + smallRabbitAnimal.size() + bigRabbitAnimal.size();


            if (this.noFoodNoAnimal <= tempsizeofanimals){

                for ( int j=0; j<this.noFoodNoAnimal; j++){
                    // start


                    if (smallChickenAnimal.size() > 0){

                        smallChickenAnimal.remove(smallChickenAnimal.size() - 1);
                        noFoodNoAnimaltemp -= 1;
                        animals -= 1;
                        animalsMaxSize += 1;


                    } else {


                        if (bigChickenAnimal.size()>0){
                            bigChickenAnimal.remove(bigChickenAnimal.size() - 1);
                            noFoodNoAnimaltemp -= 1;
                            animals -= 1;
                            animalsMaxSize += 1;

                        } else {

                            if (smallDogAnimal.size()>0) {
                                smallDogAnimal.remove(smallDogAnimal.size() - 1);
                                noFoodNoAnimaltemp -= 1;
                                animals -= 1;
                                animalsMaxSize += 1;

                            }else{

                                if (bigDogAnimal.size()>0) {
                                    bigDogAnimal.remove(bigDogAnimal.size() - 1);
                                    noFoodNoAnimaltemp -= 1;
                                    animals -= 1;
                                    animalsMaxSize += 1;

                                } else{

                                    if (smallCowAnimal.size()>0) {
                                        smallCowAnimal.remove(smallCowAnimal.size() - 1);
                                        noFoodNoAnimaltemp -= 1;
                                        animals -= 1;
                                        animalsMaxSize += 1;

                                    } else {

                                        if (bigCowAnimal.size()>0) {
                                            bigCowAnimal.remove(bigCowAnimal.size() - 1);
                                            noFoodNoAnimaltemp -= 1;
                                            animals -= 1;
                                            animalsMaxSize += 1;

                                        } else {

                                            if (smallHorseAnimal.size()>0) {
                                                smallHorseAnimal.remove(smallHorseAnimal.size() - 1);
                                                noFoodNoAnimaltemp -= 1;
                                                animals -= 1;
                                                animalsMaxSize += 1;

                                            } else {

                                                if (bigHorseAnimal.size()>0) {
                                                    bigHorseAnimal.remove(bigHorseAnimal.size() - 1);
                                                    noFoodNoAnimaltemp -= 1;
                                                    animals -= 1;
                                                    animalsMaxSize += 1;

                                                } else {

                                                    if (smallRabbitAnimal.size()>0) {
                                                        smallRabbitAnimal.remove(smallRabbitAnimal.size() - 1);
                                                        noFoodNoAnimaltemp -= 1;
                                                        animals -= 1;
                                                        animalsMaxSize += 1;

                                                    } else {
                                                        if (bigRabbitAnimal.size()>0) {
                                                            bigRabbitAnimal.remove(bigRabbitAnimal.size() - 1);
                                                            noFoodNoAnimaltemp -= 1;
                                                            animals -= 1;
                                                            animalsMaxSize += 1;

                                                        } else{

                                                            return;
                                                        }
                                                    }
                                                }
                                            }

                                        }

                                    }
                                }

                            }

                        }



                    }


                    // stop


                }


            }




            else {



                noFoodNoAnimaltemp=tempsizeofanimals;
                for ( int j=0; j<noFoodNoAnimaltemp; j++){


                    // wklej to co u gory

                    // start

                    if (smallChickenAnimal.size() > 0){

                        smallChickenAnimal.remove(smallChickenAnimal.size() - 1);
                        noFoodNoAnimaltemp -= 1;
                        animals -= 1;
                        animalsMaxSize += 1;

                    } else {


                        if (bigChickenAnimal.size()>0){
                            bigChickenAnimal.remove(bigChickenAnimal.size() - 1);
                            noFoodNoAnimaltemp -= 1;
                            animals -= 1;
                            animalsMaxSize += 1;

                        } else {

                            if (smallDogAnimal.size()>0) {
                                smallDogAnimal.remove(smallDogAnimal.size() - 1);
                                noFoodNoAnimaltemp -= 1;
                                animals -= 1;
                                animalsMaxSize += 1;

                            }else{

                                if (bigDogAnimal.size()>0) {
                                    bigDogAnimal.remove(bigDogAnimal.size() - 1);
                                    noFoodNoAnimaltemp -= 1;
                                    animals -= 1;
                                    animalsMaxSize += 1;

                                } else{

                                    if (smallCowAnimal.size()>0) {
                                        smallCowAnimal.remove(smallCowAnimal.size() - 1);
                                        noFoodNoAnimaltemp -= 1;
                                        animals -= 1;
                                        animalsMaxSize += 1;

                                    } else {

                                        if (bigCowAnimal.size()>0) {
                                            bigCowAnimal.remove(bigCowAnimal.size() - 1);
                                            noFoodNoAnimaltemp -= 1;
                                            animals -= 1;
                                            animalsMaxSize += 1;

                                        } else {

                                            if (smallHorseAnimal.size()>0) {
                                                smallHorseAnimal.remove(smallHorseAnimal.size() - 1);
                                                noFoodNoAnimaltemp -= 1;
                                                animals -= 1;
                                                animalsMaxSize += 1;

                                            } else {

                                                if (bigHorseAnimal.size()>0) {
                                                    bigHorseAnimal.remove(bigHorseAnimal.size() - 1);
                                                    noFoodNoAnimaltemp -= 1;
                                                    animals -= 1;
                                                    animalsMaxSize += 1;

                                                } else {

                                                    if (smallRabbitAnimal.size()>0) {
                                                        smallRabbitAnimal.remove(smallRabbitAnimal.size() - 1);
                                                        noFoodNoAnimaltemp -= 1;
                                                        animals -= 1;
                                                        animalsMaxSize += 1;

                                                    } else {
                                                        if (bigRabbitAnimal.size()>0) {
                                                            bigRabbitAnimal.remove(bigRabbitAnimal.size() - 1);
                                                            noFoodNoAnimaltemp -= 1;
                                                            animals -= 1;
                                                            animalsMaxSize += 1;

                                                        } else{

                                                            return;
                                                        }
                                                    }
                                                }
                                            }

                                        }

                                    }
                                }

                            }

                        }



                    }


                    // stop

                }

            }



































        }




    }


    public void countSeeds(){
        if (this.wheatEndSize  == 0) {
            if (wheatNeedGrowUp.size() > 0 || wheatGrowedUp.size() > 0) {
                this.wheatEndSize += 1;
            }
        } else if (this.wheatEndSize  == 1) {
            if (wheatNeedGrowUp.size() <= 0 && wheatGrowedUp.size() <= 0) {
                this.wheatEndSize -= 1;
            }
        }

        if (this.oatEndSize  == 0) {
            if (oatNeedGrowUp.size() > 0 || oatGrowedUp.size() > 0) {
                this.oatEndSize += 1;
            }
        } else if (this.oatEndSize  == 1) {
            if (oatNeedGrowUp.size() <= 0 && oatGrowedUp.size() <= 0) {
                this.oatEndSize -= 1;
            }
        }

        if (this.cornEndSize  == 0) {
            if (cornNeedGrowUp.size() > 0 || cornGrowedUp.size() > 0) {
                this.cornEndSize += 1;
            }
        } else if (this.cornEndSize  == 1) {
            if (cornNeedGrowUp.size() <= 0 && cornGrowedUp.size() <= 0) {
                this.cornEndSize -= 1;
            }
        }

        if (this.potatoEndSize  == 0) {
            if (potatoNeedGrowUp.size() > 0 || potatoGrowedUp.size() > 0) {
                this.potatoEndSize += 1;
            }
        } else if (this.potatoEndSize  == 1) {
            if (potatoNeedGrowUp.size() <= 0 && potatoGrowedUp.size() <= 0) {
                this.potatoEndSize -= 1;
            }
        }

        if (this.appleEndSize  == 0) {
            if (appleNeedGrowUp.size() > 0 || appleGrowedUp.size() > 0) {
                this.appleEndSize += 1;
            }
        } else if (this.appleEndSize  == 1) {
            if (appleNeedGrowUp.size() <= 0 && appleGrowedUp.size() <= 0) {
                this.appleEndSize -= 1;
            }
        }

    }

    public void checkHarvest(){

        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println("wheatNeedGrowUp -> "+wheatNeedGrowUp.size() );
        System.out.println("oatNeedGrowUp  -> "+oatNeedGrowUp.size() );
        System.out.println("cornNeedGrowUp  -> "+cornNeedGrowUp .size() );
        System.out.println("potatoNeedGrowUp  -> "+potatoNeedGrowUp .size() );
        System.out.println("appleNeedGrowUp  -> "+appleNeedGrowUp .size() );
        System.out.println("------------------------------------------------------------------");
        System.out.println("wheatGrowedUp  -> "+wheatGrowedUp .size() );
        System.out.println("oatGrowedUp   -> "+oatGrowedUp  .size() );
        System.out.println("cornGrowedUp   -> "+cornGrowedUp  .size() );
        System.out.println("potatoGrowedUp   -> "+potatoGrowedUp  .size() );
        System.out.println("appleGrowedUp   -> "+appleGrowedUp  .size() );
        System.out.println("------------------------------------------------------------------");
    }

    public void defenseHectares(int playerMoney, int priceForDefenseHectares){



        if (playerMoney >= priceForDefenseHectares){
            this.defenseHectaresonoff = 1;

            if (MaxHectaresUsed == 0.0){

            } else {

                System.out.println("___________________________________________________________");
                System.out.println();
                System.out.println("Your farmland is defensed.");
                System.out.println();
                System.out.println("___________________________________________________________");

            }
        }
        else {
            this.defenseHectaresonoff = 0;
            System.out.println("___________________________________________________________");
            System.out.println();
            System.out.println("Sorry you dont have enough money for defense your farmland.");
            System.out.println();
            System.out.println("___________________________________________________________");

        }

    }

    //set price of defense
    public void setpriceForDefenseHectares(double howManyHectaresPlayer){

        if (howManyHectaresPlayer == this.oldhowManyHectaresPlayer){


        } else {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int tempPriceForDefense = random.nextInt(100, 200);
            double doublepriceForDefenseHectares = howManyHectaresPlayer*tempPriceForDefense;

            this.priceForDefenseHectares = (int) doublepriceForDefenseHectares;
            this.oldhowManyHectaresPlayer = howManyHectaresPlayer;
        }

    }


// get price of defense
    public int getPriceForDefenseHectares(){return priceForDefenseHectares;};


// attack
    public void attackHectares(int isSetDefenseHectares){

        if (isSetDefenseHectares == 1 ){

            defenseHectaresonoff = 0;

        } else if (isSetDefenseHectares == 0){

            ThreadLocalRandom random = ThreadLocalRandom.current();
            int chanseToDestroyYourFarmland = random.nextInt(1, 10);
            this.howManyHectaresItWillTake = 0;

            if (chanseToDestroyYourFarmland<=2){
                System.out.println("Unlucky someone destroyed your farmland");

                this.howManyHectaresItWillTake = random.nextDouble(0.01, MaxHectaresUsed);
                this.howManyHectaresItWillTake = Math.round(this.howManyHectaresItWillTake * 100);
                this.howManyHectaresItWillTake = this.howManyHectaresItWillTake/100;
            } else {
                System.out.println("This week nobody destroyed your farmland");
                this.howManyHectaresItWillTake = 0;
            }


            defenseHectaresonoff = 0;

        }
    }

    public double getHowManyHectaresItWillTake(){return howManyHectaresItWillTake;};

}


