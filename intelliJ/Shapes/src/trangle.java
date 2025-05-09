import javax.swing.*;

public class trangle extends shapes{
    double base;
    double height;

    public trangle(double b, double h, String color){
        super(color);
        base = b;
        height = h;
    }

    public double getArea(){

        return base*height;
    }
}
