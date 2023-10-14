import java.util.Scanner;

public class Exam3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number;

    do {
      System.out.print("Please enter a number: ");
      number = scanner.nextInt();

      if (number > 0) {
        if (number % 2 == 0) {
          System.out.println("This is a positive even number");
        } else {
          System.out.println("This is a positive odd number");
        }
      } else if (number < 0) {
        if (number % 2 == 0) {
          System.out.println("This is a negative even number");
        } else {
          System.out.println("This is a negative odd number");
        }
      }

    } while (number != 0);

    System.out.println("Program stops");
  }
}
