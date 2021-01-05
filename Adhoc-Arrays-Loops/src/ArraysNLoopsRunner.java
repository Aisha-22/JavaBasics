import java.text.DecimalFormat;

public class ArraysNLoopsRunner {
    public static void main (String [] args) {

        ChromeDriver driver = new ChromeDriver("http:www.construct.com");
//        driver.url = "http://wwww.web.com";
//        driver.get("http://batway.com");
        driver.get(driver.url);

        driver.findElementBy("Aisha");

        ArraysNLoops arraysNLoops = new ArraysNLoops();

//        arraysNLoops.printArray();
//        arraysNLoops.numberOfItemsInArray;

        /* Create two objects using constructor */
//         Car car = new Car();
//         car.numberOfDoors = 4;
//         car.gearbox = "Automatic";
//         car.name = "Volvo";
//        car.color = "Black";
//
//        System.out.println("The " + car.name + " is " + car.color + " has " + car.gearbox + " transmission" + " and is a " + car.numberOfDoors + " doors ");
//        car.move("Simmonds");
//
//        Car carTwo = new Car();
//        carTwo.numberOfDoors = 2;
//        carTwo.gearbox = "Manual";
//        carTwo.name = "Lexus";
//        carTwo.color = "White";
//
//        System.out.println("The " + carTwo.name + " is " + carTwo.color + " has " + carTwo.gearbox + " transmission" + " and is a " + carTwo.numberOfDoors + " doors ");
//        carTwo.move("Grayston");
//
//        car.createSalesPitch();

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
        System.out.println("I stay in a " + house.houseType + " with a " + house.kitchen + " Kitchen unit. " + " It has " + house.numberOfBedroom + "Bedrooms, " + " and " + house.numberOfBathroom + "Bathrooms with " + house.numberOfGarageDoors + "garage doors.");
        //Call a class method as follows
        house.area("Sandton");

        house.duration();

        // Create an object of class House2 (This will call the constructor)
        House2 house2 = new House2("6 Bedroom", "Double Storey", "3 Bathrooms", 400.50, 4);
        // Print the values
        System.out.println(String.format("This is a %s %s house that has a size of %sm2 big enough to park %s cars and it has %s",house2.numberOfBedrooms, house2.houseType, house2.squareMeters, house2.garages, house2.numberOfBathrooms) );

        // Create an object of class Imoto (This will call the constructor)
        Imoto imoto = new Imoto("Polo", "Blue", "Manual", 4, 2019, 1.5);
        // Print the values
        System.out.println(String.format("I drive a %sDoor %s %s the model of the car is a %s model and it's a %sl.",imoto.numberOfDoors, imoto.color, imoto.name, imoto.yearOfModel, imoto.litters));

        RelationShip relationship = new RelationShip("Believe", "Happy", "Faithfully", "Talk", "Lover");
        System.out.println(String.format("%s in your relationship and it will grow %s the key is to always %s, always make sure that your %s is %s!", relationship.trust, relationship.openness, relationship.communication, relationship.love, relationship.care));
    }
}
