package com.baczewski.patterns.creational.singleton;

public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton INSTANCE;
    private final String value;

    private LazyDoubleCheckSingleton(){
        this.value = "jakas wartosc";
    }
    public static LazyDoubleCheckSingleton getInstance(){
        if (INSTANCE == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
