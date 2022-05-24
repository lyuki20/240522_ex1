public class Main {

    public static void main(String[] args) {

        double squareArea = Quadrilateral.area(10);
        System.out.println("Square's area: " + squareArea);

        double rectangleArea = Quadrilateral.area(10, 5);
        System.out.println("Rectangle's area: " + rectangleArea);

        double trapeziumArea = Quadrilateral.area(10,10,10);
        System.out.println("Trapezium's Area" + trapeziumArea);
    }
}
