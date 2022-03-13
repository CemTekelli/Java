package lambda.practical;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args){
        List<Car> cars = Arrays.asList(
                new Car("BMW", "M1", "White", 30000),
                new Car("BMW", "M2", "Blue", 35000),
                new Car("BMW", "M3", "Red", 41000),
                new Car("BMW", "M4", "Black", 45000),
                new Car("Mercedes", "C63", "White", 50000),
                new Car("Audi", "RS6", "Green", 70000)
        );

        Function<Car, String> priceAndColor = (c) -> "Price: " + c.getPrice() + " Color: " + c.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);

        System.out.println("Printing cars between 41000 and 430000");
        printCars(cars, (c) -> c.getPrice() >= 41000 && c.getPrice() <= 43000);
        System.out.println("Printing white colored cars");
        printCars(cars, (c) -> c.getColor().equals("White"));

    }

    public static void printCars(List<Car> cars, Predicate<Car> predicate){
        for (Car c: cars){
            if(predicate.test(c)){
                c.printCar();
            }
        }
    }


}
