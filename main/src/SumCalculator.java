import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sumResult = 0;
        int i = 1;

        while (i <= n) {
            sumResult += i;
            i++;
        }
        scanner.close();

        System.out.println("The sum of all positive integers less than or equal to " + n + " is " + sumResult);
    }
}