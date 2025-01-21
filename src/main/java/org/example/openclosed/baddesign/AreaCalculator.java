package org.example.openclosed.baddesign;

class AreaCalculator {
    public double calculateArea(String shape, double... dimensions) {
        if (shape.equalsIgnoreCase("Circle")) {
            double radius = dimensions[0];
            return Math.PI * radius * radius;
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            double length = dimensions[0];
            double width = dimensions[1];
            return length * width;
        } else {
            throw new IllegalArgumentException("Shape not supported");
        }
    }
}
