package com.baczewski.patterns.creational.singleton;

public enum EnumSingleton {

    INSTANCE("jakas wartosc");
    private final String value;

    EnumSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
