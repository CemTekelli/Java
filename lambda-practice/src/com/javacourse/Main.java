package com.javacourse;

public class Main {

    public static void main(String[] args) {

        Human tom = new Human();
        walker(tom);
        Robot wale = new Robot();
        walker(wale);

        Walkable aBlockOfCode = () -> {
            System.out.println("Custom object walking...");
        };
        walker(aBlockOfCode);
        LambdaInterface helloVar = () -> System.out.println("Hello there");
        Calculate sumVar = (a,b) -> a + b;
        helloVar.someMethod();
        System.out.println(sumVar.compute(4, 6));
        Calculate nonZeroDivide = (a,b)->{
            if (a == 0){
                return 0;
            }
            return a/b;
        };

        System.out.println(nonZeroDivide.compute(10, 5));

        MyGenericInterface<String> reverser = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result = result + s.charAt(i);
            }
            return result;
        };

        System.out.println(reverser.work("Vehicle"));


        MyGenericInterface<Integer> computedNumber = (n) -> {
            int result = 1;
            for (int i = 1 ; i <= n ; i++) {
                result = i*result;
            }
            return result;
        };

        System.out.println(computedNumber.work(10));
    }

    public static void walker(Walkable walkableEntity){
        walkableEntity.walk();
    }

}

interface Calculate{
    public int compute(int a, int b);
}

interface MyGenericInterface<T>{
    public T work(T str);
}
