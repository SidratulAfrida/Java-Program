package inheritencelab;

// Base or Super Class
class Employee {
    int salary = 60000;
}

// Inherited or Sub Class
class Engineer extends Employee {
    int benefits = 10000;
}

// Driver Class
public class Gfg {
    public static void main(String args[]) {
        // Creating an instance of the Engineer class
        Engineer E1 = new Engineer();
        
        // Accessing the members of both the Employee and Engineer classes
        System.out.println("Salary: " + E1.salary +
                           "\nBenefits: " + E1.benefits);
    }
}
