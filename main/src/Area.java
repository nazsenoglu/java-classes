import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value 1: ");
        double value1 = scanner.nextDouble();

        System.out.print("Enter value 2: ");
        double value2 = scanner.nextDouble();

        System.out.print("Enter rectangle or triangle to find area: ");
        String shape = scanner.next();

        if (shape.equalsIgnoreCase("rectangle")) {
            double area = calculateRectangleArea(value1, value2);
            System.out.println("The area is: " + area);
        } else if (shape.equalsIgnoreCase("triangle")) {
            double area = calculateTriangleArea(value1, value2);
            System.out.println("The area is: " + area);
        } else {
            System.out.println("Invalid shape entered");
        }

        scanner.close();
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

}
