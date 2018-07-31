package com.baczewski.patterns.structural.facade.client;

import com.baczewski.patterns.structural.facade.Facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        String s = facade.showProject("Marzenia", "iphone", "macbook pro", "porshe");
        System.out.println(s);
    }

}
