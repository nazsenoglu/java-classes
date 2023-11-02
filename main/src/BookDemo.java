
public class BookDemo {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        // book1 setters
        book1.setTitle("The Catcher in the Rye");
        book1.setAuthor("J.D. Salinger");
        book1.setYear(1951);
        book1.setPrice(12.99);

        // book2 setters
        book2.setTitle("To Kill a Mockingbird");
        book2.setAuthor("Harper Lee");
        book2.setYear(1960);
        book2.setPrice(14.95);

        // display details
        book1.displayDetails();
        book2.displayDetails();

        // get author and display
        System.out.println("Author of Book 1: " + book1.getAuthor());

    }
}