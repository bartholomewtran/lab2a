
/*

1. VARIABLES pt2

These are the instance variables to be used in Person class. They are the same as the variables described in
Driver class. However, through the use of this constructor, we are making the instance variables private.
The reason is so that only this constructor (public class Person) has control over these instance variables.
Therefore, data inputted from readValue from Driver class will be brought to this class for processing.

 */
// to create
public class Person {
    private String name;
    private String address;
    private int age;
    private String phone_number;

/*

2. PROCESSING pt2

This is where the data is processed. The data will be cached into the instance variables through the
this.<variable> keyword. this.<variable> ensures that the specific instance variable is where the data
will be cached. After reassigning, the method will be called again in Driver class.

 */
//overloaded (to upload)
    public Person(String name, String address, int age, String phone_number) { //watch out for order
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone_number = phone_number;
    }

    public Person() {
    }

    //getter - setter (if want to edit data)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
/*

5. PRINT

The data is printed in this method. This method is called in the Driver class.

 */
    public void print() {
        System.out.printf("---------------------------------------------\n" +
                "This is the data of the person you entered:\n\n");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone_number);
        System.out.printf("----------------------------------------------\n\n");
    }
}
