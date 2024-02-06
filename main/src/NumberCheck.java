import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number for element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array Elements and Their Sign:");
        for (int number : numbers) {
            System.out.print("Element: " + number + " is ");
            if (isPositive(number)) {
                System.out.println("Positive");
            } else if (isNegative(number)) {
                System.out.println("Negative");
            } else {
                System.out.println("Neither positive nor negative (it's zero)");
            }
        }

        scanner.close();
    }
}
