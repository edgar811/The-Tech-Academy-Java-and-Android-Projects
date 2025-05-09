//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        rectangle myRec = new rectangle(7, 10, "Red");
        trangle myTri = new trangle(5, 8, "Green");
        circle myCir = new circle(15, "Yellow");

        System.out.println("The rectangle area is " + myRec.getArea());
        myRec.displayColor();
        System.out.println("The triangle area is " + myTri.getArea());
        myTri.displayColor();
        System.out.println("The circle area is " + myCir.getArea());
        myCir.displayColor();
        }
    }
