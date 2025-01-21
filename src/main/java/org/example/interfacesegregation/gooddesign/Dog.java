package org.example.interfacesegregation.gooddesign;

public class Dog implements Eater, Swimmer {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
