
package generics2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Generics2 {

    public static void main(String[] args) throws Exception {
//        System.out.println(args[0]);
       
        
    }
    
    
    
    
    public static void foo (ArrayList <? super Cat> myList){
        myList.get(0).toString();
//        myList.get(0).animalMethod();     fungerar inte pga att foo kan anropas med ArrayList som innehåller objekt av Object
//        myList.get(0).catMethod();        fungerar inte pga att foo kan anropas med ArrayList som innehåller objekt av Object eller Animal
//        myList.get(0).tigerMethod();      fungerar inte pga att foo kan anropas med ArrayList som innehåller objekt av Object, Animal eller Cat


//        myList.add(new Object());         fungerar inte pga att foo kan anropas med ArrayList som innehåller objekt av Animal eller Cat
//        myList.add(new Animal());         fungerar inte pga att foo kan anropas med ArrayList som innehåller objekt av Cat
        myList.add(new Cat());
        myList.add(new Tiger());
    }
    
    
    public static <T> void printAnything(ArrayList<T> talen1, ArrayList<T> talen2){
            System.out.println(talen1);
            System.out.println(talen2);
        }
//    public static void printInt(ArrayList<Integer> talen){
//            System.out.println(talen);
//        }
//    public static void printString(ArrayList<String> s){
//            System.out.println(s);
//        }
//    public static void printDouble(ArrayList<Double> talen2){
//            System.out.println(talen2);
//        }

    
}
