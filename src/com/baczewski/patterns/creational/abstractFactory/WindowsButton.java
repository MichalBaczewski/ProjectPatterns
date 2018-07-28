package com.baczewski.patterns.creational.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Nie dotykaj");
    }

    @Override
    public void show() {
        System.out.println("Jestem przyciskiem z Windowsa");
    }
}
