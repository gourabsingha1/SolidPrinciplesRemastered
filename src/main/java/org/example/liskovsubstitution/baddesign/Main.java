package org.example.liskovsubstitution.baddesign;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.fly();  // Works as expected
        penguin.fly();  // Throws exception, violating LSP
    }
}
