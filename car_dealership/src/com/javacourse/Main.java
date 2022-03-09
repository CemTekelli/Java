package com.javacourse;

public class Main {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Cem", "Rue de la sainte", 50000);
        Vehicle ford = new Vehicle("Ford", "Mustang", "2020", 30000);
        Employee yusuf = new Employee("Yusuf");

        cust1.purchaseCar(ford, yusuf, false);


        Vehicle bmw = new Vehicle("bmw", "m5", "2021", 60000);
        Vehicle bmw2 = new Vehicle("bmw", "m5", "2021", 60000);


        boolean value = bmw.equals(bmw2);
        System.out.println(value);

    }
}
