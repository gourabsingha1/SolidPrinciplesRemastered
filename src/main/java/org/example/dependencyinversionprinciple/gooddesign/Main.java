package org.example.dependencyinversionprinciple.gooddesign;

public class Main {
    public static void main(String[] args) {
        Keyboard wiredKeyboard = new WiredKeyboard();
        DesktopComputer computerWithWired = new DesktopComputer(wiredKeyboard);
        computerWithWired.use();

        Keyboard wirelessKeyboard = new WirelessKeyboard();
        DesktopComputer computerWithWireless = new DesktopComputer(wirelessKeyboard);
        computerWithWireless.use();
    }
}
