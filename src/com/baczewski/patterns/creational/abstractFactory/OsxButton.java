package com.baczewski.patterns.creational.abstractFactory;

public class OsxButton implements Button {
    @Override
    public void click() {
        System.out.println("Jestes bogoatyi i klikneles w ladny przycisk");
    }

    @Override
    public void show() {
        System.out.println("Jestem ładnym przyciskiem");
    }
}
