import java.util.Scanner;

public class Practice 1 Q3{
   public class

    void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your score");
        double score = userInput.nextDouble();

        String letter;
        if (score >= 90) {
            letter = "A";
            System.out.println("Your grade is an" + letter);
        } else if (score >= 80 && score < 90) {
            letter = "B";
            System.out.println("Your grade is an" + letter);
        } else if (score >= 70 && score < 80) {
            letter = "C";
            System.out.println("Your grade is an" + letter);
        } else if (score >= 60 && score < 70) {
            letter = "D";
            System.out.println("Your grade is an" + letter);
        } else {
            letter = "F";
            System.out.println("Your grade is an" + letter);
        }
}
