package inheritance;

public class Snake extends Animal {
    
    int toxicValue;
    static String duties = "Snake duty";

    
    public Snake(int age, int toxicValue) {
        super(age);
        this.toxicValue = toxicValue;
        }
    

    public static void setDuties(String newDuties) {
        duties = newDuties;
    }
    
     @Override
    public String getDuties() {
    return duties;
    }

    

    public Snake() {
        super();
    }

    @Override
    public String toString() {
        return "toxicValue=" + toxicValue + ", age: " + super.age;
    }
    
    


}
