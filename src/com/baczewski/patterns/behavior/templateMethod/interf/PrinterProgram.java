package com.baczewski.patterns.behavior.templateMethod.interf;

class PrinterProgram {
    public static void main(String[] args) {
        Printer printer = new MonochromaticPrinter();
        printer.print();
    }
}
