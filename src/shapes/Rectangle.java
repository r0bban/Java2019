package shapes;

public class Rectangle {

    private double width;
    private double height;

    @Override
    public String toString() {
        return "Rectangle: " + "Width=" + width + ", Height=" + height;
    }
    public String printAll() {
        return "Rectangle: " + "Width=" + width + ", Height=" + height + ", Area=" + area() + ", Perimeter=" + perimeter();
    }
    public String printArea() {
        return "Area= " + area();
    }
    public String printPerimeter() {
        return "Perimeter= " + perimeter();
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double diagonal() {
        double diagonal = Math.sqrt((width * width) + (height * height));
        return diagonal;
    }

    public double perimeter() {
        double perimeter = width * 2 + height * 2;
        return perimeter;
    }

    public double area() {
        double area = width * height;
        return area;
    }

}
