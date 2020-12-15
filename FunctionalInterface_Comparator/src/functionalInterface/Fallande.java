package functionalInterface;

import java.util.Comparator;
// Används i första sorteringen i "FunvtionalInterfaces"

public class Fallande implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return (Integer)o2-(Integer)o1;
    }

}
