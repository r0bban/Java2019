package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {

    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        employees.add(new Employee("Kalle", 20, 20000));
        employees.add(new Employee("Lisa", 20, 22000));
        employees.add(new Employee("Anna", 20, 25000));
        employees.add(new Employee("Stina", 20, 30000));


        Collections.sort(employees);
        for (Employee em : employees) {
            System.out.println(em);
        }

        System.out.println("\n");
        //////////////////////////////////////////////////
        Comparator sortDecendingBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        };

        Collections.sort(employees, sortDecendingBySalary); //måste skriva Collections.sort eftersom List också har sort-metod
        
        for (Employee em : employees) {
            System.out.println(em);
        }
        System.out.println("\n");
        //////////////////////////////////////////////

        System.out.println("Sortera efter namn, fallande");
        Comparator<Employee> sortDecendingByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
        employees.sort(sortDecendingByName);

        for (Employee em : employees) {
            System.out.println(em);
        }
        System.out.println("\n");

        ///////////////////////////////////////////////////////////////
        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        for (Employee em : employees) {
            System.out.println(em);
        }

        System.out.println("test");
        System.out.println(employees.get(1));

    }

}
