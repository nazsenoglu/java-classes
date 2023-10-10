import java.util.Scanner;

public class bankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double initialAmount = 100.0;
        double interestRate = 0.15;

        double totalAmount = initialAmount * Math.pow(1 + interestRate, years);

        System.out.println("Total money after " + years + " years: $" + totalAmount);

    }
}
