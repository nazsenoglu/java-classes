public class BiologicalSpecies {

    // bunlar private instance variables ornek degiskenler
    // private variablelar obje uzerinden method yardimi olmaksizin direkt
    // private keyword variable in scope unu (ulasim alanini) belirler
    // ulasilamazlar
    private String speciesName;
    private String classification;
    private String habitat;
    private int averageLifespan;
    private int populationSize;

    // constructor bir methoddur ve bu classtan bir obje cagirildigi zaman bu method
    // directly called
    // constructor in genel amaci olusturulan objenin ilk degerlerini vermektir
    // (set–
    // etmek) (initialization)
    // bir method un constructor oldugunu class ile ayni isimde olmasindan anlariz
    public BiologicalSpecies(String speciesName, String classification, String habitat, int averageLifespan,
            int populationSize) {
        // parameter dan aldigimiz speciesName i class inkine assign ediyoruz
        this.speciesName = speciesName;
        this.classification = classification;
        this.habitat = habitat;
        this.averageLifespan = averageLifespan;
        this.populationSize = populationSize;
    }

    // void bos demek, setter bir sey return etmedigi icin return data type is void
    // all methods have return data type, for ex: "void" here
    // (String speciesName) method un parameter idir
    // this.speciesName class in instance variable idir.
    // setter aldigi parameter i class in speciesName ine set eder
    // = assignment operator da sagdaki deger soldakine koyulur
    // this keyword bulundugu scope (ulasim alaninda) parent inin degerlerine
    // ulasmani saglar, burada this ile class variable ina ulasiriz
    // for ex: (this.speciesName)
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setAverageLifespan(int averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    // class icinde tanimlanan private instance variable larini objeden class disina
    // cagrilabilmesini saglayan methodlara getter diyoruz
    // public keyword method un disaridan ulasilmasini saglar
    // String, methodun return eden degerinin veri tipidir, bu ornekte speciesName
    // String oldugu icin method String tipli veriye doner
    public String getSpeciesName() {
        return this.speciesName;
    }

    public String getClassification() {
        return this.classification;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public int getAverageLifespan() {
        return this.averageLifespan;
    }

    public int getPopulationSize() {
        return this.populationSize;
    }

    public void updatePopulation(int populationSize) {
        this.populationSize = populationSize;
    }

    public void displaySpeciesDetails() {
        System.out.println("Species name: " + this.speciesName);
        System.out.println("Classification: " + this.classification);
        System.out.println("Habitat: " + this.habitat);
        System.out.println("Average lifespan: " + this.averageLifespan);
        System.out.println("Population size: " + this.populationSize);
        System.out.println("");
    }

    public static void main(String[] args) {

        // species1 bir objedir, class i new ile cagirarak objectler yapariz
        // yeni bir obje urettigimizde constructor method u ilk basta otomatik olarak
        // cagrilir. species1 methodu buradaki tanimlandigi degerlerle olusmus olur

        BiologicalSpecies species1 = new BiologicalSpecies("Panthera leo", "Mammal", "Savanna", 20, 2000);
        BiologicalSpecies species2 = new BiologicalSpecies("Elephant", "Mammal", "Terrestrial", 50, 5000000);

        System.out.println("Species 1 details:");
        // objenin yanina koyulan nokta isareti objenin kendisini tanimlayan class in
        // methodlarina ulasmamizi saglar
        // ojdeAdi.methodAdi()
        species1.displaySpeciesDetails();

        System.out.println("Species 2 details:");
        species2.displaySpeciesDetails();

        System.out.println("Updating Population for Species 1...");
        System.out.println("Species 1 Details (Updated):");
        species1.setPopulationSize(4000);
        species1.displaySpeciesDetails();
    }
}
