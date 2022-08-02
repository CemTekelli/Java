package com.javacourse;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);
        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
        printElements(vehicles);
    }

    public static void printElements(List someList){
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }
}
