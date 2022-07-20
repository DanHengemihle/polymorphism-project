package com.techelevator;

public class Car implements Vehicle {

    private boolean hasTrailer;

    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public double calculateToll(int distance) {
        double toll = distance * 0.020;

        if (hasTrailer == false) {
            return toll;

        } else if (hasTrailer == true) {
        } return toll + 1.00;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hasTrailer=" + hasTrailer +
                '}';
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }
}

