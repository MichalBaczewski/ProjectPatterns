package com.baczewski.patterns.behavior.visitor;

interface Customer {
    String getName();
    void accept(Taxi taxi);
}
