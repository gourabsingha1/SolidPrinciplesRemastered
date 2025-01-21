package org.example.singleresponsibility.gooddesign;

// Separate class for logging results
public class ResultLogger {
    public void logResult(String operation, int result) {
        System.out.println("Operation: " + operation + ", Result: " + result);
    }
}
