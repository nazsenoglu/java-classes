import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        int product;
        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                product = i * j;
                System.out.println(i + " x " + j + " = " + product);
            }
            System.out.println("");
        }

    }

}
