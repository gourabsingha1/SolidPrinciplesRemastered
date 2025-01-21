package org.example.interfacesegregation.baddesign;

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Birds cannot swim");
    }
}
