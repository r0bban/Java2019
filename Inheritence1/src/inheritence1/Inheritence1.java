package inheritence1;

import java.util.ArrayList;

public class Inheritence1 {

    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        
        zoo.add (new Shark());
        zoo.add (new Shark());
        zoo.add (new Shark());
        zoo.add (new GoldFish());
        zoo.add (new Tiger());
        zoo.add (new Cat());
        zoo.add (new Eagle());
        zoo.add (new Chicken());
        zoo.add (new Chicken());
        zoo.add (new Shark());
        zoo.add (new Shark());
        zoo.add (new Shark());
        zoo.add (new Shark());
        int numberOfPredators =0;
        
        for (Animal animal : zoo) {
            if (animal instanceof Predator) {
                numberOfPredators++;
            }
        }
        System.out.println(numberOfPredators);
        
        
        }
    }
