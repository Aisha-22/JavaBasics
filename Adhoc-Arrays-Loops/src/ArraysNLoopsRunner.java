import java.text.DecimalFormat;

public class ArraysNLoopsRunner {
    public static void main (String [] args) {
        ArraysNLoops arraysNLoops = new ArraysNLoops();

//        arraysNLoops.printArray();
//        arraysNLoops.numberOfItemsInArray;

        /* Create two objects using constructor */
         Car car = new Car();
         car.numberOfDoors = 4;
         car.gearbox = "Automatic";
         car.name = "Volvo";
        car.color = "Black";

        System.out.println("The " + car.name + " is " + car.color + " has " + car.gearbox + " transmission" + " and is a " + car.numberOfDoors + " doors ");
        car.move("Simmonds");

        Car carTwo = new Car();
        carTwo.numberOfDoors = 2;
        carTwo.gearbox = "Manual";
        carTwo.name = "Lexus";
        carTwo.color = "White";

        System.out.println("The " + carTwo.name + " is " + carTwo.color + " has " + carTwo.gearbox + " transmission" + " and is a " + carTwo.numberOfDoors + " doors ");
        carTwo.move("Grayston");

        car.createSalesPitch();

       //Implementation of a class
        Person person = new Person();
        //Creating a Property
        person.name = "Aisha";
        person.surname = "Green";
        person.race = "African";
        /* Trying to return a number with two decimals (1.5) as the height.
        int text;
        Double number = Double.valueOf(1.5);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String height = decimalFormat.format(number);*/
        person.age = 25;

        System.out.println("Hello my name is " + person.name + " "  + person.surname + " I am " + person.race + " and I am " + person.age + " years old.");
        person.talk("French");

        person.listenToSpeaker();

        /*
        Creating an Object:
        Class provides the blueprints for objects. So basically, an object is created from a class. In Java, the new keyword is used to create new objects.
        Example - Declaration Instantiation Instantiation
         */
        //Creating an object
        House house = new House();
        //Call a variable as follows
        house.houseType = "Duplex";
        house.kitchen = "White";
        house.numberOfBathroom = 2;
        house.numberOfBedroom = 3;
        house.numberOfGarageDoors = 2;

        //Another way of access instance variable
        System.out.println("I stay in a " + house.houseType + " with a " + house.kitchen + " Kitchen unit. " + " It has " + house.numberOfBedroom + "Bedrooms, " + " and " + house.numberOfBathroom + "Bathrooms with " + house.numberOfGarageDoors + "garage doors." );
        //Call a class method as follows
        house.area("Sandton");

        house.duration();


    }
}
