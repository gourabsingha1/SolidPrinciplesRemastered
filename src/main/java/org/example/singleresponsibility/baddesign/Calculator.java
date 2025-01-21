package org.example.singleresponsibility.baddesign;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public void validateNumbers(int... numbers) {
        for (int number : numbers) {
            if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Number is out of valid range.");
            }
        }
    }

    public void logResult(String operation, int result) {
        System.out.println("Operation: " + operation + ", Result: " + result);
    }
}

