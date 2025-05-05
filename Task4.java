// File: Task4.java

public class Task4 {

    // Abstract class representing a general shape
    abstract class Shape {
        public static double pi = 3.14;  // Constant value for PI
        protected float height;
        protected float width;

        // Abstract method to be implemented by all subclasses
        abstract float area();
    }

    // Square class that extends Shape and implements area calculation
    class Square extends Shape {
        // Constructor to initialize dimensions
        Square(float h, float w) {
            height = h;
            width = w;
        }

        // Implementing the area method for square
        float area() {
            return height * width;
        }
    }

    // Rectangle class extending Shape
    class Rectangle extends Shape {
        Rectangle(float h, float w) {
            height = h;
            width = w;
        }

        float area() {
            return height * width;
        }
    }

    // Circle class extending Shape but using a separate radius field
    class Circle extends Shape {
        float radius;

        Circle(float r) {
            radius = r;
        }

        float area() {
            return (float)(pi * radius * radius);
        }
    }

    // Main method to test the area methods
    public static void main(String[] args) {
        // Need to create an instance of Task4 to access inner classes
        Task4 obj = new Task4();

        // Creating objects of inner classes
        Square sObj = obj.new Square(5, 5);
        Rectangle rObj = obj.new Rectangle(5, 7);
        Circle cObj = obj.new Circle(2);

        // Displaying areas
        System.out.println("Area of Square: " + sObj.area());
        System.out.println("Area of Rectangle: " + rObj.area());
        System.out.println("Area of Circle: " + cObj.area());
    }
}
