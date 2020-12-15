package inheritance;

public abstract class Animal {
   
    int age;
    //static String duties = "No duties defined for this type of cop."; //
    
    public abstract String getDuties();/* { //ej deklarerad som abstract efter den ska ge no duties defined om ej ocerskriven i sub-klass
        return duties;
    } */

    
    
    
    
    
    
    
    // public abstract void move(); <-- abstract kan inte användas i kombination med annan  variant av amma method (nedan)

    public void move() {
        System.out.println("Animal moves...Animal class move method");
        }
    
    public Animal(int age){
        //super();
        this.age = age;
    }
    
    public Animal(){
        super();  //<-- måste den finnas? elelr den, kommer automatiskt?..Ja, tillräckligt säker att inte behövs.
        System.out.println("Hello from constructor in Animal class");
    }

    @Override
    public String toString() {
        return "age=" + age;
    }
    
    
    
    
    
    
    
}
