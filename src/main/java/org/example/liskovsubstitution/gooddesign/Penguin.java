package org.example.liskovsubstitution.gooddesign;

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Swimming...");
    }
}
