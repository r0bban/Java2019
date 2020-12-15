package inheritance;

public class Bird extends Animal {

    static String duties = "bird duty";

    public static void setDuties(String newDuties) {
        duties = newDuties;
    }
    
     @Override
    public String getDuties() {
    return duties;
    }

    int wingWidth;

    public Bird(int age, int wingWidth) {
        super(age);
        this.wingWidth = wingWidth;
    }

    public Bird() {
        super();
        //duties = birdDuties;
    }

    @Override
    public void move() {
        System.out.println("Bird flying");
    }

    @Override
    public String toString() {
        return "wingWidth=" + wingWidth;
    }

}
