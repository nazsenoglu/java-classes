import java.util.Scanner;

public class StarPattern2 {

    public static void printPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();

        printPattern(numberOfRows);

        scanner.close();
    }
}
