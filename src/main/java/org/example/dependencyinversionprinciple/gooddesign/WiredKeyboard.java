package org.example.dependencyinversionprinciple.gooddesign;

// Low-level module: WiredKeyboard
public class WiredKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with a wired keyboard...");
    }
}
