import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score (0.0 - 100.0): ");
        double score = input.nextDouble();
        if (score > 90.0) {
            System.out.println("Grade: A");
        } else if (score > 80.0) {
            System.out.println("Grade: B");
        } else if (score > 70.0) {
            System.out.println("Grade: C");
        } else if (score > 60.0) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
            input.close();
        }
    }
}