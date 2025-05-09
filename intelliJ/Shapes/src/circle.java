public class circle extends shapes{
    double radius;

    public circle(double r, String color) {
        super(color);
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
