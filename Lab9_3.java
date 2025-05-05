interface Draw {
    void draw();
}

interface Shape extends Draw {
    void shapeType();
    double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }

    public void shapeType() {
        System.out.println("Shape Type: Rectangle");
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;
    private final double PI = 3.14159;

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle...");
    }

    public void shapeType() {
        System.out.println("Shape Type: Circle");
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

class Square implements Shape {
    private double length;
    private double width;

    Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void draw() {
        System.out.println("Drawing a Square...");
    }

    public void shapeType() {
        System.out.println("Shape Type: Square");
    }

    public double calculateArea() {
        return length * width;
    }
}

public class Lab9_3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        Square square = new Square(4, 4);

        rectangle.draw();
        rectangle.shapeType();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println();

        circle.draw();
        circle.shapeType();
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println();

        square.draw();
        square.shapeType();
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
