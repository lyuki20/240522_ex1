public class Quadrilateral {

    //Calc
    public static double area(double side) {

        return side * side;

    }

    public static double area(double side1, double side2) {

        return side1 * side2;

    }

    public static double area(double sbase, double lbase, double height) {

        return (sbase + lbase) / 2 * height;
    }

}
