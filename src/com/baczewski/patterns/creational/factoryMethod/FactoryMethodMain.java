package com.baczewski.patterns.creational.factoryMethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalNameFactory("Reksio");
        Animal animal = animalFactory.createAnimal();
        animal.makeASound();
    }
}
