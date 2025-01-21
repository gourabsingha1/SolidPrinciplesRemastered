package org.example.singleresponsibility;

public class GeometryCalculations {
    public double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }
}
