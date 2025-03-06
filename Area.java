import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate area of triangle
        System.out.println("Enter base of the triangle:");
        double baseTriangle = scanner.nextDouble();
        System.out.println("Enter height of the triangle:");
        double heightTriangle = scanner.nextDouble();

        double areaTriangle = TriangleArea(baseTriangle, heightTriangle);
        System.out.println("Area of the triangle: " + areaTriangle);

        // Calculate area of rectangle
        System.out.println("Enter length of the rectangle:");
        double lengthRectangle = scanner.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double widthRectangle = scanner.nextDouble();

        double areaRectangle = RectangleArea(lengthRectangle, widthRectangle);
        System.out.println("Area of the rectangle: " + areaRectangle);

        scanner.close();
    }

  
    public static double TriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

 
    public static double RectangleArea(double length, double width) {
        return length * width;
    }
}
