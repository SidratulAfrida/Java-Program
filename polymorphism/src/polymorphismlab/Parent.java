package polymorphismlab;

class Parent {
	 
    // Method of parent class
    void Print()
    {
 
        // Print statement
        System.out.println("parent class");
    }
}
class subclass1 extends Parent {
	 
    // Method
    void Print() { System.out.println("From Childclass one"); }
}
class subclass2 extends Parent {
	 
    // Method
    void Print()
    {
 
        // Print statement
        System.out.println("From Childclass two");
    }
}