// Create a House2 class
public class House2 {
    // Create a class attribute
    public String numberOfBedrooms;
    public String houseType;
    public String numberOfBathrooms;
    public Double squareMeters;
    public int garages;

    // Create a class constructor ( for the House2 class
    public House2(String numOfBedrooms, String typeOfHouse, String numOfBathrooms, Double sqMeters, int carPorts) {
        // Set the initial value for the class attributes
        this.numberOfBedrooms = numOfBedrooms;
        this.houseType = typeOfHouse;
        this.numberOfBathrooms = numOfBathrooms;
        this.squareMeters = sqMeters;
        this.garages = carPorts;
    }
}
