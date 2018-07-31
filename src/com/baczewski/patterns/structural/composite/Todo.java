package com.baczewski.patterns.structural.composite;

public class Todo implements Viewable {

    private final String value;

    Todo(String value) {
        this.value = value;
    }

    @Override
    public String getContent() {
        return value;
    }

}
