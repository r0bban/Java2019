//package arrays2;

public class Student {

    private static int idCounter = 100;
    private int id;
    private String name;

    public Student( String name) {
        this.id = idCounter;
        this.name = name;
        idCounter++;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name;
    }

}
