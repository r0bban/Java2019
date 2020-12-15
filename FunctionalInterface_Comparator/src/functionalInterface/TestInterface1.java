package functionalInterface;

import java.util.ArrayList;

public interface TestInterface1 {
    
    default void staticMethod1(){
        System.out.println("Hello, Im a static method declared in TestInterface1");
    }
    
    ArrayList kalle = new ArrayList();
    ArrayList<String> kalle1 = new ArrayList<>();
    //ArrayList<String> lista1 = new ArrayList<>();
}
