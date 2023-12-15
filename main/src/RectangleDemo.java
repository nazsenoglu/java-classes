import java.util.Scanner;
import Rectangle;

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rectangle 1:");
        System.out.print("Enter length: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width1 = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(length1, width1);
        System.out.println("Area: " + rectangle1.calculateArea());

        System.out.println("\nRectangle 2:");
        System.out.print("Enter length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width2 = scanner.nextDouble();
        Rectangle rectangle2 = new Rectangle(length2, width2);
        System.out.println("Area: " + rectangle2.calculateArea());

        scanner.close();
    }
}
