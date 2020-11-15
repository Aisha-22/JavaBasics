//Created a Imoto Class
public class Imoto {
    //A class attribute
    public String name;
    public String color;
    public String gearbox;
    public int numberOfDoors;
    public int yearOfModel;
    public Double litters;

    // Create a class constructor for the Imoto class
    public Imoto(String make, String shade, String type, int numOfDoors, int whatYear, Double tank) {
        // Set the initial value for the class attributes
        this.name = make;
        this.color = shade;
        this.gearbox = type;
        this.numberOfDoors = numOfDoors;
        this.yearOfModel = whatYear;
        this.litters = tank;
    }
}
