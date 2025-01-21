package org.example.singleresponsibility.gooddesign;

// Separate class for input validation
class InputValidator {
    public void validateNumbers(int... numbers) {
        for (int number : numbers) {
            if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Number is out of valid range.");
            }
        }
    }
}
