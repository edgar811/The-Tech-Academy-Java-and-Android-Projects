public class circle extends shapes{
    double radius;

    public circle(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
