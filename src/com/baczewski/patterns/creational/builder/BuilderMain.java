package com.baczewski.patterns.creational.builder;

public class BuilderMain {

        public static void main(String[] args) {
            VehicleBuilder builder = new AmericanVehicleBuilder()
                    .addWheel().addWheel().addWheel().setTank(24);
            Vehicle build = builder.build();
            Vehicle build1 = builder.addWheel().setTank(50).build();
            System.out.println(build);
            System.out.println(build1);
        }

}
