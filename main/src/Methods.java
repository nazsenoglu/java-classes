
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        greetings();
        addNums(4, 3);
        addNums(12, 13);
        addNums(22, 1467);
    }

    public static void addNums(int num1, int num2) {
        System.out.println("The addition is: " + (num1 + num2));
    }

    public static void greetings() {
        System.out.println("Welcome to my calculator");
        System.out.println("Enter two numbers to find the total");
        System.out.println("I am calling addnum below:");
        addNums(10, 9);
    }
}
