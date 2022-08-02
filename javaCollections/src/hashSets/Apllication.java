package hashSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Apllication {

    public static void main(String[] args){

        // un hashet permet également de ne pas avoir de duplication contrairement a un arraylist
        // don't maintain the order
        // utile pour les valeurs unique
        // LinkedHashSet permet de maintenir l'ordre


        HashSet<Employee> values = new HashSet<Employee>();

        values.add(new Employee("Cem", 4000,"IT" ));
        values.add(new Employee("Mike", 3000,"Accounting" ));
        values.add(new Employee("Sam", 7000,"PM" ));



        ArrayList<Employee> myList = new ArrayList<Employee>(values);





        // convertire le hashset vers un arraylist pour pouvoir sort
        // idem pour les strings


        Collections.sort(myList);


        System.out.println(myList);



        HashSet<Animals> animal = new HashSet<Animals>();
        Animals animal1 = new Animals("Dog", 10);
        Animals animal2 = new Animals("Cat", 5);
        Animals animal3 = new Animals("Bird", 2);
        Animals animal4 = new Animals("Dog", 10);

        animal.add(animal1);
        animal.add(animal2);
        animal.add(animal3);
        animal.add(animal4);


        // hascode dans animals pour eviter des duplications
        for (Animals value :
                animal) {
            System.out.println(value);
        }

        // addAll list1.removeAll(newList)
        // remove tous les elements qui ont des 10.
        //clear() -> effacer tous les elements dans la liste
        // contains()
        //isEmpty
        // retainAll()
        // convert from HashSet to List -> List<Integer> li = new ArrayList<Integer>(list1)




    }
}
