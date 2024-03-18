java
// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Concrete class Circle extending the Shape class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class Rectangle extending the Shape class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating and printing area of Circle
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Calculating and printing area of Rectangle
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
