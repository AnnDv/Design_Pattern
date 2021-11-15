package com.dvana.Bridge;

public class SportCar extends Car{
    public SportCar(Combustible combustible) {
        super(combustible);
    }

    @Override
    public void getType() {
        System.out.println("Sport car has configuration for: ");
        combustible.hasCombustible();
    }
}
