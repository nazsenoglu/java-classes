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
        for (int i = 0; i < size; i++) {
            if (isPrime(userList[i])) {
                System.out.println(userList[i] + "is a prime number");
            } else {
                System.out.println(userList[i] + "is not a prime number");
            }

        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}
