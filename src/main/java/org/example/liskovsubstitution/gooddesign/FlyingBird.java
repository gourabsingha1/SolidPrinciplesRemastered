package org.example.liskovsubstitution.gooddesign;

// Flying birds subclass
abstract class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}
