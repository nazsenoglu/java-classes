import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number for the array");
            array[i] = scanner.nextInt();
        }
        System.out.println("The average of the array is " + findAverage(array));
        System.out.println("The odd numbers");
        findOdd(array);
        System.out.println("The even numbers");
        findEven(array);
    }

    public static double findAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }

    public static void findEven(int[] array) {
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void findOdd(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

