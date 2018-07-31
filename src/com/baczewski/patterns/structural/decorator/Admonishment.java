package com.baczewski.patterns.structural.decorator;

public class Admonishment extends FineDecorator {

    Admonishment(Viewable viewable) {
        super(viewable);
    }

    @Override
    protected void showBefore() {
        System.out.println("~~UPOMNIENIE~~");
    }

    @Override
    protected void showAfter() {
        System.out.println("To tylko upomnienie. Nie przejmuj sie");
    }



}
