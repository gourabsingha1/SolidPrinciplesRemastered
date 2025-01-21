package org.example.dependencyinversionprinciple.baddesign;

public class DesktopComputer {
    private WiredKeyboard keyboard;

    public DesktopComputer() {
        this.keyboard = new WiredKeyboard(); // Directly depends on a concrete class
    }

    public void use() {
        keyboard.type();
    }
}
