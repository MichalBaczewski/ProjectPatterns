package com.baczewski.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class AmericanVehicleBuilder implements VehicleBuilder {

    private List<Wheel> wheels = new ArrayList<>();
    private int tankSize;

    public VehicleBuilder addWheel() {
        wheels.add(new Wheel(27));
        return this;
    }

    public VehicleBuilder setTank(int size) {
        tankSize = size;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(tankSize, wheels);
    }
}
