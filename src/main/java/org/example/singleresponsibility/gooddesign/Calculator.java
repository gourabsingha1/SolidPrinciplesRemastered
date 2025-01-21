package org.example.singleresponsibility.gooddesign;

// Main class that uses the components
public class Calculator {
    private final ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    private final InputValidator inputValidator = new InputValidator();
    private final ResultLogger resultLogger = new ResultLogger();

    public int calculate(String operation, int a, int b) {
        inputValidator.validateNumbers(a, b);
        int result = switch (operation) {
            case "add" -> arithmeticOperations.add(a, b);
            case "subtract" -> arithmeticOperations.subtract(a, b);
            case "multiply" -> arithmeticOperations.multiply(a, b);
            case "divide" -> arithmeticOperations.divide(a, b);
            default -> throw new IllegalArgumentException("Unsupported operation: " + operation);
        };
        resultLogger.logResult(operation, result);
        return result;
    }
}
