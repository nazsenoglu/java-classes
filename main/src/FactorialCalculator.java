import java.util.Scanner;

public class FactorialCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    int factorialResult = 1;
    for (int i = 2; i <= n; i++) {
      factorialResult *= i;
    }
    scanner.close();
    System.out.println("The factorial of " + n + " is " + factorialResult);
  }
}
