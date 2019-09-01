package shapes;

public class RightAngledTriangle {

    private double adjacent;
    private double opposite;

    @Override
    public String toString() {
        return "RightAngledTriangle: " + "Adjacent=" + adjacent + ", Opposite=" + opposite;
    }

    public String printArea() {
        return "Triangle area= " + area();
    }

    public String printPerimeter() {
        return "Triangle perimeter= " + perimeter();
    }

    public RightAngledTriangle(double adjacent, double opposite) {
        this.adjacent = adjacent;
        this.opposite = opposite;
    }

    public double getAdjacent() {
        return adjacent;
    }

    public double getOpposite() {
        return opposite;
    }

    public void setAdjacent(double adjacent) {
        this.adjacent = adjacent;
    }

    public void setOpposite(double opposite) {
        this.opposite = opposite;
    }

    public double hypo() {
        double hypo = Math.sqrt((adjacent * adjacent) + (opposite * opposite));
        return hypo;
    }

    public double perimeter() {
        double perimeter = (Math.sqrt((adjacent * adjacent) + (opposite * opposite))) + adjacent + opposite;
        return perimeter;
    }

    public double area() {
        double area = (adjacent * opposite) / 2;
        return area;
    }

}
