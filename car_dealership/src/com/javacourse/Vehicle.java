package com.javacourse;

public class Vehicle {

    private String construct;
    private String model;
    private String year;
    private double price;


    public Vehicle(String construct, String model, String year, double price) {
        this.construct = construct;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public String getConstruct() {
        return construct;
    }

    public void setConstructor(String construct) {
        this.construct = construct;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (Double.compare(vehicle.price, price) != 0) return false;
        if (construct != null ? !construct.equals(vehicle.construct) : vehicle.construct != null) return false;
        if (model != null ? !model.equals(vehicle.model) : vehicle.model != null) return false;
        return year != null ? year.equals(vehicle.year) : vehicle.year == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = construct != null ? construct.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "construct='" + construct + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }
}
