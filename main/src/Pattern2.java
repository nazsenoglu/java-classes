import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();

        printPattern(numRows);

        scanner.close();
    }

    public static void printPattern(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
