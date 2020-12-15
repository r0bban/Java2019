package inheritance;

public class Fish extends Animal {
    
    static String duties = "fish duty";

    public static void setDuties(String newDuties) {
        duties = newDuties;
    }
    
     @Override
    public String getDuties() {
    return duties;
    }
    

    public Fish() {
        super();
    }

    public Fish(int age) {
        super(age);
    }

    @Override
    public void move() {
        System.out.println("Fish swimming");
    }


}
