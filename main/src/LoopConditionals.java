import java.util.Scanner;

public class LoopConditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sumResult = 0;
        int divisibleByThree = 0;

        for (int i = 0; i <= n; i += 2) {
            sumResult += i;
        }
        scanner.close();

        System.out.println("Sum of even numbers: " + sumResult);

        for (int j = 3; j <= n; j += 3) {
            divisibleByThree++;
        }

        System.out.println("Count of numbers divisible by 3: " + divisibleByThree);
    }
}