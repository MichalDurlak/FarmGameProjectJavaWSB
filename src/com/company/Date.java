package com.company;

public class Date {

    private int numberOfWeek = 1;
    private int numberOfYear = 2020;

    public void setDate(){

        if (this.numberOfWeek <= 52){
            this.numberOfWeek = 1;
            this.numberOfYear = +1;
        } else{
            this.numberOfWeek = +1;
        }


        System.out.println("Actual Date. "+this.numberOfWeek+this.numberOfYear);

    }

}
