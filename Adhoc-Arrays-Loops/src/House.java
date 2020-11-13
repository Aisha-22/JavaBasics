public class House {
//    A class is a blueprint from which individual objects are created.

    String houseType;
    String kitchen;
    int numberOfBedroom;
    int numberOfBathroom;
    int numberOfGarageDoors;

    //Declaring Array Variables
    String[] houseProperties = {"its an Estate", "it has a Tennis Court", "of the Gym", "of the Club House", "of the Pool" };

    /*
    Constructors:
    The main rule of constructors is that they should have the same name as the class. A class can have more than one constructor.
     */
    public void area(String location) {
        // This constructor has one parameter, name.
        System.out.println("I am located in " + location);
        //When do we use return?
    }

    public void duration() {
        //Create a counter
        //While: Repeats a statement or group of statements while a given condition is true. It tests the condition before executing the loop body.
        int i = 0;
        while(i < houseProperties.length) {
            System.out.println("I've been staying there for 5 years because " + houseProperties[i]);
            i++;
        }
    }
}
