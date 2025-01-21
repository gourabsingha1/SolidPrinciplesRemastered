package org.example.dependencyinversionprinciple.gooddesign;

// High-level module: DesktopComputer
class DesktopComputer {
    private Keyboard keyboard;

    // Dependency injection via constructor
    public DesktopComputer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void use() {
        keyboard.type();
    }
}
