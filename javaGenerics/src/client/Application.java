package client;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args){
        Object myObject = new Object();
        String myVar = "Hello";
        myObject = myVar;

        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;


        ArrayList<Employee> employees =  new ArrayList<>();
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<>();
        accountants.add(new Accountant());
        // error
        //employees = accountants;

        // wildcards
        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<>();
        employees2 = accountants2;
        // upper bound
        ArrayList<? extends Employee> employee3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<>();

        employee3 = accountants3;

        // permet d'avoir les parents et pas les enfants -> lower bound
        ArrayList<? super Employee> employees4 = new ArrayList<>();

        makeEmployeeWork(accountants);
    }

    public static void makeEmployeeWork(List<? extends Employee> employees){
        for(Accountant emp : (ArrayList<Accountant>) employees){
            emp.work();
        }
    }
}
