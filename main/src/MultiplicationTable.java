import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int enteredNumber = scanner.nextInt();
        System.out.println("Below is the table from 1 to " + enteredNumber);

        for (int i = 1; i <= enteredNumber; i++) {
            for (int j = 1; j <= enteredNumber; j++) {

                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
