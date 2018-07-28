package com.baczewski.patterns.creational.factoryMethod;

public class Cat implements Animal {
    @Override
    public void makeASound() {
        System.out.println("Maiu miau");
    }
}
