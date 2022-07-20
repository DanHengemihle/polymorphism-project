package com.techelevator;

public class FexEd implements DeliveryDriver {

    private double rate = 20.00;


    @Override
    public double calculateRate(int distance, double weight) {

        if (distance > 500 && weight > 48) {
            return rate += 8;
        }
        else if (distance > 500) {
            return rate = rate + 5.00;

        } else if (weight > 48) {
            return rate = rate + 3.00;

        } else return rate;
    }
}
