import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            } else {
                sumEven += i;
            }
        }

        if (sumEven > sumOdd) {
            System.out.println("Even numbers rock!");
        } else if (sumOdd > sumEven) {
            System.out.println("Odd numbers rule!");
        } else {
            System.out.println("World is in balance with evens and odds.");
        }
        scanner.close();
    }
}
