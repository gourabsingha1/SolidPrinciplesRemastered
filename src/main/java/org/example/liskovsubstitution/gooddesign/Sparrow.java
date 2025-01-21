package org.example.liskovsubstitution.gooddesign;

// Specific bird classes
class Sparrow extends FlyingBird {
    @Override
    public void move() {
        fly();
    }
}
