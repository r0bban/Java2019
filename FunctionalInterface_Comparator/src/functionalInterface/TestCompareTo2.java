package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;

public class TestCompareTo2 {

    public static void main(String[] args) {
        
        checkNumber ();

        ArrayList<Employee> employees = new ArrayList<>();

        Employee em1 = new Employee("Stina", 24, 11000.0);
        Employee em2 = new Employee("Lisa", 54, 13000.0);
        Employee em3 = new Employee("Kalle", 21, 10000.0);

        employees.add(em1);
        employees.add(em2);
        employees.add(em3);

        employees.sort(null);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        Collections.sort(employees, (e1, e2) -> e2.name.compareTo(e1.name));
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        employees.sort((e1, e2) -> (int) (e1.salary*100) - (int) (e2.salary*100));
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        employees.sort((e1, e2) -> e1.age - e2.age);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
//        Double dubbel1 = 20.0;
//        Double dubbel2 = 5.0;
//        System.out.println(dubbel1-dubbel2);
//        Double svar =dubbel1 -dubbel2;
//        System.out.println(svar);

    }

    public static void checkNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            i = i + 3;
        }

    }

}
