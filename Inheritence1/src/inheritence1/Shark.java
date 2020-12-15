package inheritence1;

public class Shark extends Fish implements Predator {

    @Override
    public void calaculateDangerLevel() {
        System.out.println("Eagle is a pretty dangerous aniamal.");
    }

    //vad är 
    @Override
    public void printInfo() {
        System.out.println("Predator is pretty dangerous aniamal.");
    }

    //Fields and get/set methods
    //Class pecific Methods
    //Constructors
}
