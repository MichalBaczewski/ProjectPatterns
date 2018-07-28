package com.baczewski.patterns.creational.factoryMethod;

public class AnimalNameFactory implements AnimalFactory{
    private String name;

    public AnimalNameFactory(String name) {
        this.name = name;
    }

    public Animal createAnimal() {
        if("Reksio".equals(name)) {
            return new Dog();
        } else if ("Mruczek".equals(name)) {
            return new Cat();
        } else {
            return new OtherAnimal();
        }
    }

}
