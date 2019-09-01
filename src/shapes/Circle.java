package shapes;

public class Circle {

    private final double PII = 3.14;
    private double radie;

    @Override
    public String toString() {
        return "Circle: " + "Radie=" + radie;
    }

    public String printArea() {
        return "Area= " + area();
    }

    public String printPerimeter() {
        return "Perimeter= " + perimeter();
    }

    public Circle(double radie) {
        this.radie = radie;
    }

    public double getRadie() {
        return radie;
    }

    public void setRadie(double radie) {
        this.radie = radie;
    }

    public double area() {
        double area = radie * radie * PII;
        return area;
    }

    public double perimeter() {
        double perimeter = (radie + radie) * PII;
        return perimeter;
    }

}
