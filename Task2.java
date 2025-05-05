// File: Task2.java

public class Task2 {

    // Abstract class 'Base' with abstract methods
    abstract class Base {
        abstract void get(int a, int b);   // To take input values
        abstract void add();               // To perform addition
        abstract void display();           // To display result
    }

    // Subclass that extends abstract class and implements all methods
    class SubClass extends Base {
        int x, y, z;  // Data members to hold two numbers and their sum

        // Method to receive values
        void get(int a, int b) {
            x = a;
            y = b;
        }

        // Method to add the values
        void add() {
            z = x + y;
        }

        // Method to display the result
        void display() {
            System.out.println("Addition of two numbers is: " + z);
        }
    }

    // Main method inside the outer class
    public static void main(String[] args) {
        // To access inner non-static class, we need an instance of outer class
        Task2 outer = new Task2();
        SubClass obj = outer.new SubClass(); // Creating object of inner class

        obj.get(10, 20);  // Input values
        obj.add();        // Perform addition
        obj.display();    // Display result
    }
}
