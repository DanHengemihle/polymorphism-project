package com.techelevator;

public class Truck implements Vehicle {

    private int numberOfAxles;


    public Truck(int numberOfAxles){
        this.numberOfAxles = numberOfAxles;
    }



    @Override
    public double calculateToll(int distance) {
       double toll = 0.0;

        if (getNumberOfAxles() == 4){
           toll = distance * 0.040;

        } else if (getNumberOfAxles() == 6){
            toll = distance * 0.045;

        } else if (getNumberOfAxles() >= 8){
            toll = distance * 0.048;
        }
        return toll;
    }



    public int getNumberOfAxles() {
        return numberOfAxles;
    }
}
