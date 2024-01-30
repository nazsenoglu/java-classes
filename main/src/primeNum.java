import java.util.Scanner;

public class primeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int size = scanner.nextInt();
        int[] userList = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter a number:");
            int num = scanner.nextInt();
            userList[i] = num;
        }

        for (int num : userList) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
