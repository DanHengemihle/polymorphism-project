package com.techelevator;

import java.util.List;
import java.util.Map;

public class PostalService implements DeliveryDriver{

    /*
    Parent class with subclasses
    A map? two number "values" as key name and then the ability to call on that?
    parsing doubles and valueOf() method
    Make a list in postal service parent class then convert to maps in the subclasses?
    would it be better to make constants based on class rate and weight?
    when to/should we use BigDecimal?
     */

    private int distance;
    public final double pound = 16.0;

    public PostalService (int distance){

        this.distance = distance;

    }
    public double whatever = Double.parseDouble("0-2");


    public double calculateRate(int distance, double weight) {
        double totalRate = 0;

        if (weight <= 2){
            totalRate = 0.035 * distance;
        }
        else if(weight >= 3 && weight <= 8){
            totalRate = 0.04 * distance;
        }
        else

        return totalRate;
    }

    public int getDistance() {
        return distance;
    }
}
