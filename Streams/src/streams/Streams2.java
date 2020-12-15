package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams2 {

    public static void main(String[] args) {

        ArrayList<Duck> ducks = new ArrayList();

        for (int i = 0; i < 10; i++) {
            ducks.add(new Duck(("Birdname" + Integer.toString(i)), ("Birdcolour" + Integer.toString(i))));
        }

    //////////////////////////////////////////////////////////////    
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    ///////////////////////////////////////////////////////////////
    
        System.out.println("kalle");
    Stream<Duck> duckStream = ducks.stream();
    
//    long numberOfDucks = duckStream.count();
//    duckStream.forEach(System.out::println);
    duckStream.forEach(kalle -> System.out.println(kalle.name));
    
        int a = 8;
        System.out.println(a);
    
    }

}
