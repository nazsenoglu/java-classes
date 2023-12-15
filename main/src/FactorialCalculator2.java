import java.util.Scanner;

public class FactorialCalculator2 {
    public static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);

        scanner.close();
    }
}
