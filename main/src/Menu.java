import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Magnolia Restaurant.");

        do {
            System.out.println("Press 1 for breakfast, 2 for lunch, and 3 for dinner. Enter 0 to end the program.");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    breakfastMenu();
                    break;
                case 2:
                    lunchMenu();
                    break;
                case 3:
                    dinnerMenu();
                    break;
                case 0:
                    System.out.println("Thank you for visiting our restaurant!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void breakfastMenu() {
        System.out.println("Breakfast menu:");
        System.out.println("Avocado toast");
        System.out.println("Granola bowl");
        System.out.println("Buttermilk Pancakes");
        System.out.println("Eggs Florentine");
    }

    public static void lunchMenu() {
        System.out.println("Lunch menu:");
        System.out.println("Stroganoff");
        System.out.println("Fried Shrimp");
        System.out.println("Tomato Soup");
        System.out.println("Ceaser Salad");
    }

    public static void dinnerMenu() {
        System.out.println("Dinner menu:");
        System.out.println("Meatballs with rice");
        System.out.println("Baked Salmon");
        System.out.println("Pasta Alfredo");
        System.out.println("Steak Tartare");
    }
}
