package com.dvana.Bridge;

public class SimpleCar extends Car{
    public SimpleCar(Combustible combustible) {
        super(combustible);
    }

    @Override
    public void getType() {
        System.out.println("Simple car has configuration for: ");
        combustible.hasCombustible();
    }
}
