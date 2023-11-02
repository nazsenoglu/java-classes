import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");

        int myNum = input.nextInt();
        while (myNum < 0) {
            System.out.println("Please enter a  positive number");
            myNum = input.nextInt();
        }

        int result = 1;

        for (int i = 1; i < myNum; i++) {
            result = result * i;
        }
        input.close();
        System.out.println("The factorial of" + myNum + ":" + result);
    }
}
