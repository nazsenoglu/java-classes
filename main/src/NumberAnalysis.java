import java.util.Scanner;

public class NumberAnalysis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();

        int numbers[] = new int[count];

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("\n---------------------------------");
        System.out.println("Analysis Results:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        return ((double) sum) / numbers.length;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
