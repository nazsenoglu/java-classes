import java.util.Scanner;

public class Practice1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a positive number");
        int myNum = input.nextInt();
        int result = 0;
        int i = 1;
        while (i <= myNum) {
            result += i;
            i++;
        }
        System.out.println("The sum is:" + result);
    }
}
