package encapsulationlab;

public class Person {

    // private variables
    private String name;
    private int age;

    // constructor
    public Person() {
        // default constructor
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for age
    public int getAge() {
        return age;
    }

    // setter method for age
    public void setAge(int age) {
        // validate age (optional)
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        // person object created
        Person person = new Person();
        person.setName("Sidratul");
        person.setAge(70);

        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
