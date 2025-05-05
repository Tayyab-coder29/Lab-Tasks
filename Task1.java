public class Task1 {

    // Abstract class 'Parent' with an abstract method 'sum'
    abstract static class Parent {
        // This method must be implemented by any concrete subclass
        abstract int sum(int a, int b);
    }

    // Abstract class 'Child' inherits from 'Parent'
    abstract static class Child extends Parent {
        // No implementation provided here — still abstract
        // Could add additional abstract or concrete methods if needed
    }

    // Concrete class 'Child1' extends abstract class 'Child'
    static class Child1 extends Child {
        // Implementation of the abstract method 'sum'
        int sum(int a, int b) {
            return a + b;
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of 'Child1'
        Child1 c1 = new Child1();

        // Calling the 'sum' method and printing the result
        System.out.println(c1.sum(10, 20)); // Output: 30
    }
}
