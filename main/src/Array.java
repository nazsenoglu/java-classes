
public class Array {

  public static void main(String[] args) {
    System.out.println("Intro to Arrays");

    int[] grades = new int[10];

    grades[0] = 60;
    grades[1] = 70;
    grades[2] = 80;

    int[] grades2 = { 60, 70, 80 };

    System.out.println(grades2[0]);

    System.out.println(grades[2]);

    String[] names = { "berra", "azra", "nihal" };

    System.out.println(names[0]);

    String[] names1 = new String[8];

    names1[0] = "nihal";
    names1[7] = "azra";
    names1[3] = "berra";

    System.out.println(names1[7]);

    int[] numbers = { 21, 2, 32, 45, 56, 87, 90, 91, 32, 44 };

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("index " + i + " is " + numbers[i]);
    }

  }
}
