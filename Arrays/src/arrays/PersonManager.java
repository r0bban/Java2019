package arrays;

public class PersonManager {
    
    static Person[] personer = new Person[5];
    
    public static void main(String[] args) {

    personer[0] = new Person("Mina", "1989-03-26");
    personer[1] = new Person("Fredrik", "1997-03-14");
    personer[2] = new Person("Peter", "2007-03-04");
    personer[3] = new Person("Tina", "2015-03-23");
    personer[4] = new Person("Petter", "1944-03-24");
    
    //här kan metod starta?
    int oldestPosition = 0;
    
        for (int i = 1; i < personer.length; i++) {
            if ( personer[i].calculateAge() > personer[oldestPosition].calculateAge() ) {
                oldestPosition=i;
            }
            
        }
   
        System.out.println(personer[oldestPosition]);
    //metod slut

        
    }
    
}
