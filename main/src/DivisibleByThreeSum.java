import java.util.Scanner;

public class DivisibleByThreeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter whole numbers (enter 0 to stop):");

        do {
            number = scanner.nextInt();
            if (number % 3 == 0) {
                sum += number;
            }
        } while (number != 0);

        scanner.close();
        System.out.println("Sum of numbers divisible by 3: " + sum);
    }
}
