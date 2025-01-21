package org.example.dependencyinversionprinciple.gooddesign;

// Low-level module: WirelessKeyboard
class WirelessKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with a wireless keyboard...");
    }
}
