public class Book {
    private String title;
    private String author;
    private int year;
    private double price;
    private static int counter = 0;
    private int bookNumber;

    // constructor has the same name as class, it is invoked directly when a new
    // object is created, each time new object created, count increases and it
    // defines the bookNumber
    public Book() {
        counter++;
        bookNumber = counter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void displayDetails() {
        System.out.println("Book " + bookNumber + " Details:");
        System.out.println("Title: \"" + title + "\"");
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}
