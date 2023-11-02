import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int powerResult = 1;

        for (int i = 1; i <= exponent; i++) {
            powerResult *= base;
        }
        System.out.println("Result is " + powerResult);
        scanner.close();
    }
}