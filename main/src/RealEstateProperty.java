class RealEstateProperty {
    private String propertyType;
    private String location;
    private int sizeSquareFeet;
    private double priceUSD;

    public RealEstateProperty(String propertyType, String location, int sizeSquareFeet, double priceUSD) {
        this.propertyType = propertyType;
        this.location = location;
        this.sizeSquareFeet = sizeSquareFeet;
        this.priceUSD = priceUSD;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSizeSquareFeet(int sizeSquareFeet) {
        this.sizeSquareFeet = sizeSquareFeet;
    }

    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }

    public String getPropertyType() {
        return this.propertyType;
    }

    public String getLocation() {
        return this.location;
    }

    public int getSizeSquareFeet() {
        return this.sizeSquareFeet;
    }

    public double getPriceUSD() {
        return this.priceUSD;
    }

    public void displayPropertyDetails() {
        System.out.println("Type: " + this.propertyType);
        System.out.println("Location: " + this.location);
        System.out.println("Size: " + this.sizeSquareFeet + " sq.ft");
        System.out.println("Price: $" + this.priceUSD);
    }
}
