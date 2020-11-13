public class Person {
    String name;
    String surname;
    String race;
//    int height;
    int age;

    //    Arrayis a collection of Similar data type.
//    Creating a Property (Variable)
    String[] personsProperties = {"have Long hair", "have Brown eyes", "am Smart", "am good looking"};

//    Method to print the property (Action)
    public void talk(String language) {

        System.out.println("I can speak " + language);

    }

    public void listenToSpeaker() {
        //Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable.
        for(int i = 0; i < personsProperties.length; i++) {

            System.out.println("I " + personsProperties[i]);
        }
    }
}
