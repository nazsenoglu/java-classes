public class BankAccount {
    public static void main(String[] args) {
        double initialAmount = 100;
        double interestRate = 0.05;

        double currentAmount = initialAmount;
        int years = 0;

        while (currentAmount < 2 * initialAmount) {
            currentAmount += currentAmount * interestRate;
            years++;
        }
        System.out.println("It will take " + years + " years to double the initial amount of $" + initialAmount);
    }
}