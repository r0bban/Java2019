package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        ArrayList<Integer> talen = new ArrayList<>();

        talen.add(663);
        talen.add(6);
        talen.add(893);
        talen.add(1);

        Collections.sort(talen, new Fallande());
        System.out.println("kalle");
        System.out.println(talen);
/////////////////////////////////////////////////////////////////////////////////////////////
        List<Integer> talen2 = new ArrayList<>();
        

        talen2.add(663);
        talen2.add(6);
        talen2.add(893);
        talen2.add(1);

        //detta funkar inte eftersom jag inte kan skapa objekt av Comparator som är ett interface
        //Comparator<Integer> fallande = new Comparator<Integer>;
        //detta funkar däremot, att ange "()" vilket betyder att skapa object. Men eftersom Comparator är Interface implementeras metoden I Comparator
        Comparator <Integer> stigande = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        Collections.sort(talen2, stigande );
        System.out.println(talen2);
/////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> talen3 = new ArrayList<>();

        talen3.add(555);
        talen3.add(666);
        talen3.add(111);
        talen3.add(999);

        Comparator<Integer> fallande2 = (o1, o2) -> o2-o1;
        Comparator<Integer> stigande2 = (o1, o2) -> o1-o2;
        //Comparator<Employee> stigande = (o1, o2) -> o2-o1;
        
        Collections.sort(talen3, fallande2 );
        System.out.println(talen3);
        Collections.sort(talen3, stigande2 );
        System.out.println(talen3);

    }

}
