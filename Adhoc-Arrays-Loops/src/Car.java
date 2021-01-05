public class Car {

    //objects have properties and they have methods
    String color;
    String name;
    String gearbox;
    int numberOfDoors;

    String[] carsProperies = {"black", "Tesla", "self driving", "too hot", "a convertible", "super fast"};

    //Properties are actions what a car can do
    public void move(String direction) {
        System.out.println("Car is heading to " + direction);
    }

    public void createSalesPitch() {
        for (int i = 0; i < carsProperies.length; i++) {
            System.out.println("The car is " + carsProperies[i]);
        }
    }

}
