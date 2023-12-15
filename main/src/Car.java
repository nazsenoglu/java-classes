import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Details: " + this.make + " " + this.model + " (" + this.year + ")");
    }
}
