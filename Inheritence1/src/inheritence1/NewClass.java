package inheritence1;

import java.util.ArrayList;
import java.util.Collections;

public class NewClass {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(23);
        number.add(3);
        number.add(73);
        number.add(98);
        number.add(2);
        number.add(663);
        number.add(6);
        number.add(893);
        number.add(1);

        Collections.sort(number, new SortDecending() );
        System.out.println(number);
    }

}
