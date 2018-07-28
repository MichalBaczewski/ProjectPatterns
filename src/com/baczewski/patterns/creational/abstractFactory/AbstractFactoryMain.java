package com.baczewski.patterns.creational.abstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        UiAbstractFactory factory = new OsxUiFactory();
        Button button = factory.getButton();
        button.show();
        Input input = factory.getInput();
        input.write("hej");
        input.write("hello world");
        System.out.println(input.getText());
    }
}