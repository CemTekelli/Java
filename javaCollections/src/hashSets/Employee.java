package hashSets;

public class Employee implements Comparable<Employee>{
    String name;
    int salary;
    String departement;

    public Employee(String name, int salary, String departement) {
        this.name = name;
        this.salary = salary;
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", departement='" + departement + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // what makes an employee larger than an other
        if(this.salary < o.salary){
            return -1;
        } else if(this.salary > o.salary){
            return 1;
        }
        return 0;
    }
}
