import java.util.Scanner;

public class SquareMission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] userNumbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        for (int number : userNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int[] squaredNumbers = squareThem(userNumbers);
        System.out.println("Squared elements:");
        for (int number : squaredNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] squareThem(int[] array) {
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        return squaredArray;
    }
}
