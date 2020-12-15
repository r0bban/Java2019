package inheritance;

import java.util.ArrayList;

public class Inheritance {

    static ArrayList<Animal> zoo = new ArrayList<>();

    public static void main(String[] args) {

        Fish f1 = new Fish(3);
        Bird b1 = new Bird(4, 20);
        Bird b2 = new Bird(77, 20);
        Snake s1 = new Snake(5, 15);
        Snake s2 = new Snake(3, 14);

        zoo.add(f1);
        zoo.add(b1);
        zoo.add(b2);
        zoo.add(s1);
        zoo.add(s2);
        
        
        
        System.out.println("static String \"duties\" declared in a Bird-class: \"" + Bird.duties + "\"");
        System.out.println("getDuties() of a Fish-Object: \"" + f1.getDuties() + "\"");

        
        System.out.println("Ålder: " + zoo.get(1).age + ", Duties: " + zoo.get(1).getDuties());
        System.out.println("Ålder: " + zoo.get(2).age + ", Duties: " + zoo.get(2).getDuties());

        Bird.setDuties("uppdaterad bird duty");
        Bird.duties = "ny duties";
        
        System.out.println("Ålder: " + zoo.get(1).age + ", Duties: " + zoo.get(1).getDuties());
        System.out.println("Ålder: " + zoo.get(2).age + ", Duties: " + zoo.get(2).getDuties());

        
        System.out.println(Bird.duties + " printTest");

        for (Animal animal : zoo) {
            System.out.println(animal.age);
        }

        int sumAge = 0;

        for (Animal animal : zoo) {
            sumAge = sumAge + animal.age;
        }
        
        System.out.println("Alla djurs sammanlagda ålder är: " + sumAge);

        for (Animal animal : zoo) {
            System.out.println(animal);
        }
        
        s2.toxicValue = 33; //Sätter s2 värde för toxicValue till 33 genom att använda objectnamnet..... "s2.toxicValue = 33"
        
        for (Animal animal : zoo) {
            System.out.println(animal);
        }

        ((Snake)zoo.get(3)).toxicValue = 45; //Sätter s2 värde för toxicValue till 45 genom att använda elementets position och castar till Snake för att nå toxicValue..... "((Snake)zoo.get(2)).toxicValue = 45"
                
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
        
        zoo.get(3).age = 7; //Sätter s2 värde för age till 7 genom att använda elementets position utan att casta eftersom age är ett fält i klassen Animal som ArrayListen består av Object ifrån..... "zoo.get(3).age = 7"
        
        for (Animal animal : zoo) {
            System.out.println(animal);
        }

        
        /* jmf att lägga in move-metod i superclassen för att förenkla utskrift av move även fast utskrifterna är lite olika och har egna move-metoder so overridar och skrivs ut...samma som "Interface"?
        for (Animal animal : zoo) {
            animal.move();
        }

       
        
        for (Animal animal : zoo) {
            if (animal instanceof Fish) {
                ((Fish) animal).move();
            } else if (animal instanceof Bird) {
                ((Bird) animal).move();
            }
        }
        
        */
        
        
        /*
        
        f1.move(); //testa att sätta värde på objekt fält och se om det är ändra för objekt i listan. Utfall: ja det ändras
        
        zoo.add(f1);
        Animal x = zoo.get(0);
        
        ((Fish)x).move();
        */
    }

}
