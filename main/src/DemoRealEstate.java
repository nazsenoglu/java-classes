
public class DemoRealEstate {
    public static void main(String[] args) {
        RealEstateProperty property1 = new RealEstateProperty("Apartment", "Downtown", 1200, 250000);
        RealEstateProperty property2 = new RealEstateProperty("House", "Suburb", 2000, 400000);

        System.out.println("Property 1 Details:");
        property1.displayPropertyDetails();

        System.out.println("\nProperty 2 Details:");
        property2.displayPropertyDetails();
    }
}
