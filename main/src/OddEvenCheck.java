import java.util.Scanner;

public class OddEvenCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array with 6 elements
        int[] numbers = new int[6];

        // Input each element of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        // Display the array elements and check if they are odd or even
        for (int number : numbers) {
            System.out.println("Number: " + number + " is " + (isEven(number) ? "Even" : "Odd"));
        }

        scanner.close();
    }

    // Function to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Function to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
