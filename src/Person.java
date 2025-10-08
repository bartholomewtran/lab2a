
// to create
public class Person {
    private String name;
    private String address;
    private int age;
    private String phone_number;
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
