package org.example.liskovsubstitution.gooddesign;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.move();  // Outputs: Flying...
        penguin.move();  // Outputs: Swimming...
    }
}
