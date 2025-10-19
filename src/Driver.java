/*
Bartholomew Tran
F25 CIS D035A 11Y, 62Z Java Programming
Assignment 2A
Due Date: October 19, 2025
Date Submitted: October 19, 2025
*/

import java.util.Scanner;


/*
Assignment 2a
Personal Information Class

1. DESIGN

The objective of this project is to create a database to hold people's identifying information.
It is designed for us to practice with classes.
For this particular exercise, we will limit the database size to 3 individuals, codenamed alpha,
bravo, and charlie.

Each person will have their data inputted through the scanner.
There are two classes: Driver and Person. Driver will be what calls the methods in Person to
input, store, and display data.

Driver has 2 methods: main and readValue. Main provides the commands on how the program is to run.
readValue is in charge of recording data that will be collected in Person class and then displayed
through a method in Person.


2. VARIABLES pt1

The main variables here are the identifiable information:

    string name
    string address
    int age
    string phone_number

These are designed and then implemented in Person class.

*/

/*

3. PROCESSING pt1

This is the processing of the main method in the Driver class. It's telling the program
to perform the same tasks as outlined in readValue and Person per person.

 */
public class Driver {
    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args)
    {
        Driver d1 = new Driver();
        // test cmd
        Person alpha = d1.readValue();
        alpha.print();
        Person bravo = d1.readValue();
        bravo.print();
        Person charlie = d1.readValue();
        charlie.print();
    }

/*

4. INPUT

The input is the scanner that will allow the user to input identifiable data in a
sequence.

 */
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

5. PRINT

The data is printed through calling the public void print() method, which is part of the Person class.
Check notes in Person. The method will specify which data is needed to be called, so in this case, it
will be the name, address, age, and phone number data.

 */

/*
OUTPUT

Write a name:
alfa
Write an address:
alpha point - 12
Write an age:
3
Write a phone number:
344344344344
---------------------------------------------
This is the data of the person you entered:

Name: alfa
Address: alpha point - 12
Age: 3
Phone: 344344344344
----------------------------------------------

Write a name:
bravo
Write an address:
bravo point 24
Write an age:
4
Write a phone number:
488488488488488
---------------------------------------------
This is the data of the person you entered:

Name: bravo
Address: bravo point 24
Age: 4
Phone: 488488488488488
----------------------------------------------

Write a name:
charlie
Write an address:
charlie point - 36
Write an age:
5
Write a phone number:
122122122122122
---------------------------------------------
This is the data of the person you entered:

Name: charlie
Address: charlie point - 36
Age: 5
Phone: 122122122122122
----------------------------------------------

 */