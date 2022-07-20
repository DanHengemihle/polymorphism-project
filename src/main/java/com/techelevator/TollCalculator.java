package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car(false));
        vehicles.add(new Car(true));
        vehicles.add(new Tank());
        vehicles.add(new Truck(4));
        vehicles.add(new Truck(6));
        vehicles.add(new Truck(8));


        double distance = (Math.random() * 240) + 10;

            double totalTollboothRevenue = 0.0;

            int totalMilesTraveled = 0;

        System.out.println("Vehicle          " + "Distance Traveled     " + "Toll $");
        System.out.println("------------------------------------------------");

            for (Vehicle vehicleType : vehicles) {
                totalTollboothRevenue += vehicleType.calculateToll((int) distance);

                totalMilesTraveled += distance;

                System.out.println(vehicleType.toString() + (totalMilesTraveled) + "               " + "$" + (totalTollboothRevenue));
            }
        System.out.println( );
        System.out.println( "Total Miles Traveled: " + totalMilesTraveled);
        System.out.println( "Total Tollbooth Revenue: " + "$" + totalTollboothRevenue);

        }


}
