package com.baczewski.patterns.behavior.templateMethod.interf;

interface Printer {

    void getInk();

    void loadPaper();

    void prepareDocument();

    void printDocument();

    default void print() {
        prepareDocument();
        loadPaper();
        getInk();
        printDocument();
    }

}
