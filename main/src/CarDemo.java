import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + ":");
            System.out.print("Enter make: ");
            String make = scanner.next();

            System.out.print("Enter model: ");
            String model = scanner.next();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            cars[i] = new Car(make, model, year);

            System.out.println();
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars[i].displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}
