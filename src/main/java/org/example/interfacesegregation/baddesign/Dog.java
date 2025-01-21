package org.example.interfacesegregation.baddesign;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Dogs cannot fly");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
