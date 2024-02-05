import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to cart.");
    }

    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " removed from cart.");
        } else {
            System.out.println(item + " not found in cart.");
        }
    }

    public void listCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Cart items:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. List Cart\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name to add: ");
                    cart.addItem(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    cart.removeItem(scanner.nextLine());
                    break;
                case 3:
                    cart.listCart();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    continueShopping = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
