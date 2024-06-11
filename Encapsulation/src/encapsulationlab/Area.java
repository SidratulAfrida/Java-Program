package encapsulationlab;

class Rectangle {
    private int length;
    private int breadth;

    // constructor to initialize values
    public Rectangle(int length, int breadth) {
        setLength(length);
        setBreadth(breadth);
    }

    // getter method for length
    public int getLength() {
        return length;
    }

    // setter method for length
    public void setLength(int length) {
        // You can add validation if needed
        this.length = length;
    }

    // getter method for breadth
    public int getBreadth() {
        return breadth;
    }

    // setter method for breadth
    public void setBreadth(int breadth) {
        // You can add validation if needed
        this.breadth = breadth;
    }

    // method to calculate area
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class Area {
    public static void main(String[] args) {

        // Creating a Rectangle object with length 2 and breadth 16
        Rectangle rectangle = new Rectangle(2, 16);

        // Accessing the area using the calculateArea() method
        rectangle.calculateArea();

        // Accessing length and breadth using getters
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Breadth: " + rectangle.getBreadth());
    }
}

