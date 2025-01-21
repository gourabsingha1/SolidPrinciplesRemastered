package org.example.singleresponsibility;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        GeometryCalculations geometry = new GeometryCalculations();

        // Arithmetic operations
        double sum = arithmetic.add(10, 20);
        double product = arithmetic.multiply(10, 5);
        double quotient = arithmetic.divide(10, 2);

        // Geometric calculations
        double circleArea = geometry.calculateAreaOfCircle(5);
        double rectanglePerimeter = geometry.calculatePerimeterOfRectangle(10, 5);

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
    }
}

