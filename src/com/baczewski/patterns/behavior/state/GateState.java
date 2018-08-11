package com.baczewski.patterns.behavior.state;

interface GateState {
    void pay(String cardNumber);
    boolean paymentOk();

}
