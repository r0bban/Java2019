package streams;

class Duck {

    String name;
    String colour;

    public Duck(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", Colour: " + colour;
    }

}
