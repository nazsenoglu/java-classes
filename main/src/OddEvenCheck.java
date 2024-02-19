import java.util.Scanner;

public class OddEvenCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println("Number: " + number + " is " + (isEven(number) ? "Even" : "Odd"));
        }

        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
