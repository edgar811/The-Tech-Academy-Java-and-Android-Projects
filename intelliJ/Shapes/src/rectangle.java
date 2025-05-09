

public class rectangle extends shapes {
    double width;
    double height;
    public rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {

        return width * height;
    }
}
