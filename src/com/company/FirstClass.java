package com.company;
import com.company.Methods;
import com.company.secondClass;

public class FirstClass {

    //    Printing numbers, in java numbers are verified in "integers".
   // static int a = 6; // Assigning 6 to the a.



//    Objects are instances of the classes

    public static void main(String[] args) {
	// write your code here

        //Note methods cannot be written inside the main block but should be written inside a class.
        //So an object needs to be created in main class, to access the methods and variables in the class.
        //Importance of classes and objects in Java.

        //objects are instances/references of a class

        Methods fn = new Methods(); //Memory located for the 'FirstClass' to write an object

        fn.getData(); //To access methods of the 'Method class'
        System.out.println(fn.a);

        secondClass sn = new secondClass();

        sn.setData(); // how you use objects in java to call variables and methods of they own classes

//        Write first executable program in java
//        Printing in the output
        System.out.println("Nouvelle Is turning");
        System.out.println("Age?");//String
        //System.out.println(a); // Variable: the value is present in the variable you don't need double quotes.

        //System.out.print("Aisha"); This will not print on the next line "ln" means printing on the next line.



    }
}
