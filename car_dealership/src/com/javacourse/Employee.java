package com.javacourse;

public class Employee {

    String name;


    public Employee(){

    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void runCreditsHistory(Customer cust, double loanAmount){
        System.out.println("Ran credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }
    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: " + vehicle + " for the price " + vehicle.getPrice());
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if (finance == true){
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditsHistory(cust, loanAmount);
        } else if(vehicle.getPrice() <= cust.cashOnHand){
            processTransaction(cust, vehicle);
        } else{
            System.out.println(cust + " will need more money to purchase the vehicle: " + vehicle);
        }
    }

}
