package com.baczewski.patterns.structural.decorator;

public class Fine implements Viewable{

    private String reason;

    Fine(String reason) {
        this.reason = reason;
    }

    @Override
    public void show() {
        System.out.println("Popelniles wykroczenie:");
        System.out.println(reason);
    }

}
