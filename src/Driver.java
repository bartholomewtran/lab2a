import java.util.Scanner;


/*
Assignment 2a
Personal Information Class

1. DESIGN
*/

public class Driver {
    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args)
    {
        Driver d1 = new Driver();
        Person Stacey = d1.readValue();
        Stacey.print();
        Person Ross = d1.readValue();
        Ross.print();
        Person Mia = d1.readValue();
        Mia.print();
    }
    public Person readValue() {
        //use methods in Scanner to read values - create a Person object and return it.
        Scanner input = new Scanner(System.in);
        System.out.println("Write a name:");
        String name = input.nextLine();
        System.out.println("Write an address:");
        String address = input.nextLine();
        System.out.println("Write an age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Write a phone number:");
        String phone_number = input.nextLine();
        return new Person(name, address, age, phone_number);
    }


}

/*
Design
Variables, Input, Processing and Output.


Submit a class diagram, test runs and code (.java file) with your submission.
Please create a zip file and submit a single attachment for part 1.




class definition (blueprint) --> object

class anatomy (internal structure)
 --instance variables
 --static variables
 --constructors
 --instance methods
 ----getters/setters
 ----business methods (calculations)
 ----print()
 --static methods - usually update static variables [will not be used to update values of
instance variables] -- because static methods can be used without creating an object.


        **********************************************************
Java coding standards
writing a class -
Class name should start with an upper case letter.
class should always be public
Must include a default constructor.
All instance variables (properties) must be private
All methods must be public.
Class anatomy - instance variables, static variables, constructors, getter and setters, instance methods, static methods.
Driver (class with a main method) should be in its own class.
Every class must have a print method that can print the values of instance variables.
One class per .java file
**********************************************************\

 */