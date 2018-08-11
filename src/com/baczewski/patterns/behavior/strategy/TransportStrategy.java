package com.baczewski.patterns.behavior.strategy;

interface TransportStrategy {
    int getTime(String from, String to);

    int roadLength(String from, String to);
}
